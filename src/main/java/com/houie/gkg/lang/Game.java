package com.houie.gkg.lang;

import java.util.Date;

/**
 * Created by houie on 8/1/2017.
 */
public class Game {

    private int id;
    private Team opponent;
    private Date date;

    public Game(int id, Team opponent, Date date) {
        this.id = id;
        this.opponent = opponent;
        this.date = date;
    }

    public int getId() {
        return this.id;
    }

    public Team getOpponent() {
        return this.opponent;
    }

    public Date getDate() {
        return this.date;
    }
}
