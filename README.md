# Virtual Car Rental Service

This project is a **Java-based Virtual Car Rental Service**, designed to simulate the process of renting and returning vehicles. Users can view available cars, rent a vehicle by selecting its type, receive a unique car number upon confirming the rental, and return rented vehicles.

---

## Table of Contents

1. [Project Overview](#project-overview)
2. [Features](#features)
3. [Technologies and Libraries](#technologies-and-libraries)
4. [Code Structure and Modules](#code-structure-and-modules)
5. [User Interface and Design](#user-interface-and-design)
6. [Vehicle Rental Process](#vehicle-rental-process)
7. [Return Vehicle Process](#return-vehicle-process)
8. [How to Run the Project](#how-to-run-the-project)

---

## Project Overview

The goal of this project is to provide a basic console-based car rental system. Users can:

- Browse a list of available vehicles.
- Select a vehicle type to rent.
- Confirm the rental and receive a unique car registration number.
- Return a rented vehicle by its registration number.
- Navigate back to the main menu or exit the application.

---

## Features

- **View Available Vehicles**: Lists all vehicles with their type, model, and daily rental price.
- **Rent a Vehicle**: Choose a vehicle type, specify rental days, and confirm the rental to receive a unique car registration number.
- **Return a Vehicle**: Allows users to return rented vehicles by providing the car's unique registration number.
- **Unique Car Numbers**: Generates a random registration number for rented vehicles in the format `ABC123`.
- **Interactive Menu**: A user-friendly menu interface for navigating between options.
- **Validation**: Input validation ensures correct data entry throughout the application.

---

## Technologies and Libraries

### Core Technologies

- **Java 21**: Built using Java 21, leveraging its modern features and performance improvements.
- **Java Collections Framework**: Manages the list of available and rented vehicles.

### Key Libraries

- **`java.util`**: Utilities like `Scanner` for user input and `Random` for generating unique car registration numbers.
- **`java.time`**: Handles calculations for rental durations and costs.

---

## Code Structure and Modules

The project is structured for clarity and maintainability:

```
VirtualCarRental/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── carrental/
│   │   │   │   │   ├── models/        // Vehicle definitions  
│   │   │   │   │   │   ├── Vehicle.java  
│   │   │   │   │   │   ├── Car.java  
│   │   │   │   │   │   ├── SUV.java  
│   │   │   │   │   │   ├── Truck.java  
│   │   │   │   │   │   ├── Convertible.java  
│   │   │   │   │   │  
│   │   │   │   │   ├── services/      // Business logic  
│   │   │   │   │   │   ├── Rentable.java  
│   │   │   │   │   │   ├── RentalService.java  
│   │   │   │   │   │   ├── CarFactory.java  
│   │   │   │   │   │  
│   │   │   │   │   ├── ui/            // Console interface  
│   │   │   │   │   │   ├── UserInterface.java  
│   │   │   │   │   │   ├── MenuHandler.java  
│   │   │   │   │   │  
│   │   │   │   │   ├── app/           // Main application class  
│   │   │   │   │   │   ├── VirtualCarRentalApplication.java  
│   │   │   │   │  
│   │   │   │   ├── utils/             // Utility classes  
│   │   │   │   │   ├── InputValidator.java  
│   │   │   │   │   ├── Logger.java  
│   │   ├── resources/                 // Resource files  
│  
├── README.md                          // Project description and instructions  
```  

---

## User Interface and Design

The application runs entirely in the console with a straightforward, text-based menu system.

### Menu Structure

**Main Menu**:
1. View Available Vehicles
2. Rent a Vehicle
3. Return a Vehicle
4. Exit

**Rent Vehicle Submenu**:
- Lists vehicle types (e.g., Car, SUV, Truck, Convertible).
- Asks for rental days.
- Displays the total rental cost and confirms the transaction.

**Return Vehicle Submenu**:
- Prompts the user to enter the registration number.
- Confirms the return and updates the available list.

### User Input

- Input validation ensures no invalid selections or data entry errors.

---

## Vehicle Rental Process

1. **View Vehicles**: Users select the "View Available Vehicles" option to see a list of cars with their details.
2. **Rent a Vehicle**:
    - Choose a vehicle type (e.g., Car, SUV, Truck, Convertible).
    - Specify the number of rental days.
    - Confirm the rental to receive a unique registration number.
3. **Confirmation**:
    - A unique car registration number (e.g., `XYZ456`) is generated.
    - Users can return to the main menu.

---

## Return Vehicle Process

1. **Select Return Vehicle**:
    - Enter the registration number of the rented car.
2. **Confirmation**:
    - The system validates the input and checks the registration number.
    - The car is returned successfully and added back to the available list.
3. **Post-Return**:
    - The user is notified of the successful return.

---

## How to Run the Project

### Prerequisites

- **Java 21 or Later**: Ensure Java is installed and configured.
- **IDE (Optional)**: IntelliJ IDEA is recommended but not required.

### Steps to Run

1. **Clone or Download**: Clone the repository or download the ZIP file.
2. **Compile the Project**:
    - Navigate to the project directory.
    - Use `javac` to compile all `.java` files in the `src` folder.
3. **Run the Application**:
    - Execute the main class: `com.carrental.app.VirtualCarRentalApplication`.
    - The menu-driven interface will appear in the console.

---

Enjoy renting and returning vehicles with the **Virtual Car Rental Service**!