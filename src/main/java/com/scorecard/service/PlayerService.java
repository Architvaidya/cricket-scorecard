package com.scorecard.service;

import com.scorecard.entity.Team;
import com.scorecard.mockpersist.DataStore;
import com.scorecard.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    DataStore dataStore;

    @Autowired
    TeamService service;

    public PlayerService() {


    }

    public List<Player> getAllPlayers(){

        return dataStore.getPlayers();

    }

    public Player getPlayerById(Integer id){
        System.out.println("Searching for Player with id :"+id);
        System.out.println("Size of players is : "+dataStore.getPlayers().size());
        return dataStore.getPlayers().stream().filter(t -> t.getId() == id).findFirst().get();

    }

    public void updatePlayer(Player p){
        System.out.println("Updating Player with id : "+p.getId());
        Player playerToBeUpdated = getPlayerById(p.getId());
        Player player;
        //playerToBeUpdated.setStatistics(p.getStatistics());
        for(int i = 0; i< dataStore.getPlayers().size();i++){
            player = dataStore.getPlayers().get(i);
            if(player.getId() == playerToBeUpdated.getId()){
                dataStore.getPlayers().remove(i);
            }

        }
        dataStore.getPlayers().add(p);

    }

    public Player addPlayer(Player player, String teamName){

        Team t = service.getOneTeamByName(teamName);
        player.setTeam(t);
        service.addPlayerInTeam(t.getName(), player);
        dataStore.getPlayers().add(player);
        return dataStore.getPlayers().get(dataStore.getPlayers().size() - 1);
    }

    public List<Player> addPlayers(List<Player> players, String name){
        Team t = service.getOneTeamByName(name);
        for(Player p: players){
            p.setTeam(t);
            service.addPlayerInTeam(t.getName(), p);
        }

        dataStore.getPlayers().addAll(players);
        return dataStore.getPlayers();


    }

    public void deleteAll(){
        dataStore.getInnings().clear();
    }
}
