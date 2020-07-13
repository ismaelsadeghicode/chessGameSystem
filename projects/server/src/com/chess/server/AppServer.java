package com.chess.server;

import com.chess.server.controller.UserController;
import com.chess.server.model.User;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Enumeration;
import java.util.Properties;

public class AppServer {
    public static boolean statusUserFile = false;
    public static File tempUserFile;

    public static void main(String[] args) {
        String directoryFile = "";
        String userFile = "";
        Properties config = new Properties();
        try {
            config.load(new FileInputStream("resources/config.cfg"));
            Enumeration<Object> en = config.keys();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                if(key.equals("directoryFile")) {
                    directoryFile = (String)config.get(key);
                }
                if (key.equals("userFile")){
                    userFile = (String)config.get(key);
                }

            }

            File tempUserDirectory = new File(directoryFile);
            boolean existsUserDirectory = tempUserDirectory.exists();
            if(!existsUserDirectory){
                File userDirectory = new File(directoryFile);
                userDirectory.mkdir();
            }
            tempUserFile = new File(directoryFile, userFile);
            boolean existsUserFile = tempUserFile.exists();
            if(!existsUserFile){
                File userDirectory = new File(directoryFile, userFile);
                userDirectory.createNewFile();
            }
            if(tempUserFile.exists()){
                statusUserFile = true;
            }


            UserController userController = new UserController();
            User user = new User();
            user.setUserName("ali");
            user.setPassword("!@#$$$");
            userController.create(user);

            userController.find();



        } catch (IOException e) {
            e.printStackTrace();
        }


        try ( ServerSocket server = new ServerSocket(8888);
              Socket socket = server.accept() ;){

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String message = dis.readUTF();
            System.out.println("server message: " + message);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
