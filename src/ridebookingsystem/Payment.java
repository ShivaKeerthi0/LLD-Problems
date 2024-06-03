package ridebookingsystem;

import java.util.Date;

public class Payment {
    int paymentId;
    Date startDate;
    Date endDate;
    int amount;
    Ride ride;

// we can use different paymentStrategies here as well.
    public void makePayment(Customer customer, Ride ride, double amount){

    }

}
