package scoringsystem;

public class Wicket {
    int wicketId;
    PlayerInstance bowler;
    PlayerInstance batter;
    WicketType wicketType;
    String description;

    public int getWicketId() {
        return wicketId;
    }

    public PlayerInstance getBatter() {
        return batter;
    }

    public PlayerInstance getBowler() {
        return bowler;
    }

    public WicketType getWicketType() {
        return wicketType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWicketId(int wicketId) {
        this.wicketId = wicketId;
    }

    public void setBowler(PlayerInstance bowler) {
        this.bowler = bowler;
    }

    public void setBatter(PlayerInstance batter) {
        this.batter = batter;
    }

    public void setWicketType(WicketType wicketType) {

    }
}
