package hotelmanagementsystem;

import java.util.Date;

public class Booking {

    private int bookingId;
    public Room room;
    public Date startDate;
    public Date endDate;
    public  Customer customer;
    Booking(int id, Room room, Date startDate, Date endDate, Customer customer){
        this.bookingId = id;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer =customer;
    }

    public int getBookingId() {
        return bookingId;
    }
}
