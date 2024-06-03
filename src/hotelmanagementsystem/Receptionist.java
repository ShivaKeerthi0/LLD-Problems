package hotelmanagementsystem;

import java.util.Date;

public class Receptionist extends  User{

    Receptionist(int id, String name, Account account){
        super(id,name,account);
    }

    public void callService(Customer customer){
        System.out.println("Calling service as requested by Customer");
    }
}
