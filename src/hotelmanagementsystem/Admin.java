package hotelmanagementsystem;

public class Admin extends  User{

    Admin(int id, String name, Account account){
        super(id, name,account);
    }

    public void addRoom(Hotel hotel, Room room){
        hotel.getRooms().add(room);
    }
    public void removeRoom(Hotel hotel, Room room){
        int index =0;
       for(Room key : hotel.getRooms()){
           index++;
           if(key.roomId == room.roomId){
                hotel.getRooms().remove(index);
           }
       }
    }

    public void editRoom(Hotel hotel, Room room, RoomType roomType){
        int index = 0;
        for(Room key : hotel.getRooms()){
            index++;
            if(key.roomId == room.roomId){
                Room r = hotel.getRooms().get(index);
                r.roomType =roomType;
                hotel.getRooms().set(index,r);
            }
        }
    }

}
