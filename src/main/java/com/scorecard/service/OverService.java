package com.scorecard.service;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.scorecard.entity.ExtraType;
import com.scorecard.entity.Inning;
import com.scorecard.entity.Over;
import com.scorecard.entity.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.scorecard.mockpersist.DataStore;
import java.util.List;


@Service
public class OverService {
    @Autowired
    DataStore dataStore;
    @Autowired
    InningService inningService;

    public OverService(){


    }

    public List<Over> getAllOvers(){
        return dataStore.getOvers();

    }

    public Over addOver(Over over){
        dataStore.getOvers().add(over);
        System.out.println("Size of inning is : "+dataStore.getInnings().size());
        Inning inning = dataStore.getInnings().get(dataStore.getInnings().size() - 1);
        inning.getOvers().add(over);
        inningService.updateInning(inning);
        return dataStore.getOvers().get(dataStore.getOvers().size() - 1);
    }

    public Over getOverById(Integer id){

        //return dataStore.getPlayers().stream().filter(t -> t.getId() == id).findFirst().get();
        return dataStore.getOvers().stream().filter(o -> o.getId() == id).findFirst().get();

    }

    public void update(Over o, Score s){

        Over overToBeUpdated = getOverById(o.getId());
        Over over;
        if(!(s.getExtra().equals(ExtraType.WIDE)) || !(s.getExtra().equals(ExtraType.NOBALL.toString()))){
            overToBeUpdated.IncrementDeliveries();
        }

        overToBeUpdated.getScores().add(s);

        for(int i = 0; i< dataStore.getOvers().size();i++){
            over = dataStore.getOvers().get(i);
            if(over.getId() == o.getId()){
                dataStore.getOvers().remove(i);
            }

        }

        dataStore.getOvers().add(overToBeUpdated);



    }

    public void deleteAll(){
        dataStore.getOvers().clear();
    }
}
