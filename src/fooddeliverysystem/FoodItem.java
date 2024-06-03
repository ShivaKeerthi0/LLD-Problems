package fooddeliverysystem;

public class FoodItem {
    double price;
    int id;
    boolean isAvailable;
    String name;
    double rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


