package crs;

import crs.Car;

import java.util.Date;

public class  Booking {

    Date bookedDate;
    Date starTime;
    Date endTIme;
    Customer user;
    Car car;

    public Booking getBookingDetails(Booking booking){
        return this;
    }
}
