package com.bakigoal.util;

import com.bakigoal.dao.entity.Image;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * Created by ilmir on 11.07.16.
 */
public class ImageUploader {


    public static Image upload(String saveDir, String name, MultipartFile file) {

        if (file != null && !file.isEmpty()) {
            try {
                java.io.File dir = new java.io.File(saveDir);
                if (!dir.exists()) {
                    boolean mkdirs = dir.mkdirs();
                    if (!mkdirs) {
                        throw new IOException("Can not create dir");
                    }
                }
                file.transferTo(new java.io.File(dir + "/" + name));
                Image image = new Image(dir + "/" + name, name);
                image.setNewSrc(name);
                return image;
            } catch (Exception e) {
                throw new RuntimeException("Product Image saving failed", e);
            }
        }
        return null;
    }
}
