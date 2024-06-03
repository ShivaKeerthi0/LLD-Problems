package elevatorsystem;

import java.util.List;

public class ElevatorSystem {
    private List<ElevatorCar> cars;
    private List<Floor> floors;

    ElevatorSystem(List<ElevatorCar> cars){
        this.cars = cars;
    }

    public void addCar(ElevatorCar car){
        this.cars.add(car);
    }

    public ElevatorCar getNearestElevatorCar(int floor){
        ElevatorCar minCar = null;
        int minDistance = Integer.MAX_VALUE;
        for(ElevatorCar car : cars){
            if(car.getState() == ElevatorState.IDLE && minDistance > (Math.abs(car.getFloor() - floor))){
                minDistance = Math.abs(car.getFloor() - floor);
                minCar = car;
            }
        }

        return minCar;
    }
    public Floor getfloor(int floorID){
        for(Floor floor :floors){
            if(floor.id == floorID){
                return floor;
            }
        }
        return  null;
    }
}
