package elevatorsystem;

import java.util.List;

public class Floor {
    public int id;
    private List<Door> doors;
    private List<Button> buttons;

    public void openDoor(int doorID){

        for(Door door : doors){
            if(door.getId() ==doorID){
                door.setOpen(true);
            }
        }
    }

    public void closeDoor(int doorID){
        for(Door door : doors){
            if(door.getId() ==doorID){
                door.setOpen(false);
            }
        }
    }
}
