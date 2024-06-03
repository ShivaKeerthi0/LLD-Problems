package splitwise;

public class User {
    private String name;
    private int userID;

    User(int id, String name){
        this.userID = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    public String getName() {
        return name;
    }
    public int getUserID() {
        return userID;
    }

}

