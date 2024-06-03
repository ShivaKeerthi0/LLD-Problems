package parkinglot;

public class ParkingSlot {

    private String type;
    private boolean isOccupied;
    private String name;
    private String regNo; // we will track which vechile is parked using this based on regNo.

    ParkingSlot(String type, String name){
        this.type = type;
        this.name = name;
        this.isOccupied = false;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getRegNo() {
        return regNo;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void park(Vechile vechile){
        this.regNo = vechile.getRegNo();
    }

    public void unPark(){
        this.regNo = null;
    }
}
