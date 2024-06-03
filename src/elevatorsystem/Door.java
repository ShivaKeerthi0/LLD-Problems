package elevatorsystem;

public class Door {
    private int id;
    private boolean isOpen;

    Door(int id){
        this.id = id;
        isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean val) {
        isOpen = val;
    }

    public int getId() {
        return id;
    }
}
