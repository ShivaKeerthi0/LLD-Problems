package scoringsystem;

import java.util.List;

public class Innings {
    Team bowls;
    Team bats;
    List<Wicket> wicketsList;
    List<Over> oversList;
    int runs;
    int wicktes;
    int foursCount;
    int sixersCount;

    public int getRuns() {
        return runs;
    }

    public int getWicktes() {
        return wicktes;
    }

    public List<Wicket> getWicketsList() {
        return wicketsList;
    }

    public Team getBats() {
        return bats;
    }

    public Team getBowls() {
        return bowls;
    }

    public void updateFourCount(){

    }

    public void updateSixerCount(){

    }
}
