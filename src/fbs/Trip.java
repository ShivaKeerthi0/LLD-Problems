package fbs;

import java.util.Date;
import java.util.List;

public class Trip {
    String tripId;
    Airport arrivalPort;
    Airport destPort;
    List<Seat> seatList;
    Date startTime;
    Date endTime;
    TripStatus tripStatus;
}
