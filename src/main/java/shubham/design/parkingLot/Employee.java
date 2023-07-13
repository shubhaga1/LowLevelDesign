package shubham.design.parkingLot;

public class Employee {
    int id;
    String name;
    Account account;
}

class Admin extends Employee {
    public boolean addParkingFloor(ParkingLot parkingLot, ParkingFloor parkingFloor) {
        return false;
    }

    public boolean addParkingSpace(ParkingFloor parkingFloor, ParkingSpace parkingSpace) {
        return false;
    }

    public boolean addDisplayBoard(ParkingFloor parkingFloor, Display display) {
        return false;
    }
}

class ParkingAttendent extends Employee {

}