package com.carrental.models;

public class Car extends Vehicle {
    public Car(String model, String registrationNumber, double rentalPricePerDay) {
        super(model, registrationNumber, rentalPricePerDay);
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }
}
