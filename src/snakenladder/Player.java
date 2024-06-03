package snakenladder;

public class Player {

    private String name, email;
    public int position =0;

    Player( String name , String email){
        this.name = name;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  setEmail(String email){
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    public String getName() {
       return this.name;
    }


}
