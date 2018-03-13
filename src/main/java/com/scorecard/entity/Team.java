package com.scorecard.entity;


import java.util.ArrayList;
import java.util.List;
public class Team {

    private String name;

    private List<Integer> players;

    public Team() {
        System.out.println("Inside Team default controller");

        players = new ArrayList<Integer>();
    }

    public Team(String name, List<Integer> players) {
        this.name = name;
        this.players = players;
    }

    public Team(String name) {
        System.out.println("Inside Team paremeterized constructor controller");
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getPlayers() {
        return players;
    }

    public void setPlayers(List<Integer> players) {
        this.players = players;
    }
}

