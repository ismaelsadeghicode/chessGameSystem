package com.chess.server;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AppServer {
    public static void main(String[] args) {
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
