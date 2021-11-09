/* Authored By Nicholas Phillimore */
package com.company.view;

import java.util.Scanner;

public class MainMenuView {

    public MainMenuView() {

    }

    //Method for displaying the main menu, dictates the text to be output
    public int displayMainMenu() {
        //open new scanner as variable s
        Scanner s = new Scanner(System.in);
        int menuChoice = 0;

        //outputs possible menu options
        System.out.println("Main Menu");
        System.out.println("");
        System.out.println("1. Assets Controller");
        System.out.println("2. Assets User menu");
        System.out.println("3. Log in");
        System.out.println("4. Quit");
        System.out.println("");
        System.out.println("Please enter your choice: ");

        //takes user input of number
        menuChoice = s.nextInt();

        //returns the users menu choice to the controller method
        return menuChoice;
    }

    //Method for display of assets main menu
    public int displayAssetControllerMenu() {
        //open new scanner as variable s
        Scanner s = new Scanner(System.in);
        int menuChoice = 0;

        //outputs possible menu options
        System.out.println("Assets Menu");
        System.out.println("Choose an asset type to control in the database");
        System.out.println("");
        System.out.println("1. End-Device asset menu");//Such as computers, mobile devices, smart phone
        System.out.println("2. Network device asset menu");//Network devices such as switches and network hubs
        System.out.println("3. Non-computer/Misc device asset menu");//Devices such as smart lights, temperature sensors
        System.out.println("4. Server asset menu");//Server assets such as server stack cases and accompanying parts
        System.out.println("5. Quit");//exit menu back to main
        System.out.println("");
        System.out.println("Please enter your choice: ");

        //takes user input of number
        menuChoice = s.nextInt();

        //returns the users menu choice to the controller method
        return menuChoice;
    }

    //Methods for displaying each individual type of asset types specified menu
    public int displayEndDeviceMenu() {
        //open new scanner as variable s
        Scanner s = new Scanner(System.in);
        int menuChoice = 0;

        //outputs possible menu options
        System.out.println("End devices control Menu");
        System.out.println("Choose a method to control assets in the database");
        System.out.println("");
        System.out.println("1. Add");//Such as computers, mobile devices, smart phone
        System.out.println("2. Modify");//Network devices such as switches and network hubs
        System.out.println("3. Delete");//Devices such as smart lights, temperature sensors
        System.out.println("4. Quit");//exit menu back to main
        System.out.println("");
        System.out.println("Please enter your choice: ");

        //takes user input of number
        menuChoice = s.nextInt();

        //returns the users menu choice to the controller method
        return menuChoice;
    }
    public int displayNetworkDeviceMenu() {
        //open new scanner as variable s
        Scanner s = new Scanner(System.in);
        int menuChoice = 0;

        //outputs possible menu options
        System.out.println("Network devices control Menu");
        System.out.println("Choose a method to control assets in the database");
        System.out.println("");
        System.out.println("1. Add");//Such as computers, mobile devices, smart phone
        System.out.println("2. Modify");//Network devices such as switches and network hubs
        System.out.println("3. Delete");//Devices such as smart lights, temperature sensors
        System.out.println("4. Quit");//exit menu back to main
        System.out.println("");
        System.out.println("Please enter your choice: ");

        //takes user input of number
        menuChoice = s.nextInt();

        //returns the users menu choice to the controller method
        return menuChoice;
    }
    public int displayNonCompMenu() {
        //open new scanner as variable s
        Scanner s = new Scanner(System.in);
        int menuChoice = 0;

        //outputs possible menu options
        System.out.println("Non Computer devices control Menu");
        System.out.println("Choose a method to control assets in the database");
        System.out.println("");
        System.out.println("1. Add");//Such as computers, mobile devices, smart phone
        System.out.println("2. Modify");//Network devices such as switches and network hubs
        System.out.println("3. Delete");//Devices such as smart lights, temperature sensors
        System.out.println("4. Quit");//exit menu back to main
        System.out.println("");
        System.out.println("Please enter your choice: ");

        //takes user input of number
        menuChoice = s.nextInt();

        //returns the users menu choice to the controller method
        return menuChoice;
    }

    public int displayUserMenu() {
        //open new scanner as variable s
        Scanner s = new Scanner(System.in);
        int menuChoice = 0;

        //outputs possible menu options
        System.out.println("Assets Menu");
        System.out.println("Choose an asset type to control in the database");
        System.out.println("");
        System.out.println("1. View assets in the system");//Such as computers, mobile devices, smart phone
        System.out.println("2. Search for vulnerabilities");//Network devices such as switches and network hubs
        System.out.println("3. Server asset menu");//Server assets such as server stack cases and accompanying parts
        System.out.println("4. Quit");//exit menu back to main
        System.out.println("");
        System.out.println("Please enter your choice: ");

        //takes user input of number
        menuChoice = s.nextInt();

        //returns the users menu choice to the controller method
        return menuChoice;
    }
}
