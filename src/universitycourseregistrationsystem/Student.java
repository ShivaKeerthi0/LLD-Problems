package universitycourseregistrationsystem;

import java.util.List;

public class Student extends User{
    Search searchObj;
    Location location;
    int studentId;
    List<Course> courseRegistered;
    RegistrationSystem registrationSystemObj;
    String rollNo;


    public List<University> searchUniversity(Location location){
        return searchObj.getUniversityBasedOnLocation(location);
    }

    public List<Course> searchCourses(University university){
        return searchObj.getCourses(university);
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Course> getCourseRegistered() {
        return courseRegistered;
    }

    public void registerCourse(University university, Course course){
        registrationSystemObj.registerCourse(this, course, university);
    }

    public void unRegisterCourse(University university, Course course){
        registrationSystemObj.unRegisterCourse(this, course, university);
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

}
