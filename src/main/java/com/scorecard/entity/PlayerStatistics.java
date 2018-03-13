package com.scorecard.entity;

import java.util.ArrayList;
import java.util.List;


public class PlayerStatistics {
    private Integer ballsFaced;
    private Integer runsScored;
    private Integer runsGiven;
    private List<Over> oversbowled;

    PlayerStatistics(){
        ballsFaced = 0;
        runsScored = 0;
        runsGiven = 0;
        oversbowled = new ArrayList<Over>();
    }


    public Integer getRunsGiven() {
        return runsGiven;
    }

    public void setRunsGiven(Integer runsGiven) {
        this.runsGiven = runsGiven;
    }

    public Integer getBallsFaced() {
        return ballsFaced;
    }

    public void setBallsFaced(Integer ballsFaced) {
        this.ballsFaced = ballsFaced;
    }

    public Integer getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(Integer runsScored) {
        this.runsScored = runsScored;
    }

    public List<Over> getOversbowled() {
        return oversbowled;
    }

    public void setOversbowled(List<Over> oversbowled) {
        this.oversbowled = oversbowled;
    }
}
