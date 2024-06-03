package bookmyshow;
import java.util.Date;
import java.util.List;

public class Ticket {
    private  int id;
    private Date bookedOn;
    private Show show;
    private CinemaHall cinemaHall;
    private Audi audi;
    private List<Seat> seats;
}
