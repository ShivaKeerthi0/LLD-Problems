package scoringsystem;

import java.util.Map;
import java.util.List;

//Singletonclass
public class MatchService {
    List<Match> matchList;
    List<Venue> venueList;
    List<Stadium> stadiumList;
    Map<Location, Venue> venueMap;

    public List<Match> getMatchList() {
        return matchList;
    }

    public List<Stadium> getStadiumList() {
        return stadiumList;
    }

    public List<Venue> getVenueList() {
        return venueList;
    }

    public Map<Location, Venue> getVenueMap() {
        return venueMap;
    }

    public void addMatch(Match match){

    }

    public void addScoreCard(Scorecard scoreCard){

    }
}
