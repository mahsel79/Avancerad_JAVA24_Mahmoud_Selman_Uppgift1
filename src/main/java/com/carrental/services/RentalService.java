package com.carrental.services;

import com.carrental.models.Vehicle;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentalService {

    private final List<Vehicle> availableVehicles;

    public RentalService() {
        this.availableVehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        availableVehicles.add(vehicle);
    }

    public List<Vehicle> getAvailableVehicles() {
        return availableVehicles;
    }

    // Filter available vehicles by type
    public List<Vehicle> getAvailableVehiclesByType(String vehicleType) {
        return availableVehicles.stream()
                .filter(vehicle -> vehicle.getVehicleType().equalsIgnoreCase(vehicleType))
                .collect(Collectors.toList());
    }

    public Vehicle findVehicleByRegistration(String registrationNumber) {
        for (Vehicle vehicle : availableVehicles) {
            if (vehicle.getRegistrationNumber().equalsIgnoreCase(registrationNumber)) {
                return vehicle;
            }
        }
        return null;
    }
}
