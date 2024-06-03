package universitycourseregistrationsystem;

import java.util.List;

public class University {
    List<Course> courseList;
    List<Student> students;
    List<Instructor> instructorList;
    int uId;
    String name;
    Location location;
    int universityCapacity;

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public int getuId() {
        return uId;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void addCourse(Course course){

    }

    public void deleteCourse(Course course){

    }

    public void updateCourse(Course course){

    }

    public List<Instructor> getInstructorList() {
        return instructorList;
    }

    public void addInstructor(Instructor instructor){

    }

    public void removeInstructor(Instructor instructor){

    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){

    }

    public void removeStudent(Student student){

    }
}
