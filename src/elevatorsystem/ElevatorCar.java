package elevatorsystem;
import java.util.List;

public class ElevatorCar {
    private Display display;
    private List<InsideButton> insideButtonList;
    private Direction direction;
    private ElevatorState state;
    private int currentFloor;
    private int doorId;

    ElevatorCar(Display display , List<InsideButton> buttons, int id){
        this.display = display;
        this.insideButtonList = buttons;
        this.direction = Direction.NONE;
        this.state = ElevatorState.IDLE;
        this.currentFloor = 0;
        this.doorId = id;
    }

    public void moveCarToFloor(Floor floor){

        // changes the currentFloor value after moving to floor;
        floor.openDoor(this.doorId);
    }


    public Direction getDirection() {
        return direction;
    }

    public ElevatorState getState() {
        return state;
    }

    public int getFloor() {
        return currentFloor;
    }

    public  int getDoorId(){
        return doorId;
    }
}
