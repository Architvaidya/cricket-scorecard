package com.scorecard.service;

import com.scorecard.mockpersist.DataStore;
import com.scorecard.entity.Match;
import org.springframework.stereotype.Service;

@Service
public class MatchService {


    DataStore dataStore;

    public MatchService() {
        dataStore = new DataStore();
    }

    public Match getMatch(){

        return dataStore.getMatch();

    }

    public Match addMatch(Match m){
        dataStore.setMatch(m);
        return dataStore.getMatch();
    }
}
