package com.scorecard.controller;


import com.scorecard.entity.Over;
import com.scorecard.service.OverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OverController {
    @Autowired
    OverService service;

    @RequestMapping(method = RequestMethod.GET, value = "/overs")
    public ResponseEntity<List<Over>> getAllOvers(){
        List<Over> overs = service.getAllOvers();
        return new ResponseEntity<List<Over>>(overs, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/over")
    public ResponseEntity<Over> addOver(Over over){
        Over o = service.addOver(over);
        return new ResponseEntity<Over>(o, HttpStatus.OK);
    }


}
