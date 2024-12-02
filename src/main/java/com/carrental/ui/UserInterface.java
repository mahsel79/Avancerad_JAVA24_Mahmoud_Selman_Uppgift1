package com.carrental.ui;

import com.carrental.models.Vehicle;
import com.carrental.services.RentalService;

import java.util.Random;
import java.util.Scanner;

public class UserInterface {
    private final RentalService rentalService;
    private final Scanner scanner;

    public UserInterface(RentalService rentalService) {
        this.rentalService = rentalService;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            displayMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> displayAvailableVehicles();
                case 2 -> rentVehicle();
                case 3 -> {
                    System.out.println("Thank you for using the service!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void displayMainMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. View Available Vehicles");
        System.out.println("2. Rent a Vehicle");
        System.out.println("3. Exit");
        System.out.print("Please select an option: ");
    }

    private void displayAvailableVehicles() {
        System.out.println("\nAvailable Vehicles:");
        int index = 1;
        for (Vehicle vehicle : rentalService.getAvailableVehicles()) {
            System.out.printf("%d. %s (%s) - %,.2f SEK/day%n",
                    index++,
                    vehicle.getModel(),
                    vehicle.getVehicleType(),
                    vehicle.getRentalPricePerDay());
        }
    }

    private void rentVehicle() {
        System.out.println("\nPlease choose a vehicle option:");
        displayAvailableVehicles();

        System.out.print("Enter your choice: ");
        int vehicleChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (vehicleChoice < 1 || vehicleChoice > rentalService.getAvailableVehicles().size()) {
            System.out.println("Invalid choice. Returning to main menu.");
            return;
        }

        Vehicle selectedVehicle = rentalService.getAvailableVehicles().get(vehicleChoice - 1);

        System.out.printf("You selected: %s (%s)%n",
                selectedVehicle.getModel(),
                selectedVehicle.getVehicleType());

        System.out.print("Enter the number of rental days: ");
        int days = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        double cost = selectedVehicle.calculateRentalCost(days);
        System.out.printf("Total cost for renting the %s: %,.2f SEK%n", selectedVehicle.getModel(), cost);

        System.out.print("Confirm rental (yes/no): ");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("yes")) {
            String carNumber = generateRandomCarNumber();
            selectedVehicle.setRegistrationNumber(carNumber);
            rentalService.getAvailableVehicles().remove(selectedVehicle);

            System.out.printf("Thank you! Please pick up your vehicle. Your car number is %s.%n", carNumber);
        } else {
            System.out.println("Rental cancelled. Returning to main menu.");
        }
    }

    private String generateRandomCarNumber() {
        Random random = new Random();
        StringBuilder carNumber = new StringBuilder();

        // Generate 3 random uppercase letters
        for (int i = 0; i < 3; i++) {
            carNumber.append((char) ('A' + random.nextInt(26)));
        }

        // Generate 3 random digits
        for (int i = 0; i < 3; i++) {
            carNumber.append(random.nextInt(10));
        }

        return carNumber.toString();
    }
}
