package com.bakigoal.util;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by ilmir on 10.07.16.
 */
public class File {

  private MultipartFile file;

  public MultipartFile getFile() {
    return file;
  }

  public void setFile(MultipartFile file) {
    this.file = file;
  }
}
