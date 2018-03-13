package com.scorecard.service;


import com.scorecard.entity.Wicket;
import org.springframework.stereotype.Service;
import com.scorecard.mockpersist.DataStore;
import java.util.List;


@Service
public class WicketService {

    DataStore dataStore;

    public WicketService(){
        this.dataStore = new DataStore();
    }

    public List<Wicket> getAllWickets(){
        return dataStore.getWickets();

    }

    public Wicket addWicket(Wicket wicket){
        dataStore.getWickets().add(wicket);
        return dataStore.getWickets().get(dataStore.getWickets().size() - 1);
    }
}
