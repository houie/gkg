package com.houie.gkg.lang;

/**
 * Created by IntelliJ IDEA.
 * User: hhan
 * Date: 8/2/17
 * Time: 4:20 PM
 */
public class Selection {

  private int pick;
  private char share;
  private Shareholder shareholder;
  private int gameId;
  private char pair;
  private Team team;

  public Selection(int pick, char share, Shareholder shareholder, int gameId, char pair, Team team) {
    this.pick = pick;
    this.share = share;
    this.shareholder = shareholder;
    this.gameId = gameId;
    this.pair = pair;
    this.team = team;
  }

  public int getPick() {
    return pick;
  }

  public void setPick(int pick) {
    this.pick = pick;
  }

  public char getShare() {
    return share;
  }

  public void setShare(char share) {
    this.share = share;
  }

  public Shareholder getShareholder() {
    return shareholder;
  }

  public void setShareholder(Shareholder shareholder) {
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
