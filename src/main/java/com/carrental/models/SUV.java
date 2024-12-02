package com.carrental.models;

public class SUV extends Vehicle {

    public SUV(String model, String registrationNumber, double rentalPricePerDay) {
        super(model, registrationNumber, rentalPricePerDay);
    }

    @Override
    public String getVehicleType() {
        return "SUV";
    }
}
