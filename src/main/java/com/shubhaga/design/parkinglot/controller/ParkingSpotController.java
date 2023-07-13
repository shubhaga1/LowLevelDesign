package com.shubhaga.design.parkinglot.controller;

import com.shubhaga.design.parkinglot.model.ParkingSpot;

import java.util.List;

public class ParkingSpotController {
    List<ParkingSpot> parkingSpotList;

    public ParkingSpotController(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }
}
