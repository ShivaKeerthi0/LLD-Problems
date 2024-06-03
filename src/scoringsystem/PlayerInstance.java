package scoringsystem;

import java.util.List;

public class PlayerInstance {
    Player player;
    boolean isFit;
    int runsCount;
    int wicketCount;
    List<Wicket> wicketList;
    int boundariesSocred;

    public List<Wicket> getWicketList() {
        return wicketList;
    }

    public int getWicketCount() {
        return wicketCount;
    }

    public int getRunsCount() {
        return runsCount;
    }

    public Player getPlayer() {
        return player;
    }


}
