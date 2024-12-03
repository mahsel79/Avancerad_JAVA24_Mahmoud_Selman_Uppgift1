package com.carrental.app;

import com.carrental.models.Car;
import com.carrental.models.SUV;
import com.carrental.models.Truck;
import com.carrental.models.Convertible;
import com.carrental.services.RentalService;
import com.carrental.ui.UserInterface;
import com.utils.LoggerUtil;

public class VirtualCarRentalApplication {
    public static void main(String[] args) {
        try {
            LoggerUtil.logInfo("Application started.");

            // Initialize RentalService
            RentalService rentalService = new RentalService();
            LoggerUtil.logInfo("RentalService initialized.");

            // Add vehicles to the rental service
            rentalService.addVehicle(new Car("Toyota Corolla", null, 100));
            LoggerUtil.logInfo("Added vehicle: Toyota Corolla.");

            rentalService.addVehicle(new SUV("Volvo XC90", null, 200));
            LoggerUtil.logInfo("Added vehicle: Volvo XC90.");

            rentalService.addVehicle(new Truck("Mercedes Actros", null, 300));
            LoggerUtil.logInfo("Added vehicle: Mercedes Actros.");

            rentalService.addVehicle(new Convertible("BMW Z4", null, 150));
            LoggerUtil.logInfo("Added vehicle: BMW Z4.");

            // Initialize UserInterface with the rentalService
            UserInterface userInterface = new UserInterface(rentalService);
            LoggerUtil.logInfo("UserInterface initialized.");

            // Start the user interface to interact with the application
            userInterface.start();
            LoggerUtil.logInfo("User interface started.");

        } catch (Exception e) {
            LoggerUtil.logError("Application encountered an error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            LoggerUtil.logInfo("Application terminated.");
        }
    }
}
