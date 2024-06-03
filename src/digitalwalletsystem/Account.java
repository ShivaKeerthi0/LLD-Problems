package digitalwalletsystem;

// This is account is w.r.t to the system, a user can have only one account registered.
public class Account {
    int accountId;
    String email;
    String password;
    String userName;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
