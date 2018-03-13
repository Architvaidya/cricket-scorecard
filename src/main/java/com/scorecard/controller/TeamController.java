package com.scorecard.controller;

import com.scorecard.entity.Team;
import com.scorecard.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeamController {

    @Autowired
    private TeamService service;

    @RequestMapping(method = RequestMethod.GET, value = "/teams")
    @ResponseBody
    public ResponseEntity<List<Team>> getAllTeams(){
        List<Team> teams = service.getAllTeams();
        HttpHeaders responseHeaders = new HttpHeaders();
        List<MediaType> medias = new ArrayList<MediaType>();
        medias.add(MediaType.ALL);
        return new ResponseEntity<List<Team>>(teams, responseHeaders, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "team/{name}")
    @ResponseBody
    public ResponseEntity<Team> getOneTeamByName(@PathVariable String name){
        Team t = service.getOneTeamByName(name);
        HttpHeaders responseHeaders = new HttpHeaders();
        List<MediaType> medias = new ArrayList<MediaType>();
        medias.add(MediaType.ALL);
        return new ResponseEntity<Team>(t, responseHeaders, HttpStatus.OK);


    }

    @RequestMapping(method = RequestMethod.POST, value = "/team")
    @ResponseBody
    public ResponseEntity<Team> addTeam(@RequestBody Team team){
        System.out.println("New team name : "+team.getName());
        Team t = service.addTeam(team);

        return new ResponseEntity<Team>(t, HttpStatus.OK);
    }
}
