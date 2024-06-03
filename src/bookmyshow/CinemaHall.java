package bookmyshow;

import java.util.List;



public class CinemaHall {

    private Location location ;
    private int id;
    List<Audi> audiList;
    private String hallName;
    private int capacity;


    public String getHallName() {
        return hallName;
    }

    public List<Audi> getAudiList() {
        return audiList;
    }

    public Location getLocation() {
        return location;
    }
}
