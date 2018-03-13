package com.scorecard.mockpersist;

import com.scorecard.entity.*;

import java.util.ArrayList;
import java.util.List;


public class DataStore {

    List<Score> scores;
    List<Player> players;
    List<PlayerStatistics> playerStatistics;
    List<Team> teams;
    List<Wicket> wickets;
    List<Over> overs;
    List<Inning> innings;
    Match match;

    public DataStore() {
        scores = new ArrayList<Score>();
        teams = new ArrayList<Team>();
        players = new ArrayList<Player>();
        players = new ArrayList<Player>();
        teams = new ArrayList<Team>();
        wickets = new ArrayList<Wicket>();
        overs = new ArrayList<Over>();
        innings = new ArrayList<Inning>();
        match = new Match();
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<PlayerStatistics> getPlayerStatistics() {
        return playerStatistics;
    }

    public void setPlayerStatistics(List<PlayerStatistics> playerStatistics) {
        this.playerStatistics = playerStatistics;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public List<Wicket> getWickets() {
        return wickets;
    }

    public void setWickets(List<Wicket> wickets) {
        this.wickets = wickets;
    }

    public List<Over> getOvers() {
        return overs;
    }

    public void setOvers(List<Over> overs) {
        this.overs = overs;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public List<Inning> getInnings() {
        return innings;
    }

    public void setInnings(List<Inning> innings) {
        this.innings = innings;
    }
}
