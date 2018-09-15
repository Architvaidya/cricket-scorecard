package com.scorecard.entity;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class Over {

    private Integer id = 0;
    private List<Score> scores;
    private Integer deliveries;
    private Integer bowlerId;

    private static Integer COUNT = 0;

    public Over() {
        COUNT++;
        id = COUNT;
        deliveries = 0;
        scores = new ArrayList<Score>();
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getBowlerId() {
        return bowlerId;
    }

    public void setBowlerId(Integer bowlerId) {
        this.bowlerId = bowlerId;
    }
}
