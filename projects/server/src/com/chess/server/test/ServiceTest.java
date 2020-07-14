package com.chess.server.test;

import com.chess.server.controller.UserController;
import com.chess.server.model.User;

public class ServiceTest {

    public static void testUserController() {
        UserController userController = new UserController();
        User user = new User();
        user.setUserName("ali");
        user.setPassword("!@#$$$");
        userController.create(user);
        userController.find();
    }
}
