package com.scorecard.entity;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class Over {

    private Integer id = 0;
    private List<Score> scores;
    private Integer deliveries;
    @Autowired
    private Player bowler;


    public Over() {
        id++;
        deliveries = 0;
        scores = new ArrayList<Score>();
    }

    public Over(List<Score> scores, Integer deliveries, Player bowler) {
        this.scores = scores;
        this.deliveries = deliveries;
        this.bowler = bowler;
    }

    public void IncrementDeliveries(){
        deliveries++;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    public Integer getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(Integer deliveries) {
        this.deliveries = deliveries;
    }

    public Player getBowler() {
        return bowler;
    }

    public void setBowler(Player bowler) {
        this.bowler = bowler;
    }


}
