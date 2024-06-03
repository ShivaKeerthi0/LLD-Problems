package fooddeliverysystem;

public class Account {
    String email;
    String password;
    int accountId;

    public String getEmail() {
        return email;
    }

    public void updatePassword(String newPassword){
        this.password = newPassword;
    }
}
