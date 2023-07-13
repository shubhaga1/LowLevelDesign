package com.shubhaga.design.parkinglot.model;

import com.shubhaga.design.parkinglot.dao.Vehicle;
import com.shubhaga.design.parkinglot.model.impl.TwoWheelerSpot;

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
