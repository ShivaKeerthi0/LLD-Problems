package scoringsystem;

import java.util.List;

public class Team {
    List<PlayerInstance> playes;
    int numberOffMatchesWon;
    int getNumberOffMatchesLost;

    public List<PlayerInstance> getPlayes() {
        return playes;
    }

    public void setPlayes(List<PlayerInstance> playes) {
        this.playes = playes;
    }

    public void addPlayer(PlayerInstance player){

    }

    public int getGetNumberOffMatchesLost() {
        return getNumberOffMatchesLost;
    }

    public int getNumberOffMatchesWon() {
        return numberOffMatchesWon;
    }

    public void updateWinCount(){

    }

    public void lostCount(){

    }
}
