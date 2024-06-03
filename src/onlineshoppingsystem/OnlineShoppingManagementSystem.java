package onlineshoppingsystem;

import javax.management.Notification;
import java.util.List;
// can improve by using singleton pattern making constructor private and getInstance() static
public class OnlineShoppingManagementSystem {
    List<User> customerList;
    List<Order> orderList;
    List<Unit> unitList;
    List<User> unitOwnerList;
    Payment paymentObj;
    NotificationService notificationServiceObj;

    public void addUnit(Unit unit){

    }

    public  void deleteUnit(Unit unit){

    }

    public void addCustomer(Customer customer){

    }

    public void addUnitOwner(UnitOwner unitOwner){

    }

    public void placeOrder(Order order){
        notify(order.customer, "MAIL");
    }

    public void cancelOrder(Order order){

    }

    public void notify(User customer, String param){
        switch (param){
            case "MAIL":
                notificationServiceObj = new EmailNotificationService();
                notificationServiceObj.notificationService(customer);
                break;
            default:
                notificationServiceObj = new SMSNotificationService();
                notificationServiceObj.notificationService(customer);
                break;

        }

    }

    public void makePayment(Order order){
        paymentObj.makePayment(order, order.ordervalue);
    }
}
