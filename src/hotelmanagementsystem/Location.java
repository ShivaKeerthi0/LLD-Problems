package hotelmanagementsystem;

public class Location {
    public String street;
    public String area;
    public   String city;
    public String state;
    public String country;
    public int zipcode;

    Location(String street, String area, String city, String state, String country ,int zipcode){
        this.street = street;
        this.area = area;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }
}
