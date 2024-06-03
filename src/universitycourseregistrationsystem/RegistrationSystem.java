package universitycourseregistrationsystem;

import java.util.HashMap;
import java.util.List;

//singleton class
public class RegistrationSystem {
    List<University> universityList;


    public void registerCourse( Student student, Course course, University university){
        List<Course> courses =university.getCourseList();
        for(Course crse :  courses){
            if(crse.equals(crse) && crse.courseCapacity > crse.getRegisteredCount()){
                register(student, course, university);
            }
        }
    }

    private void register(Student student, Course course, University university){
        //code for registration.
        nofity();
    }

    private void nofity(){
        // code for notifying all entitites involved.
    }


    public void unRegisterCourse( Student student, Course course, University university){
        List<Course> courses =university.getCourseList();
        for(Course crse :  courses){
            unRegister(student, course, university);
        }
    }

    private void unRegister(Student student, Course course, University university){
        //code for registration.
        nofity();
    }

    public  void addUniversity(University university){

    }

    public  void addCourse(University university, Course course){

    }

    public void removeCourse(University university, Course course){

    }

}
