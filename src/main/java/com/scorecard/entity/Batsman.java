package com.scorecard.entity;

import java.util.List;

public class Batsman extends Player{

    private Integer runs;
    private Integer balls;
    private Integer wicketSummary;

    public Batsman(String firstName, String lastName) {
        super(firstName, lastName);
        runs = 0;
        balls = 0;
        wicketSummary = null;
    }

    public Batsman(Integer id, String firstName, String lastName, String batHand, String bowlHand, PlayerStatistics statistics, List<Score> scores, Integer runs, Integer balls, Integer wicketSummary) {
        super(id, firstName, lastName, batHand, bowlHand, statistics, scores);
        this.runs = runs;
        this.balls = balls;
        this.wicketSummary = wicketSummary;
    }

    public Integer getRuns() {
        return runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    public Integer getBalls() {
        return balls;
    }

    public void setBalls(Integer balls) {
        this.balls = balls;
    }

    public Integer getWicketSummary() {
        return wicketSummary;
    }

    public void setWicketSummary(Integer wicketSummary) {
        this.wicketSummary = wicketSummary;
    }
}
