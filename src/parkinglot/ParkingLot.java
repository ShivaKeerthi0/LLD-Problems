package parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
   List<ParkingFloor> parkingFloorList;

   ParkingLot(List<ParkingFloor> floors){
       this.parkingFloorList = floors;
   }

   public void parkVechile(Vechile vechile){
        boolean flag = false;
       for(ParkingFloor floor: parkingFloorList){
           if(floor.isSlotFreeByType(vechile.getType())){
               ParkingSlot slot = floor.getFreeSlot(vechile.getType());
               System.out.println("Vechile will be  parked in floor : "+ floor.getFloorname() +" and at slot :"+slot.getName());
               slot.setOccupied(true);
               slot.park(vechile);
               flag = true;
               System.out.println("Number of available slots are : " + floor.getFreeSlotCountByVechileType(vechile.getType()));
           }
       }
       if(!flag){
           System.out.println("Unable to park vechile as the parking lot is full !!!");
       }
   }

   public  void unParkVechile(Vechile vechile){
       for(ParkingFloor floor: parkingFloorList){
           for(ParkingSlot slot : floor.slots){
               if(slot.isOccupied() && slot.getRegNo().equals(vechile.getRegNo())){
                   slot.setOccupied(false);
                   slot.unPark();
                   System.out.println("Number of available slots are : " + floor.getFreeSlotCountByVechileType(vechile.getType()));
               }
           }
       }}}






