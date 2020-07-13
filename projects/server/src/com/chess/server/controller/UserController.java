package com.chess.server.controller;

import com.chess.server.AppServer;
import com.chess.server.model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserController {

    //create, delete, update, find
    public void create(User user) {
        User createUser = new User();
        createUser.setUserName(user.getUserName());
        createUser.setPassword(user.getPassword());
        createUser.setImage(user.getImage());
        try {
            if (AppServer.statusUserFile) {
                FileOutputStream fileOut = new FileOutputStream(AppServer.tempUserFile);
                ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
                objectOut.writeObject(user);
                objectOut.close();
                System.out.println("The User  was succesfully written to a file");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<User> find(){
        List<User> result = new ArrayList<>();
       try {
           FileInputStream fileIn = new FileInputStream(AppServer.tempUserFile);
           ObjectInputStream objectIn = new ObjectInputStream(fileIn);

       } catch (Exception e) {
           e.printStackTrace();
       }

       return result;

    }
}
