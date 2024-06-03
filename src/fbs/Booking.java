package fbs;

import java.util.Date;
import java.util.List;

public class Booking {
    int bookingId;
    Date bookingDate;
    double amount;
    List<Seat> seatsList;
    Flight flight;
    AirLine airLine;
    Trip trip;

}
