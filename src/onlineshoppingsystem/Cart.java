package onlineshoppingsystem;

import java.util.Map;

public class Cart {
    int cartId;
    Map<Item, Integer> items;


    public Map<Item, Integer> getItems() {
        return items;
    }

    public void setItems(Map<Item, Integer> items) {
        this.items = items;
    }

    public void addItemToCart(Item item){

    }

    public void deleteitemFromCart(Item item){

    }

    public void clearCart(){

    }
}
