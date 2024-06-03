package universitycourseregistrationsystem;
import java.util.List;

public class Course {
    int courseId;
    int courseDuration;
    String courseName;
    int courseCapacity;
    List<Instructor> instructor;
    String courseCode;
    int registeredCount;

    public List<Instructor> getInstructor() {
        return instructor;
    }

    public int getCourseCapacity() {
        return courseCapacity;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseCapacity(int courseCapacity) {
        this.courseCapacity = courseCapacity;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void addInstructor(Instructor instructor) {
    }

    public int getRegisteredCount() {
        return registeredCount;
    }
}
