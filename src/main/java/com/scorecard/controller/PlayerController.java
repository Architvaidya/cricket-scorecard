package com.scorecard.controller;


import com.scorecard.entity.Player;
import com.scorecard.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    PlayerService service;

    @RequestMapping(method = RequestMethod.GET, value = "/players")
    @ResponseBody
    public ResponseEntity<List<Player>> getAllPlayers(){
        List<Player> players = service.getAllPlayers();

        HttpHeaders responseHeaders = new HttpHeaders();
        List<MediaType> medias = new ArrayList<MediaType>();
        medias.add(MediaType.ALL);

        return new ResponseEntity<List<Player>>(players, responseHeaders, HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.POST, value ="/player/{team}")
    @ResponseBody
    public ResponseEntity<Player> addPlayer(@RequestBody Player player, @PathVariable("team") String teamName){
        System.out.println("Inside PlayerController: "+player.getLastName());
        Player p = service.addPlayer(player, teamName);
        HttpHeaders responseHeaders = new HttpHeaders();
        List<MediaType> medias = new ArrayList<MediaType>();
        medias.add(MediaType.ALL);
        responseHeaders.setAccept(medias);

        return new ResponseEntity<Player>(p, responseHeaders, HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.GET, value ="/player/{id}")
    @ResponseBody
    public ResponseEntity<Player> getPlayerById(@PathVariable("id") Integer id){
        Player p = service.getPlayerById(id);
        return new ResponseEntity<Player>(p, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value ="/players/{team}")
    @ResponseBody
    public ResponseEntity<List<Player>> addPlayers(@RequestBody List<Player> players, @PathVariable("team") String teamName){
        List<Player> playerList = service.addPlayers(players, teamName);
        return new ResponseEntity<List<Player>>(playerList, HttpStatus.OK);

    }
}
