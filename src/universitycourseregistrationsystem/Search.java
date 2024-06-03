package universitycourseregistrationsystem;

import java.util.HashMap;
import java.util.List;

public class Search {
    List<University> universityList;
    HashMap<Location,List<University>> universityHashMap;


    public HashMap<Location, List<University>> getUniversityHashMap() {
        return universityHashMap;
    }

    public List<University> getUniversityList() {
        return universityList;
    }

    public List<University> getUniversityBasedOnLocation(Location location){
        return universityHashMap.get(location);
    }

    public List<Course> getCourses(University university){
        return null;
    }
}
