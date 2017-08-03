package com.houie.gkg.dto;

import com.houie.gkg.lang.Team;

/**
 * Created by houie on 8/2/2017.
 */
public class SelectionDto {

    private int pick;
    private String shareholder;
    private int gameId;
    private char pair;
    private Team team;

    public SelectionDto() {}

    public int getPick() {
        return pick;
    }

    public void setPick(int pick) {
        this.pick = pick;
    }

    public String getShareholder() {
        return shareholder;
    }

    public void setShareholder(String shareholder) {
        this.shareholder = shareholder;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public char getPair() {
        return pair;
    }

    public void setPair(char pair) {
        this.pair = pair;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
