package elevatorsystem;

public class OutSideButton implements  Button{

    private boolean isUpButton;
    private int value;

    OutSideButton(boolean isUpButton, int value){
        this.isUpButton = isUpButton;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isUpButton() {
        return isUpButton;
    }
}
