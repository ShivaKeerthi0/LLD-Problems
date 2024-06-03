package onlineshoppingsystem;

import java.util.Map;

public class Order {

    Map<Item,Integer> items;
    double ordervalue;
    int orderId;
    User customer;
    OrderStatus status;
    Unit unitName;

    public Map<Item, Integer> getItems() {
        return items;
    }

    public double getOrdervalue() {
        return ordervalue;
    }

    public int getOrderId() {
        return orderId;
    }

    public User getCustomer() {
        return customer;
    }

    public Unit getUnitName() {
        return unitName;
    }


}
