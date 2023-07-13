package shubham.design.parkingLot;

import java.util.List;

public class ParkingLot {
    List<ParkingFloor> parkingFloors;
    List<EntryGate> entryGates;
    List<ExitGates> exitGates;
    Address address;

    public ParkingSpace getFreeParkingSpace(Vehicle vehicle) {
        return null;
    }

    public static void main(String[] args) {
        System.out.println("testing...`");
    }
}

class ParkingFloor {
    int floorId;
    List<ParkingSpace> parkingSpaces;
    Display display;

}

class ParkingSpace {
    int id;
    int floorId;
    ParkingSpaceType spaceType;
    Vehicle vehicle; // parking space has a vehicle
    double costPerHour;

    public boolean isFree() {
        return false;
    }

    public Vehicle getVehicle() {
        return null;
    }
}