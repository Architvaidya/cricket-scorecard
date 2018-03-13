package com.scorecard.entity;

import java.util.ArrayList;
import java.util.List;

public class Match {

    private List<Inning> innings;


    public Match() {

        innings = new ArrayList<Inning>();
    }

    public Match(List<Inning> innings) {
        this.innings = innings;
    }

    public List<Inning> getInnings() {
        return innings;
    }

    public void setInnings(List<Inning> innings) {
        this.innings = innings;
    }
}
