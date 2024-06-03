package hotelmanagementsystem;

import java.util.Date;
import java.util.List;

public class Room {
     public int roomId;
     public RoomType roomType;
     private boolean isBooked;
     public List<RoomKey> keys;
     public double cost;

     Room(int roomId, RoomType roomType, List<RoomKey> keys, double cost){
         this.roomId = roomId;
         this.roomType = roomType;
         this.isBooked = false;
         this.keys = keys;
         this.cost = cost;
     }

    public boolean isBooked() {
        return isBooked;
    }

    public void setIsBooked(boolean booked) {
        this.isBooked = booked;
    }
    public double getCost() {
        return cost;
    }
}
