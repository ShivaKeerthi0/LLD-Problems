package fbs;

import java.util.List;

public class Customer extends User{
    Search searchObj;
    ReservationSystem reservationSystemObj;


    public void bookFlight(Flight flight, List<Seat> seatList, Trip trip){

        reservationSystemObj.bookFlight(this, flight, trip, seatList);

    }

    public void cancelFlight(Booking booking){
        reservationSystemObj.cancelBooking(booking);
    }
}
