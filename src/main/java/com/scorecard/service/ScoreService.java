package com.scorecard.service;

import com.scorecard.entity.*;
import com.scorecard.mockpersist.DataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {

    @Autowired
    DataStore dataStore;
    @Autowired
    PlayerService playerService;

    @Autowired
    OverService overService;

    @Autowired
    InningService inningService;

    public ScoreService() {

    }

    public List<Score> getAllScore(){

        return dataStore.getScores();

    }

    public Score addScore(Score score){
        System.out.println("Adding Score");
        Player batsman;
        Player bowler;
        Player fielder;
        int inningRuns;
        Inning inning = inningService.getAllInnings().get((inningService.getAllInnings().size()) - 1);
        inningRuns = inning.getRuns();
        inning.setRuns(inningRuns + score.getRuns());
        Over over = inning.getOvers().get(inning.getOvers().size() - 1);
        batsman = playerService.getPlayerById(score.getBatsmanId());
        bowler = playerService.getPlayerById(score.getBowlerId());


        //If no wicket
        if(score.getWicket() == null){
            //if no wicket and no extras
            if(score.getExtra() == null){
                System.out.println("No extras");


                int ballsFaced = batsman.getStatistics().getBallsFaced();
                int runsScored = batsman.getStatistics().getRunsScored();
                ballsFaced++;
                runsScored = runsScored + score.getRuns();
                batsman.getStatistics().setBallsFaced(ballsFaced);
                batsman.getStatistics().setRunsScored(runsScored);
                batsman.getScores().add(score);
                playerService.updatePlayer(batsman);

                int runsGiven = bowler.getStatistics().getRunsGiven();
                runsGiven = runsGiven + score.getRuns();
                bowler.getStatistics().setRunsGiven(runsGiven);
                bowler.getScores().add(score);
                playerService.updatePlayer(bowler);
                overService.update(over, score);

            }
            //No wicket and an extra
            else{
                //if it is a wide
                if(score.getExtra().equals(ExtraType.WIDE.toString())){
                    int runsGiven = bowler.getStatistics().getRunsGiven();
                    runsGiven = runsGiven + score.getRuns();
                    bowler.getStatistics().setRunsGiven(runsGiven) ;
                    bowler.getScores().add(score);
                    batsman.getScores().add(score);
                    playerService.updatePlayer(bowler);
                    playerService.updatePlayer(batsman);
                    overService.update(over, score);

                }

            }
        }
        dataStore.getScores().add(score);
        return dataStore.getScores().get(dataStore.getScores().size() - 1);
    }

    public void deleteAll(){
        dataStore.getScores().clear();
    }
}
