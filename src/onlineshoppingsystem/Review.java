package onlineshoppingsystem;

public class Review {
    String description;
    Customer customer;
    int rating;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }

    public void updateReview(){

    }
}
