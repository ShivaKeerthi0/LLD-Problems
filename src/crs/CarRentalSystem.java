package crs;

import crs.Payment;

import java.util.Date;
import java.util.List;


public class CarRentalSystem {
    List<Location> locationList;
    List<Car> carList;
    List<Booking> bookingList;
    Payment paymentObj;


    public void  bookCar(User user, Car car, Date startDate, Date endDate){
        Booking booking = new Booking();

        paymentObj.processPayment(500);

    }
    public void cancelBookedCar(Booking booking){

    }

    public List<Car> searchCars(Location location){
        return null;
    }


}
