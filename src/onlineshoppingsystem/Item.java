package onlineshoppingsystem;

import java.util.List;

public class Item {
    int itemId;
    double itemPrice;
    List<Review> reviews;
    ItemStatus status;

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void addReview(Review review){

    }

    public int getItemId() {
        return itemId;
    }

    public ItemStatus getStatus() {
        return status;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
    }
}
