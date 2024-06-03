package crs;
import java.util.List;

public class Search {
    List<Location> locationList;
    List<Car> carList;

    public List<Location> getLocationList() {
        return locationList;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public List<Car> getUnBookedCars(CarStatus status){
        return null;
    }

    public List<Car> getCarsBasedOnLocation(Location location){
        return null;
    }

}
