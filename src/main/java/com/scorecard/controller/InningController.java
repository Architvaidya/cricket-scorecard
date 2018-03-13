package com.scorecard.controller;


import com.scorecard.entity.Inning;
import com.scorecard.service.InningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InningController {

    @Autowired
    InningService service;

    @RequestMapping(method = RequestMethod.GET, value = "/innings")
    public ResponseEntity<List<Inning>> getAllInnings(){
        List<Inning> innings = service.getAllInnings();

        return new ResponseEntity<List<Inning>>(innings, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/inning")
    public ResponseEntity<Inning> addInning(@RequestBody Inning inning){
        Inning i = service.addInning(inning);
        return new ResponseEntity<Inning>(i, HttpStatus.OK);
    }

}
