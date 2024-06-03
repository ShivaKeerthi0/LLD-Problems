package bookmyshow;

public class Admin extends User{
    private BookMyShowSystem bookMyShowSystem;
    Admin(int id, String name){
        super(id, name);
    }

    public  void addLocation(Location location){

    }
    public  void addCinemaHall(CinemaHall cinemaHall){

    }
    public void addShow(Show show, CinemaHall hall, Audi audi){

    }

    public void  updateMoive(Show show, CinemaHall hall, Audi audi){

    }
}
