package universitycourseregistrationsystem;

import java.util.List;

public class Instructor extends User{
    int instructorId;
    List<Course> courseList;
    University university;
    String qualification;
    String designation;

    public List<Course> getCourseList() {
        return courseList;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public String getDesignation() {
        return designation;
    }

    public String getQualification() {
        return qualification;
    }

    public University getUniversity() {
        return university;
    }
    public void addCourse(Course course){

    }

}
