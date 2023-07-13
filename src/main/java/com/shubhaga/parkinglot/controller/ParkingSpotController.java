package com.shubhaga.parkinglot.controller;

import com.shubhaga.parkinglot.model.ParkingSpot;

import java.util.List;

public class ParkingSpotController {
    List<ParkingSpot> parkingSpotList;

    public ParkingSpotController(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }
}
