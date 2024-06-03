package fooddeliverysystem;

import java.util.HashMap;
import java.util.List;

public class Order {
    long orderID;
    HashMap<FoodItem, Integer> items;
    Restuarant resturant;
    Customer customer;
    OrderStatus status;

    Order(Customer customer, Restuarant resturant, HashMap<FoodItem ,Integer> items){
        this.items = items;
        this.resturant = resturant;
        this.customer = customer;
        this.orderID = 123;
        this.status = OrderStatus.PENDING;
    }

    public HashMap<FoodItem, Integer> getItems() {
        return items;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void updateStatus(){

    }

}

