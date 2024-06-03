package fooddeliverysystem;




import java.util.HashMap;
import java.util.List;

// this should be a singletonclass, better make constructor as private and use a getInstance method which is static
public class FoodDelieverySystem {
    private static FoodDelieverySystem instance;
    List<Customer> customerList;
    List<Operators> operatorsList;
    List<DeliveryPartner> deliveryPartnerList;
    List<Restuarant> restuarants;
    Search searchObj;
    List<Order> orderList;
    Payment paymentObj;
    private FoodDelieverySystem() {
        // initialize your lists and other components here
    }

    public static FoodDelieverySystem getInstance() {
        if (instance == null) {
            instance = new FoodDelieverySystem();
        }
        return instance;
    }

    public  void signInUser(){

    }

    public void signOutUser(){

    }

    public void addRestuant(Restuarant restuarant){

    }

    public void deleteResturant(Restuarant restuarant){

    }


    public void placeOrder(Customer customer, Order order){
        paymentObj = new Payment();
        if(paymentObj.makePayment()){
            orderList.add(order);
            this.notifyAllUsers();
        }

    }

    private void notifyAllUsers(){
        // Notifies customer, operator and deliverypartner;
    }

    public void assignDeliveryPartner(){

        //iterate over list of partners and check if available in that area then assign partner;
    }

    public void cancelOrder(Customer customer, Order order){
    }





}
