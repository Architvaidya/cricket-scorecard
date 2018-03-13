package com.scorecard.service;


import com.scorecard.entity.Over;
import org.springframework.stereotype.Service;
import com.scorecard.mockpersist.DataStore;
import java.util.List;


@Service
public class OverService {

    DataStore dataStore;

    public OverService(){
        this.dataStore = new DataStore();
    }

    public List<Over> getAllOvers(){
        return dataStore.getOvers();

    }

    public Over addOver(Over over){
        dataStore.getOvers().add(over);
        return dataStore.getOvers().get(dataStore.getOvers().size() - 1);
    }
}
