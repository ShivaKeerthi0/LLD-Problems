package hotelmanagementsystem;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hotel {
    private List<Room> rooms;
    private int hotelId;
    public Location location;
    public String name;
    private List<Booking> bookingsList;

    Hotel(int id, String name, Location location,List<Room> rooms ){
        this.hotelId = id;
        this.name = name;
        this.location = location;
        this.rooms = rooms;
        this.bookingsList = new ArrayList();
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Room> getAvailableRooms(){
        List<Room> availableRooms = new ArrayList<>();
        for(Room room : rooms) {
            if (!room.isBooked()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public List<Booking> getBookingsList() {
        return bookingsList;
    }

    public double calculateCost(Room room){
        return 0.0;
    }


    public void  bookRoom(Hotel hotel, Room room, Date startDate, Date endDate, Customer customer){
        room.setIsBooked(true);
        Booking booking = new Booking(1, room, startDate, endDate, customer);
        hotel.getBookingsList().add(booking);
    }

    public  void cancelRoom(Room room, int bookingId, Hotel hotel){
        room.setIsBooked(false);
        int index = 0;
        for(Booking b : hotel.getBookingsList()){
            index++;
            if(b.getBookingId() == bookingId){
                hotel.getBookingsList().remove(index);
            }
        }

    }

    public List<Room> searchRooms(Hotel hotel){
        return getAvailableRooms();
    }

}
