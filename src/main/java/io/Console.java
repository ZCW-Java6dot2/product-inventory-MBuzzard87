package io;


import models.Guitar;
import models.Sneaker;
import services.GuitarService;
import services.SneakerService;

import java.util.Scanner;

public class Console {


    public static void printWelcome() {
        System.out.println("" +
                "**************************************************\n" +
                "***           Welcome and Bienvenue            ***\n" +
                "***                    to                      ***\n" +
                "***          ZipCo Inventory Manager           ***\n" +
                "**************************************************\n");
    }

    public static void displayMenu() {
        System.out.println("----> Press: \n" +
                        "1: Add to Inventory\n" +
                        "2: Existing products\n" +
                        "3: Update products\n" +
                        "4: Delete products\n" +
                        "5: Get report on products\n" +
                        "6: Exit"
                );
    }

    public static void Console() {
        Scanner in = new Scanner ( System.in );

        printWelcome();
        displayMenu();

        switch ( in.nextInt() ) {
            case 1:
                System.out.println ( "What product would you like to add inventory for?\n" +
                        "1. Guitar\n" +
                        "2. Sneakers\n");

                break;
            case 2:
                System.out.println ( "You picked option 2" );
                break;
            case 3:
                System.out.println ( "You picked option 3" );
                break;
            default:
                System.err.println ( "Unrecognized option" );
                break;
        }
    }




}



