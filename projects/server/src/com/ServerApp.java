package com;

import com.util.Handler;

import java.net.ServerSocket;

public class ServerApp {

    private static final int PORT = 9001;

    public static void main(String[] args) throws Exception {
        System.out.println("The chat server is running.");
        ServerSocket listener = new ServerSocket(PORT);

        try {
            while (true) {
                new Handler(listener.accept()).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            listener.close();
        }
    }

}
