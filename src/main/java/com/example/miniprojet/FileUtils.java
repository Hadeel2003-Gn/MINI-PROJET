package com.example.miniprojet;

import java.io.File;

public class FileUtils {

    public static void createFileIfNotExist(String path) throws Exception {
        File f = new File(path);
        if (!f.exists()) {
            f.getParentFile().mkdirs();
            f.createNewFile();
        }
    }
}