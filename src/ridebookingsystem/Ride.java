package ridebookingsystem;


public class Ride {
    int rideId;
    Location source;
    Location destination;
    RideStatus status;
    double duration;
    Customer cust;
    Rider assignedRider;

    Ride(Customer customer, Location src, Location destination){
        this.rideId = 123;
        this.source = src;
        this.destination = destination;
        this.cust = customer;
    }

    public Location getDestination() {
        return destination;
    }

    public double getDuration() {
        return duration;
    }


    public RideStatus getStatus() {
        return status;
    }


    public Location getSource() {
        return source;
    }


}
