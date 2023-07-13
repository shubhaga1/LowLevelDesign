package com.shubhaga.parkinglot.model;

import com.shubhaga.parkinglot.dao.Vehicle;
import com.shubhaga.parkinglot.model.impl.TwoWheelerSpot;

public class ParkingSpot {
    Vehicle vehicle;
    int id;
    boolean isEmpty;
    double price;
    TwoWheelerSpot twoWheelerSpot;

    void parkVehicle(Vehicle vehicle){
        isEmpty = false;
        this.vehicle = vehicle;

    }

    void removeVehicle(Vehicle vehicle){
        this.vehicle = null;
        isEmpty = true;
    }
}
