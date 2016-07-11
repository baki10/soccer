package com.bakigoal.controller;

import com.bakigoal.dao.entity.Image;
import com.bakigoal.dao.entity.Stadium;
import com.bakigoal.service.SimpleService;
import com.bakigoal.service.StadiumService;
import com.bakigoal.util.ImageUploader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ilmir on 10.07.16.
 */
@Controller
@RequestMapping("/stadium")
public class StadiumController {

    @Autowired
    private StadiumService stadiumService;

    @Autowired
    private SimpleService simpleService;

    @RequestMapping("/{id}")
    public String getManager(@PathVariable("id") Long id, Model model) {
        Stadium stadium = stadiumService.getById(id);
        if (stadium == null) {
            throw new RuntimeException("Stadium with id = " + id + " not found!");
        }
        com.bakigoal.util.File file = new com.bakigoal.util.File();
        model.addAttribute("file", file);
        model.addAttribute("stadium", stadium);
        return "stadium";
    }

    @PostMapping("/{id}")
    public String updateStadium(@PathVariable("id") Long id, com.bakigoal.util.File file, HttpServletRequest request) {
        Stadium stadium = stadiumService.getById(id);
        if (stadium == null) {
            throw new RuntimeException("Stadium with id = " + id + " not found!");
        }
        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        String dir = rootDirectory + "/resources/images/stadiums";
        String name = id + ".png";
        simpleService.setEntityClass(Image.class);
        Image image = ImageUploader.upload(dir, name, file.getFile());
        if (image != null) {
            Image newImage = (Image) simpleService.add(image);
            stadium.setImage(newImage);
            stadiumService.update(stadium);
        }
        return "redirect:/stadium/" + id;
    }
}
