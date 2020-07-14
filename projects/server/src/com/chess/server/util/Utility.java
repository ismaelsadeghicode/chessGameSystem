package com.chess.server.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Utility {
    public static boolean statusUserFile = false;
    public static File pathUserFile;

    public static void checkAndCreateFileDirectory() {
        String directoryFile = "";
        String userFile = "";
        Properties config = new Properties();
        try {
            config.load(new FileInputStream("resources/config.cfg"));
            Enumeration<Object> en = config.keys();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                if (key.equals("directoryFile")) {
                    directoryFile = (String) config.get(key);
                }
                if (key.equals("userFile")) {
                    userFile = (String) config.get(key);
                }

            }
            File tempUserDirectory = new File(directoryFile);
            boolean existsUserDirectory = tempUserDirectory.exists();
            if (!existsUserDirectory) {
                File userDirectory = new File(directoryFile);
                userDirectory.mkdir();
            }
            pathUserFile = new File(directoryFile, userFile);
            boolean existsUserFile = pathUserFile.exists();
            if (!existsUserFile) {
                File userDirectory = new File(directoryFile, userFile);
                userDirectory.createNewFile();
            }
            if (pathUserFile.exists()) {
                statusUserFile = true;
            }
        } catch (IOException e) {
            System.out.printf("AppServer, check and create file Directory : IOException ");
            e.printStackTrace();
        }
    }
}
