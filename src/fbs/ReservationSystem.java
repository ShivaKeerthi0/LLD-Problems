package fbs;

import java.util.List;

public class ReservationSystem {
    List<Flight> flightList;
    List<Airport> airportList;
    List<AirLine> airLineList;
    Search searchObj;
    Payment paymentObj;
    List<Booking> bookings;


    public void bookFlight(Customer user, Flight flight, Trip trip, List<Seat> seatList){

        double amount = 500.0; // iterate on seats and calculate price
        paymentObj.makePayment(amount);
    }

    public void cancelBooking(Booking booking){

    }

    public Flight getFlightDetails(Flight flight){
        return null;
    }


}
