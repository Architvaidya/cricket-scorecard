package com.scorecard.entity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;


public class Player {

    private Integer id;
    private String firstName;
    private String lastName;

    private Team team;
    private String batHand;
    private String bowlHand;
    @Autowired
    private PlayerStatistics statistics;
    List<Score> scores;

    private static int count = 0;

    public Player(){
        scores = new ArrayList<Score>();
        statistics = new PlayerStatistics();
        count++;
        this.id = count;

    }

    public Player(String firstName, String lastName) {

        count++;
        this.id = count;
        System.out.println("Calling the constructor, id: "+this.id);
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Player(Integer id, String firstName, String lastName, String batHand, String bowlHand, PlayerStatistics statistics, List<Score> scores) {
        count++;
        this.id = count;
        this.firstName = firstName;
        this.lastName = lastName;
        this.batHand = batHand;
        this.bowlHand = bowlHand;
        this.statistics = statistics;
        this.scores = scores;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBatHand() {
        return batHand;
    }

    public void setBatHand(String batHand) {
        this.batHand = batHand;
    }

    public String getBowlHand() {
        return bowlHand;
    }

    public void setBowlHand(String bowlHand) {
        this.bowlHand = bowlHand;
    }

    public PlayerStatistics getStatistics() {
        return statistics;
    }

    public void setStatistics(PlayerStatistics statistics) {
        this.statistics = statistics;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Player.count = count;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
