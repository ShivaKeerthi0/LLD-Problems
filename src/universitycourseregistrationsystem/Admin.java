package universitycourseregistrationsystem;

public class Admin extends User{

    String adminName;
    String adminId;
    RegistrationSystem registrationSystemObj;


    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminName() {
        return adminName;
    }

    public void addCourse(Course course, University university){
        registrationSystemObj.addCourse(university, course);
    }

    public void deleteCourse(Course course, University university){
        registrationSystemObj.removeCourse(university,course);
    }
    public void addUniverisity(University university){
        registrationSystemObj.addUniversity(university);
    }
}
