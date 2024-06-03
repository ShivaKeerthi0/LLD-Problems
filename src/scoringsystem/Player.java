package scoringsystem;

import java.util.List;

public class Player {
    int playerId;
    String name;
    String jersyNumber;
    int runs; // overall in carrer
    int wicketsCount; // overall in carrer
    List<Wicket> wicketList; // overall in carrer
    PlayerType type;

    public List<Wicket> getWicketList() {
        return wicketList;
    }


    public int getRuns() {
        return runs;
    }

    public String getName() {
        return name;
    }


    public int getPlayerId() {
        return playerId;
    }

    public int getWicketsCount() {
        return wicketsCount;
    }

    public String getJersyNumber() {
        return jersyNumber;
    }
}
