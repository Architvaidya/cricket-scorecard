package com.scorecard.service;

import com.scorecard.entity.Over;
import com.scorecard.mockpersist.DataStore;
import com.scorecard.entity.Inning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InningService {

    @Autowired
    DataStore dataStore;
    @Autowired
    MatchService marchService;
    @Autowired
    OverService overService;

    public InningService() {

    }

    public List<Inning> getAllInnings(){

        return dataStore.getInnings();

    }

    public Inning addInning(Inning inning){
        Over over = new Over();
        over.setBowlerId(inning.getBowler());
        //inning.getOvers().add(over);
        dataStore.getInnings().add(inning);
        overService.addOver(over);
        dataStore.getMatch().getInnings().add(inning);
        return dataStore.getInnings().get(dataStore.getInnings().size() - 1);
    }

    public Inning getById(Integer id){
        return dataStore.getInnings().stream().filter(i -> i.getId() == id).findFirst().get();

    }

    public void updateInning(Inning i){
        Inning inningToBeUpdated = getById(i.getId());
        Inning inning;

        for(int index = 0; index< dataStore.getInnings().size();index++){
            inning = dataStore.getInnings().get(index);
            if(inning.getId() == i.getId()){
                dataStore.getInnings().remove(index);
            }

        }
        dataStore.getInnings().add(i);

    }

    public void deleteAll(){
        dataStore.getInnings().clear();
    }
}
