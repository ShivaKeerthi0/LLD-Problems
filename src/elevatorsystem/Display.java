package elevatorsystem;

public class Display {
    public  int floorNumber;
    public Direction direction;

    Display(){
        this.direction = Direction.NONE;
    }

    public Direction getDirection(){
        return direction;
    }

    public void showDirection(){
        System.out.println("Direction is " + this.direction);
    }
}
