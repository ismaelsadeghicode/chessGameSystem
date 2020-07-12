package com.chess.server.model;

import java.util.Date;

public class Game {
    private int id ;
    private Date staetDate ;
    private Date endDate;
    private int whiteGamerId ;
    private int blackGamerId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStaetDate() {
        return staetDate;
    }

    public void setStaetDate(Date staetDate) {
        this.staetDate = staetDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getWhiteGamerId() {
        return whiteGamerId;
    }

    public void setWhiteGamerId(int whiteGamerId) {
        this.whiteGamerId = whiteGamerId;
    }

    public int getBlackGamerId() {
        return blackGamerId;
    }

    public void setBlackGamerId(int blackGamerId) {
        this.blackGamerId = blackGamerId;
    }
}
