package com.chess.server;

import com.chess.server.test.ServiceTest;
import com.chess.server.util.Handler;
import com.chess.server.util.Utility;

import java.net.ServerSocket;

public class AppServer {

    private static final int PORT = 8888;

    public static void main(String[] args) {
        Utility.checkAndCreateFileDirectory();
        ServiceTest.testUserController();
        ServerSocket listener;
        try {
            listener = new ServerSocket(PORT);
            while (true) {
                new Handler(listener.accept()).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
