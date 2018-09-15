package com.scorecard.service;

import com.scorecard.entity.Player;
import com.scorecard.mockpersist.DataStore;
import com.scorecard.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    DataStore dataStore;

    public TeamService() {

    }

    public List<Team> getAllTeams(){

        return dataStore.getTeams();

    }

    public Team getOneTeamByName(String name){
        return dataStore.getTeams().stream().filter(t -> t.getName().equals(name)).findFirst().get();
    }

    public Team addTeam(Team team){
        System.out.println("Inside team Service, team name is : "+team.getName());
        dataStore.getTeams().add(team);
        return dataStore.getTeams().get(dataStore.getTeams().size() - 1);
    }

    public void addPlayerInTeam(String teamName, Player p){
        for(Team t : dataStore.getTeams()){
            if(t.getName().equals(teamName)){
                t.getPlayers().add(p.getId());
            }
        }
    }

    public void deleteAll(){
        dataStore.getTeams().clear();
    }

}
