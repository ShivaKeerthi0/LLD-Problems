package scoringsystem;

import java.util.List;

//Singletonclass
public class ScorecardService {
    List<Scorecard> scorecardList;

    public List<Scorecard> getScorecardList() {
        return scorecardList;
    }

    public Scorecard createScorecard(){
        return new Scorecard();
    }

    public void updateScoreCard(Scorecard scorecard){

    }

    public void addInnings(Innings innings){

    }
}
