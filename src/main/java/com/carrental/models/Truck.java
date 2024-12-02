package com.carrental.models;

public class Truck extends Vehicle {

    public Truck(String model, String registrationNumber, double rentalPricePerDay) {
        super(model, registrationNumber, rentalPricePerDay);
    }

    @Override
    public String getVehicleType() {
        return "Truck";
    }
}
