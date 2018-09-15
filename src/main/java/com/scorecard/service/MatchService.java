package com.scorecard.service;

import com.scorecard.mockpersist.DataStore;
import com.scorecard.entity.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchService {

    @Autowired
    DataStore dataStore;

    public MatchService() {

    }

    public Match getMatch(){

        return dataStore.getMatch();

    }

    public Match addMatch(Match m){
        dataStore.setMatch(m);
        return dataStore.getMatch();
    }

    public void deleteAll(){
     dataStore.setMatch(null);
    }
}
