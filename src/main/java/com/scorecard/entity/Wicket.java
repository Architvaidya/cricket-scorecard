package com.scorecard.entity;

public class Wicket {

    private Player batsman;
    private Player bowler;
    private WicketType wicket;
    private String wicketSummar;

    public Wicket(Player batsman, Player bowler, WicketType wicket, String wicketSummar) {
        this.batsman = batsman;
        this.bowler = bowler;
        this.wicket = wicket;
        this.wicketSummar = wicketSummar;
    }

    public Player getBatsman() {
        return batsman;
    }

    public void setBatsman(Player batsman) {
        this.batsman = batsman;
    }

    public Player getBowler() {
        return bowler;
    }

    public void setBowler(Player bowler) {
        this.bowler = bowler;
    }

    public WicketType getWicket() {
        return wicket;
    }

    public void setWicket(WicketType wicket) {
        this.wicket = wicket;
    }

    public String getWicketSummar() {
        return wicketSummar;
    }

    public void setWicketSummar(String wicketSummar) {
        this.wicketSummar = wicketSummar;
    }
}
