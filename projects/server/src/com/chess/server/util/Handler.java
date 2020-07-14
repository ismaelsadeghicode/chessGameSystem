package com.chess.server.util;

import java.io.*;
import java.net.Socket;

public class Handler extends Thread {
    private String name;
    private Socket socket;
    private ObjectInputStream input;
    private OutputStream os;
    private ObjectOutputStream output;
    private InputStream is;

    public Handler(Socket socket) throws IOException {
        this.socket = socket;
    }

    public void run() {
        try {
            is = socket.getInputStream();
            input = new ObjectInputStream(is);
            os = socket.getOutputStream();
            output = new ObjectOutputStream(os);
            while (socket.isConnected()) {

            }

        } catch (Exception e) {

        } finally {
            closeConnections();
        }
    }

    private void closeConnections() {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (input != null) {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
