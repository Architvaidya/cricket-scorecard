package com.scorecard.controller;

import com.scorecard.entity.Score;
import com.scorecard.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScoreController {
    @Autowired
    ScoreService service;

    @RequestMapping(method = RequestMethod.GET, value = "/score")
    public ResponseEntity<List<Score>> getAll(){
        List<Score> scores = service.getAllScore();
        return new ResponseEntity<List<Score>> (scores, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/score")
    public ResponseEntity<Score> addScore(@RequestBody Score scoreIn){
        Score score = service.addScore(scoreIn);
        return new ResponseEntity<Score>(score, HttpStatus.OK);

    }
}
