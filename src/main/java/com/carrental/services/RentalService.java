package com.carrental.services;

import com.carrental.models.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentalService {

    private final List<Vehicle> availableVehicles;
    private final List<Vehicle> rentedVehicles;

    public RentalService() {
        this.availableVehicles = new ArrayList<>();
        this.rentedVehicles = new ArrayList<>();
    }

    // Add vehicle to the available list
    public void addVehicle(Vehicle vehicle) {
        availableVehicles.add(vehicle);
    }

    // Get all available vehicles
    public List<Vehicle> getAvailableVehicles() {
        return availableVehicles;
    }



    // Rent a vehicle
    public void rentVehicle(Vehicle vehicle) {
        availableVehicles.remove(vehicle);
        rentedVehicles.add(vehicle);
    }

    // Check if there are rented vehicles
    public boolean hasRentedVehicles() {
        return !rentedVehicles.isEmpty();
    }

    // Get the list of rented vehicles
    public List<Vehicle> getRentedVehicles() {
        return rentedVehicles;
    }

    // Return a rented vehicle
    public void returnVehicle(Vehicle vehicle) {
        rentedVehicles.remove(vehicle);
        availableVehicles.add(vehicle);
    }
}
