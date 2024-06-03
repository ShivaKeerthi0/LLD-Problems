package hotelmanagementsystem;

import java.util.Date;

public class User {
    private int userId;
    private String name;
    private  Account account;


    User(int id, String name, Account account ){
        this.userId = id;
        this.name = name;
        this.account = account;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

