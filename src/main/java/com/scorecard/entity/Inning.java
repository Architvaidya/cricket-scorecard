package com.scorecard.entity;


import java.util.ArrayList;
import java.util.List;

public class Inning {

    private Integer id;


    private String battingTeam;

    private String bowlingTeam;

    private Integer onStrikeBatsmanId;

    private Integer offStrikeBatsmanId;

    private Integer bowler;

    private List<Over> overs;

    private Integer runs;

    private Integer wickets;

    private static Integer COUNT = 1;

    public Inning() {
        this.id = COUNT;
        COUNT++;
        overs = new ArrayList<Over>();
        runs = 0;
        wickets = 0;
    }


    public Integer getBowler() {
        return bowler;
    }

    public void setBowler(Integer bowler) {
        this.bowler = bowler;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeam(String battingTeam) {
        System.out.println("Setting BattingTeam");
        this.battingTeam = battingTeam;
    }

    public String getBowlingTeam() {
        return bowlingTeam;
    }

    public void setBowlingTeam(String bowlingTeam) {
        this.bowlingTeam = bowlingTeam;
    }

    public Integer getOnStrikeBatsmanId() {
        return onStrikeBatsmanId;
    }

    public void setOnStrikeBatsmanId(Integer onStrikeBatsmanId) {
        this.onStrikeBatsmanId = onStrikeBatsmanId;
    }

    public Integer getOffStrikeBatsmanId() {
        return offStrikeBatsmanId;
    }

    public void setOffStrikeBatsmanId(Integer offStrikeBatsmanId) {
        this.offStrikeBatsmanId = offStrikeBatsmanId;
    }

    public List<Over> getOvers() {
        return overs;
    }

    public void setOvers(List<Over> overs) {
        this.overs = overs;
    }

    public Integer getRuns() {
        return runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    public Integer getWickets() {
        return wickets;
    }

    public void setWickets(Integer wickets) {
        this.wickets = wickets;
    }

    public static Integer getCOUNT() {
        return COUNT;
    }

    public static void setCOUNT(Integer COUNT) {
        Inning.COUNT = COUNT;
    }
}
