package bookmyshow;

import java.util.List;

public class BookMyShowSystem {

    List<CinemaHall> halls;
    List<Location> locationList;
    List<Booking> bookingList;
    List<Ticket> ticketsIssued;
    Search search;
    Booking booking;

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public List<CinemaHall> getHalls() {
        return halls;
    }

    public List<Location> getLocationList() {
        return locationList;
    }

    public List<Ticket> getTicketsIssued() {
        return ticketsIssued;
    }

    public void makeBooking(){
        booking.makeBooking();
    }


}
