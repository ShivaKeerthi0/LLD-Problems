package bookmyshow;

import java.util.List;

public class Movie {
    public String movieName;
    public int durationInMins;
    public Genre movieGenre;
    public List<Show> showsPlayed;

    public List<Show> getShowsList(){
        return this.showsPlayed;
    }
}
