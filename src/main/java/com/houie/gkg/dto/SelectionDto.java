package com.houie.gkg.dto;

import com.houie.gkg.lang.Shareholder;

/**
 * Created by houie on 8/2/2017.
 */
public class SelectionDto {

    private String shareholder;
    private int gameId;

    public SelectionDto() {}

    public SelectionDto(String shareholder, int gameId) {
        this.shareholder = shareholder;
        this.gameId = gameId;
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
}
