package crs;
import java.util.Date;
public class Customer extends Car{

    Search searchObj;
    CarRentalSystem carRentalSystemObj;

    public void bookCar(){
        carRentalSystemObj.bookCar(new User(), new Car(), new Date(), new Date());
    }

    public void searchCar(Location location){
        searchObj.getCarsBasedOnLocation(location);
    }

    public void cancelBookedcar(Booking booking){
        carRentalSystemObj.cancelBookedCar(booking);
    }
}
