package com.bakigoal.util;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by ilmir on 10.07.16.
 */
@Component
public class FileValidator implements Validator {
  @Override
  public boolean supports(Class<?> clazz) {
    return File.class.equals(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    File file = (File)target;
    if(file.getFile().getSize() == 0){
      errors.rejectValue("file", "valid.file");
    }
  }
}
