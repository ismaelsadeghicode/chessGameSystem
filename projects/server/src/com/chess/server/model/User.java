package com.chess.server.model;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 2L;
    private static int counter = 0;

    private int id = counter;
    private String userName ;
    private String password ;
    private Image image;
    private boolean status;
    private boolean isDeleted = false;

    public User() {
        this.id = ++counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
