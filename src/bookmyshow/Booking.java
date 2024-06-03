package bookmyshow;

public class Booking {

    private  int id;
    private BookingStatus status;
    private  User user;
    private CinemaHall hall;
    private Audi audi;
    private  Show show;

    public Ticket makeBooking(){
        // Logic
        Payment payment = new Payment();
        payment.makePayment();
        assignSeats();
        return  new Ticket();
    }

    public void cancelBooking(){

    }

    private void assignSeats(){

    }

}

