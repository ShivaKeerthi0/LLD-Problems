package fooddeliverysystem;

public class Restuarant {
    String restuarantName;
    Location location;
    int resturantId;
    Menu menu;
    ResturantType type;
    double rating;
    ResturantStatus status;


    public Location getLocation() {
        return location;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


    public void updateMenu(){

    }

    public ResturantStatus getStatus() {
        return status;
    }

    public void setStatus(ResturantStatus status) {
        this.status = status;
    }
}
