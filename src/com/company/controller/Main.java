package com.company.controller;

import com.company.view.Header;
import com.company.view.MenuView;
import com.company.model.*;

import java.util.ArrayList;

public class Main {

    private final Header header;
    private final MenuView mainMenu;

    //Create arraylist for storing assets of all types.
    private final ArrayList<AssetList> assetList;

    public Main(){
        mainMenu = new MenuView();
        header = new Header();
        assetList = new ArrayList();
    }

    //Main Menu, can access each sub-menu.
    public void runMainMenu() {
        //Declared variables, quit set to false
        int choice;
        boolean quit = false;

        //Begins a while loop, this will continue to be run until "quit" becomes
        //true
        while (!quit) {

            //This displays the text as displayed here, which is formatted by
            //displayHeader
            header.displayHeader("Scottishglen", "Main Menu");

            //Takes input of users choice on main menu
            choice = mainMenu.displayMainMenu();

            //This switch statement contains each of the possible menu
            //selections, when the user selects options 1-7, if 7 is selected
            //the "quit" becomes true and the program will be brought to an end
            switch (choice) {
                case 1:
                    //Sub menu for assets in the database(Adding new, removing and updating current entries)
                    AssetControllerMenu();
                    break;
                case 2:
                    //Sub menu for assets menu accessible by user(For viewing and accessing details regarding the entry)
                    AssetsMenu();
                    break;
                case 3:
                    //Go to user menu
                    UserMenu();
                    break;
                case 0:
                    //End program
                    quit = true;
                    break;
                default:
                    //If an invalid option is selected, message will be displayed
                    header.displayError(1, "Incorrect selection");
                    break;
            }
        }
    }

    private void UserMenu() {
        //Declared variables, quit set to false
        int choice;
        boolean quit = false;

        //Begins a while loop, this will continue to be run until "quit" becomes
        //true
        while (!quit) {

            //This displays the text as displayed here, which is formatted by
            //displayHeader
            header.displayHeader("Scottishglen", "User account");

            //Takes input of users choice on main menu
            choice = mainMenu.displayUserMenu();

            //This switch statement contains each of the possible menu
            //selections, when the user selects options 1-4, if 4 is selected
            //the "quit" becomes true and the menu will step back
            switch (choice) {
                case 1:
                    //Sub menu for assets in the database(Adding new, removing and updating current entries)
                    //Login();
                    break;
                case 2:
                    //Sub menu for assets menu accessible by user(For viewing and accessing details regarding the entry)
                    //PasswordReset();
                    header.displayError(2, "Feature not implemented");
                    break;
                case 3:
                    //CreateAccount();
                    header.displayError(2, "Feature not implemented");
                    break;
                case 0:
                    //End program
                    quit = true;
                    break;
                default:
                    //If an invalid option is selected, message will be displayed
                    header.displayError(1, "Incorrect selection");
                    break;
            }
        }
    }

    private void AssetsMenu() {
        //Declared variables, quit set to false
        int choice;
        boolean quit = false;

        //Begins a while loop, this will continue to be run until "quit" becomes
        //true
        while (!quit) {

            //This displays the text as displayed here, which is formatted by
            //displayHeader
            header.displayHeader("Scottishglen", "Assets menu");

            //Takes input of users choice on main menu
            choice = mainMenu.displayAssetMenu();

            //This switch statement contains each of the possible menu
            //selections, when the user selects options 1-4, if 4 is selected
            //the "quit" becomes true and the menu will step back
            switch (choice) {
                case 1:
                    //SearchAssets();
                    header.displayError(2, "Feature not implemented");
                    break;
                case 2:
                    //CheckVulnerabilities();
                    header.displayError(2, "Feature not implemented");
                    break;
                case 3:
                    //ViewAllAssets();
                    header.displayError(2, "Feature not implemented");
                    break;
                case 0:
                    //End program
                    quit = true;
                    break;
                default:
                    //If an invalid option is selected, message will be displayed
                    header.displayError(1, "Incorrect selection");
                    break;
            }
        }
    }

    //Sub-Menus, can access each specified tool(4 each).
    public void AssetControllerMenu() {
        //Declared variables, quit set to false
        int choice;
        boolean quit = false;

        //Begins a while loop, this will continue to be run until "quit" becomes
        //true
        while (!quit) {

            //This displays the text as displayed here, which is formatted by
            //displayHeader
            header.displayHeader("Scottishglen", "Assets modification");

            //Takes input of users choice on main menu
            choice = mainMenu.displayAssetControllerMenu();

            //This switch statement contains each of the possible menu
            //selections, when the user selects options 1-4, if 4 is selected
            //the "quit" becomes true and the menu will step back
            switch (choice) {
                case 1:
                    //EndUserDeviceMenu();
                    header.displayError(2, "Feature not implemented");
                    break;
                case 2:
                    //NetworkDeviceMenu();
                    header.displayError(2, "Feature not implemented");
                    break;
                case 3:
                    //NonComputerDeviceMenu();
                    header.displayError(2, "Feature not implemented");
                    break;
                case 0:
                    //End program
                    quit = true;
                    break;
                default:
                    //If an invalid option is selected, message will be displayed
                    header.displayError(1, "Incorrect selection");
                    break;
            }
        }
    }

    //Methods for modifying specific items in the database, allows selection of a method, such as add or modify, then
    //takes input, the request is then sent to the database.
    public AssetList EndDeviceDialogue() {

    }
    public AssetList NetworkDeviceDialogue() {

    }
    public AssetList NonCompDeviceDialogue() {
    }

    //program starts from here, this ensures it does not attempt to start a new iteration before opening the menus.
    public static void main(String[] args) {
        Main m = new Main();
        m.runMainMenu();
    }
}



