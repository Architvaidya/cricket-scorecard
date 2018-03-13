package com.scorecard.entity;
import java.util.ArrayList;
import java.util.List;

public class Bowler extends Player{

    private Integer runs;
    private List<Over> overs;
    private List<Wicket> wickets;

    public Bowler(String firstName, String lastName) {
        super(firstName, lastName);
        this.runs = 0;
        overs = new ArrayList<Over>();
        wickets = new ArrayList<Wicket>();
    }



    public Integer getRuns() {
        return runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    public List<Over> getOvers() {
        return overs;
    }

    public void setOvers(List<Over> overs) {
        this.overs = overs;
    }

    public List<Wicket> getWickets() {
        return wickets;
    }

    public void setWickets(List<Wicket> wickets) {
        this.wickets = wickets;
    }
}
