package hotelmanagementsystem;

public class Account {
    private String username;
    private String password;
    private AccountType accountType;

    Account(String username, String password, AccountType accountType){
        this.username = username;
        this.password = password;
        this.accountType = accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}


