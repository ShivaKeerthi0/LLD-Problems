package fooddeliverysystem;

import java.util.HashMap;
import java.util.List;

public class Search {
    HashMap<Location, List<Restuarant>> locationBasedResturants;
    HashMap<ResturantType, List<Restuarant>> typeBasedResturants;


    public List<Restuarant> getLocationBasedResturants(Location location) {
        return locationBasedResturants.get(location);
    }

    public List<Restuarant> getTypeBasedResturants(ResturantType type) {
        return typeBasedResturants.get(type);
    }
}
