package com.scorecard.service;

import com.scorecard.mockpersist.DataStore;
import com.scorecard.entity.Inning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InningService {


    DataStore dataStore;
    @Autowired
    MatchService marchService;

    public InningService() {
        dataStore = new DataStore();
    }

    public List<Inning> getAllInnings(){

        return dataStore.getInnings();

    }

    public Inning addInning(Inning inning){
        System.out.println("Inside Inning Service, battingTeam= name is : "+inning.getBattingTeam());
        dataStore.getMatch().getInnings().add(inning);
        dataStore.getInnings().add(inning);
        return dataStore.getInnings().get(dataStore.getInnings().size() - 1);
    }
}
