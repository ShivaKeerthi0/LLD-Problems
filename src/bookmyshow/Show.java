package bookmyshow;

import java.util.Date;
import java.util.List;

public class Show {

    private int id;
    public Movie movie;
    public Date startTime;
    public Date endTime;
    public CinemaHall cinemaHallName;
    private List<Seat> seats;
}
