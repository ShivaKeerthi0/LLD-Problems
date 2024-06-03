package fooddeliverysystem;

import java.util.List;

public class Customer extends  User{

    Search searchObj;
    FoodDelieverySystem foodDeliverySystemObj;
    Cart cart;
    Location location;


     public List<Restuarant> getResturants(Location location){
         return (List<Restuarant>) searchObj.locationBasedResturants;
     }

     public void placeOrder(){
         Order order= new Order(this, cart.getResturant(), cart.getItems());
         foodDeliverySystemObj.placeOrder(this, order);
     }

     public void cancelOrder(Order order){
         foodDeliverySystemObj.cancelOrder(this, order);
     }

     public void addItem(FoodItem item){
         cart.addItemToCart();
     }

     public void deleteItem(FoodItem item){
         cart.deleteItemFromCart();
     }
}
