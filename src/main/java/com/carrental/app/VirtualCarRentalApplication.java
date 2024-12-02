package com.carrental.app;

import com.carrental.models.Car;
import com.carrental.models.SUV;
import com.carrental.models.Truck;
import com.carrental.models.Convertible;
import com.carrental.services.RentalService;
import com.carrental.ui.UserInterface;

public class VirtualCarRentalApplication {
    public static void main(String[] args) {
        // Initialize RentalService with no arguments
        RentalService rentalService = new RentalService();

        // Add vehicles to the rental service
        rentalService.addVehicle(new Car("Toyota Corolla", "CAR001", 100));
        rentalService.addVehicle(new SUV("Volvo XC90", "SUV001", 200));
        rentalService.addVehicle(new Truck("Mercedes Actros", "TRK001", 300));
        rentalService.addVehicle(new Convertible("BMW Z4", "CON001", 150));

        // Initialize UserInterface with the rentalService
        UserInterface userInterface = new UserInterface(rentalService);

        // Start the user interface to interact with the application
        userInterface.start();
    }
}
