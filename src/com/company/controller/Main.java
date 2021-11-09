package com.company.controller;

import com.company.view.Header;
import com.company.view.MainMenuView;
import com.company.model.*;

import java.util.ArrayList;
import java.util.Objects;

public class Main {

    private final Header header;
    private final MainMenuView mainMenu;

    //Create arraylist for storing assets of all types
    private final ArrayList<AssetList> assetList;

    public Main(){
        mainMenu = new MainMenuView();
        header = new Header();
        assetList = new ArrayList();
    }
    //Main Menu, can access each sub-menu
    public void runMainMenu() {
        //Declared variables, quit set to false
        int choice;
        boolean quit = false;

        //Begins a while loop, this will continue to be run until "quit" becomes
        //true
        while (!quit) {

            //This displays the text as displayed here, which is formatted by
            //displayHeader
            header.displayHeader("Library", "Main Menu");

            //Takes input of users choice on main menu
            choice = mainMenu.displayMainMenu();

            //This switch statement contains each of the possible menu
            //selections, when the user selects options 1-7, if 7 is selected
            //the "quit" becomes true and the program will be brought to an end
            switch (choice) {
                case 1:
                    //Sub menu for assets in the database(Adding new, removing and updating current entries)
                    //assetsController();
                    break;
                case 2:
                    //Sub menu for assets menu accessible by user(For viewing and accessing details regarding the entry)
                    //assetsMenu();
                    break;
                case 3:
                    //Journal
                    //login();
                    break;
                case 4:
                    //End program
                    quit = true;
                    break;
                default:
                    //If an invalid option is selected, message will be displayed
                    //header.displayError(1, "Incorrect selection");
                    break;
            }
        }
    }

    //program starts from here, this ensures it does not attempt to start a new iteration before opening the menus.
    public static void main(String[] args) {
        Main m = new Main();
        m.runMainMenu();
    }
}



