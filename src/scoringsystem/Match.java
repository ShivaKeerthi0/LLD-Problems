package scoringsystem;

import java.util.List;

public class Match {
    Venue venue;
    int matchId;
    Scorecard scorecard;
    List<Umpire> umpires;
    List<Innings> innings;
    Format foramt;
    MatchStatus status;


    public Format getForamt() {
        return foramt;
    }

    public List<Innings> getInnings() {
        return innings;
    }

    public MatchStatus getStatus() {
        return status;
    }

    public List<Umpire> getUmpires() {
        return umpires;
    }


    public Scorecard getScorecard() {
        return scorecard;
    }

    public Venue getVenue() {
        return venue;
    }

    public void updateMatchDetails(){

    }

    public void setStatus(MatchStatus status) {
        this.status = status;
    }

    public void setForamt(Format foramt) {
        this.foramt = foramt;
    }

    public void setScorecard(Scorecard scorecard) {
        this.scorecard = scorecard;
    }


    public void setUmpires(List<Umpire> umpires) {
        this.umpires = umpires;
    }


    public void setVenue(Venue venue) {
        this.venue = venue;
    }
}
