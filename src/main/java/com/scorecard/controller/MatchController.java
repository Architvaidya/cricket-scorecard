package com.scorecard.controller;


import com.scorecard.entity.Match;
import com.scorecard.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MatchController {
    @Autowired
    MatchService service;

    @RequestMapping(method = RequestMethod.GET, value="/matches")
    public ResponseEntity<Match> getMatch(){
        Match m = service.getMatch();
        return new ResponseEntity<Match>(m, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value="/match")
    public ResponseEntity<Match> addMatch(Match match){
        Match m = service.addMatch(match);
        return new ResponseEntity<Match>(m, HttpStatus.OK);
    }


}
