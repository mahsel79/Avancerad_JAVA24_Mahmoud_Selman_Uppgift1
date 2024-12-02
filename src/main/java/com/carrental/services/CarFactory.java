package com.carrental.services;

import com.carrental.models.*;

import java.util.Random;

public class CarFactory {

    private static final String[] CAR_MODELS = {"Toyota Corolla", "Honda Civic", "Ford Focus"};
    private static final String[] SUV_MODELS = {"Volvo XC90", "Toyota Highlander", "BMW X5"};
    private static final String[] TRUCK_MODELS = {"Ford F-150", "Ram 1500", "Chevrolet Silverado"};
    private static final String[] CONVERTIBLE_MODELS = {"Mazda MX-5", "BMW Z4", "Audi TT"};

    private static final Random RANDOM = new Random();

    /**
     * Creates a random vehicle of any type.
     *
     * @return a randomly generated vehicle (Car, SUV, Truck, or Convertible).
     */
    public static Vehicle createRandomVehicle() {
        int type = RANDOM.nextInt(4); // Generate a number between 0 and 3
        switch (type) {
            case 0:
                return createRandomCar();
            case 1:
                return createRandomSUV();
            case 2:
                return createRandomTruck();
            case 3:
                return createRandomConvertible();
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }

    /**
     * Creates a random car.
     *
     * @return a randomly generated car.
     */
    public static Car createRandomCar() {
        String model = CAR_MODELS[RANDOM.nextInt(CAR_MODELS.length)];
        String registrationNumber = generateRandomRegistrationNumber();
        double rentalPricePerDay = 80 + RANDOM.nextInt(21); // Price between 80 and 100
        return new Car(model, registrationNumber, rentalPricePerDay);
    }

    /**
     * Creates a random SUV.
     *
     * @return a randomly generated SUV.
     */
    public static SUV createRandomSUV() {
        String model = SUV_MODELS[RANDOM.nextInt(SUV_MODELS.length)];
        String registrationNumber = generateRandomRegistrationNumber();
        double rentalPricePerDay = 120 + RANDOM.nextInt(31); // Price between 120 and 150
        return new SUV(model, registrationNumber, rentalPricePerDay);
    }

    /**
     * Creates a random truck.
     *
     * @return a randomly generated truck.
     */
    public static Truck createRandomTruck() {
        String model = TRUCK_MODELS[RANDOM.nextInt(TRUCK_MODELS.length)];
        String registrationNumber = generateRandomRegistrationNumber();
        double rentalPricePerDay = 150 + RANDOM.nextInt(51); // Price between 150 and 200
        return new Truck(model, registrationNumber, rentalPricePerDay);
    }

    /**
     * Creates a random convertible.
     *
     * @return a randomly generated convertible.
     */
    public static Convertible createRandomConvertible() {
        String model = CONVERTIBLE_MODELS[RANDOM.nextInt(CONVERTIBLE_MODELS.length)];
        String registrationNumber = generateRandomRegistrationNumber();
        double rentalPricePerDay = 100 + RANDOM.nextInt(51); // Price between 100 and 150
        return new Convertible(model, registrationNumber, rentalPricePerDay);
    }

    /**
     * Generates a random registration number in the format of 3 letters followed by 3 digits (e.g., ABC123).
     *
     * @return a random registration number.
     */
    private static String generateRandomRegistrationNumber() {
        char[] letters = new char[3];
        for (int i = 0; i < 3; i++) {
            letters[i] = (char) ('A' + RANDOM.nextInt(26)); // Generate random uppercase letters
        }
        int numbers = 100 + RANDOM.nextInt(900); // Generate a random 3-digit number
        return new String(letters) + numbers;
    }
}
