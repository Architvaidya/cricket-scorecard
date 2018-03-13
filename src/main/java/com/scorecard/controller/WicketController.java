package com.scorecard.controller;


import com.scorecard.entity.Wicket;
import com.scorecard.service.WicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WicketController {
    @Autowired
    WicketService service;

    @RequestMapping(method = RequestMethod.GET, value = "/wickets")
    public ResponseEntity<List<Wicket>> getAllOvers(){
        List<Wicket> overs = service.getAllWickets();
        return new ResponseEntity<List<Wicket>>(overs, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/wicket")
    public ResponseEntity<Wicket> addOver(Wicket wicket){
        Wicket o = service.addWicket(wicket);
        return new ResponseEntity<Wicket>(o, HttpStatus.OK);
    }


}
