package parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    List<ParkingSlot> slots;
    private String floorname;
    public int numberOfSlots;

    ParkingFloor(String floorname, int numberOfSlots, List<ParkingSlot> slots){
        this.floorname = floorname;
        this.numberOfSlots = numberOfSlots;
        this.slots = slots;

    }

    public String getFloorname(){
        return  this.floorname;
    }

    public void addSlot(ParkingSlot slot){
        if(slots.size() == numberOfSlots){
            System.out.println("Floor limit reached !!!");
        }
        slots.add(slot);
    }

    public int getFreeSlotCountByVechileType(String type){
        int count = 0;
        for(ParkingSlot slot : slots){
            if(slot.getType().equals(type) && !slot.isOccupied()){
                count++;
            }
        }
        return count;
    }

    public boolean isSlotFreeByType(String type){
        for(ParkingSlot slot : slots){
            if(slot.getType().equals(type) && !slot.isOccupied()){
                return  true;
            }
        }
        return  false;
    }

    public ParkingSlot getFreeSlot(String type){
        for(ParkingSlot slot : slots){
            if(slot.getType().equals(type) && !slot.isOccupied()){
                return  slot;
            }
        }
        return null;
    }
}
