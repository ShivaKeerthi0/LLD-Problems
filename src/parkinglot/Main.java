package parkinglot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Vechile v1 = new Vechile("two-wheeler", "TS123#$", "red");
        Vechile v2 = new Vechile("four-wheeler", "TS@##!", "black");
        Vechile v3 = new Vechile("six-wheeler", "%^&*(*&^", "green");
        ParkingSlot s1 = new ParkingSlot("two-wheeler","s1");
        ParkingSlot s2 = new ParkingSlot("four-wheeler","s2");
        ParkingSlot s3 = new ParkingSlot("six-wheeler","s3");

        List<ParkingSlot> slots = new ArrayList<>();
        slots.add(s1);
        slots.add(s2);
        slots.add(s3);
        ParkingFloor pf = new ParkingFloor("f1", 3, slots);
        List<ParkingFloor> list= new ArrayList<>();
        list.add(pf);
        ParkingLot lot =new ParkingLot(list);

        lot.parkVechile(v1);
        lot.parkVechile(v2);
        lot.parkVechile(v3);
        lot.unParkVechile(v1);


    }
}
