package fooddeliverysystem;

import java.util.HashMap;

public class Cart {

    int cartId;
    HashMap<FoodItem, Integer> items;
    Restuarant restuarant;

    public void clearCart(){

    }

    public void addItemToCart(){

    }

    public void deleteItemFromCart(){

    }

    public Restuarant getResturant() {
        return restuarant;
    }

    public HashMap<FoodItem, Integer> getItems() {
        return items;
    }
}
