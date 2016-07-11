package com.bakigoal.controller.util;

import com.bakigoal.util.File;
import com.bakigoal.util.FileValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by ilmir on 10.07.16.
 */
@Controller
@RequestMapping("/upload")
public class FileUploadController {

  @Autowired
  private FileValidator fileValidator;

  @InitBinder
  private void initBinder(WebDataBinder binder) {
    binder.setValidator(fileValidator);
  }

  @GetMapping
  public String getForm(Model model) {
    File fileModel = new File();
    model.addAttribute("file", fileModel);
    return "fileUploadForm";
  }

  @PostMapping
  public String fileUpload(Model model, @Validated File file, BindingResult bindingResult) {
    String returnVal = "fileUploadSuccess";
    if (bindingResult.hasErrors()) {
      return "fileUploadForm";
    }

    MultipartFile multipartFile = file.getFile();
    model.addAttribute("message", "Successfully uploaded file: "
        + multipartFile.getName()
        + ", " + multipartFile.getContentType()
        + "[" + multipartFile.getSize() + "]");

    return returnVal;
  }
}
