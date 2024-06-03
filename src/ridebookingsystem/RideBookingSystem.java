package ridebookingsystem;

import java.util.List;
// here we can use singleton pattern for this and we may make private constructor and use getInstance() method to get an instance and make this method as static.
public class RideBookingSystem {
    List<Customer> customerList;
    List<Rider> riderList;
    List<Ride> rideList;


    public  void addCustomer(Customer cust){

    }


    public void addRider(Rider rider){

    }

    public void bookRide(Customer cust, Ride ride){

        assignRider(cust);
        notifyCustomer("Assigned Rider");

    }

    public void cancelRide(Ride ride){

    }

// we can implement strategy pattern using a interface and different classes implement different strategies for getting rider and we can use one of the strategy using that class object
    public void assignRider(Customer customer){
           for(Rider rider : riderList){
               double distance = calculateDistance(customer.src , rider.src);
               if(distance < 5.0){
                   notifyRider(rider);
               }
           }
    }

    public void notifyCustomer(String msg){

        System.out.println(msg);

    }


    public double calculateDistance(Location src, Location dest){
        return 123;
    }


    public void notifyRider(Rider rider){

        System.out.println("Notified Rider");

    }


    public double calculateFair(Ride ride){
        return 123;
    }


    public void makePayment(Customer customer, Ride ride){
        Payment payment = new Payment();
        payment.makePayment( customer,  ride, calculateFair(ride));
    }



}
