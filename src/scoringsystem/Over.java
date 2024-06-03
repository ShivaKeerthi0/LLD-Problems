package scoringsystem;

import java.util.List;

public class Over {
    int overId;
    int OverNumber;
    int numberOfbowlsBowled;
    PlayerInstance bowledBy;
    int runs;
    List<Ball> balls;
    int BoundaryCount;
    List<PlayerInstance> batsmen;
    List<Wicket> wicketList;

    public List<Wicket> getWicketList() {
        return wicketList;
    }

    public int getRuns() {
        return runs;
    }

    public int getBoundaryCount() {
        return BoundaryCount;
    }

    public int getNumberOfbowlsBowled() {
        return numberOfbowlsBowled;
    }

    public int getOverNumber() {
        return OverNumber;
    }

    public int getOverId() {
        return overId;
    }

    public PlayerInstance getBowledBy() {
        return bowledBy;
    }

    public List<PlayerInstance> getBatsmen() {
        return batsmen;
    }
}
