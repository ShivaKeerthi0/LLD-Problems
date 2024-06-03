package onlineshoppingsystem;

import java.util.List;

public class Customer extends User{

    List<Order> orderList;
    Location location;
    Cart cart;
    OnlineShoppingManagementSystem systemObj;


    public Location getLocation() {
        return location;
    }

    public List<Order> getOrderList() {
        return orderList;
    }
    public void placeOrder(Order order){
        systemObj.placeOrder(order);
    }

    public void cancelOrder(Order order){
        systemObj.cancelOrder(order);
    }

    public void addItem(Item item){
        cart.addItemToCart(item);
    }

    public void deletItem(Item item){
        cart.deleteitemFromCart(item);
    }

    public void clearCart(){
        cart.clearCart();
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

}

