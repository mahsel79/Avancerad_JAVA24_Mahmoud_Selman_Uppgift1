package com.carrental.ui;

public class MenuHandler {

    private final UserInterface userInterface;

    public MenuHandler(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    public void showMenu() {
        userInterface.start();  // Start the user interface which includes displaying the menu
    }
}
