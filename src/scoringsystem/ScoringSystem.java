package scoringsystem;

// Singleton Object
public class ScoringSystem {

    MatchService matchServiceObj;
    ScorecardService scorecardServiceObj;

    public MatchService getMatchServiceObj() {
        return matchServiceObj;
    }

    public ScorecardService getScorecardServiceObj() {
        return scorecardServiceObj;
    }

    public void addMatch(Match match){
        matchServiceObj.addMatch(match);

    }

    public void setMatchServiceObj(MatchService matchServiceObj) {
        this.matchServiceObj = matchServiceObj;
    }

    public void setScorecardServiceObj(ScorecardService scorecardServiceObj) {
        this.scorecardServiceObj = scorecardServiceObj;
    }

    public void addScoreCard(Scorecard scorecard){
        this.matchServiceObj.addScoreCard(scorecard);
    }
}
