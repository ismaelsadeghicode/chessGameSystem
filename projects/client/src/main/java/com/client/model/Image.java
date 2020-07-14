package com.client.model;

import java.io.Serializable;

public class Image implements Serializable {
    private static final long serialVersionUID = 2L;
    private int id;
    private String name;
    private String patch;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatch() {
        return patch;
    }

    public void setPatch(String patch) {
        this.patch = patch;
    }
}
