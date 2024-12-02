package com.carrental.models;

import com.carrental.services.Rentable;

public abstract class Vehicle implements Rentable {
    private String model;
    private String registrationNumber;
    private double rentalPricePerDay;

    public Vehicle(String model, String registrationNumber, double rentalPricePerDay) {
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalPricePerDay * days;
    }

    // Abstract method to be implemented in subclasses
    public abstract String getVehicleType();
}
