package ridebookingsystem;

import java.util.List;

public class Customer extends User{

    List<Ride> rideHistory;
    double ratings;
    RideBookingSystem ridebookingSystemObj;
    Location src;


    public void bookRide(Location src, Location des){
        Ride ride = new Ride(this,  src,  des);
        ridebookingSystemObj.bookRide(this, ride);

    }

    public void cancelRide(Ride ride){
        ridebookingSystemObj.cancelRide(ride);
    }


    public void giveRatingTORider(Rider rider){

    }
}
