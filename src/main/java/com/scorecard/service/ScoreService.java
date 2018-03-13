package com.scorecard.service;

import com.scorecard.entity.ExtraType;
import com.scorecard.entity.Player;
import com.scorecard.mockpersist.DataStore;
import com.scorecard.entity.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {


    DataStore dataStore;
    @Autowired
    PlayerService playerService;

    public ScoreService() {
        dataStore = new DataStore();
    }

    public List<Score> getAllScore(){

        return dataStore.getScores();

    }

    public Score addScore(Score score){
        System.out.println("Adding Score");
        Player batsman;
        Player bowler;

        Player fielder;

        //If no wicket
        if(score.getWicket() == null){
            System.out.println("No wickets extraType is : "+ExtraType.NONE.toString());
            //if no wicket and no extras
            if(score.getExtra() == null){
                System.out.println("No extras");
                batsman = playerService.getPlayerById(score.getBatsmanId());
                bowler = playerService.getPlayerById(score.getBowlerId());

                int ballsFaced = batsman.getStatistics().getBallsFaced();
                int runsScored = batsman.getStatistics().getBallsFaced();
                ballsFaced++;
                runsScored = runsScored + score.getRuns();
                batsman.getStatistics().setBallsFaced(ballsFaced);
                batsman.getStatistics().setRunsScored(runsScored);
                playerService.updatePlayer(batsman);

                int runsGiven = bowler.getStatistics().getRunsGiven();
                runsGiven = runsGiven + score.getRuns();
                bowler.getStatistics().setRunsGiven(runsGiven);
                playerService.updatePlayer(bowler);

            }
        }
        dataStore.getScores().add(score);
        return dataStore.getScores().get(dataStore.getScores().size() - 1);
    }
}
