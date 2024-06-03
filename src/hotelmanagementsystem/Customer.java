package hotelmanagementsystem;

import java.util.ArrayList;

public class Customer extends User{


    Customer(int id, String name, Account account){
        super(id, name,account);

    }

    public void  orderRoomService(Room room){
        System.out.println("Ordering Room Service");

    }
}

