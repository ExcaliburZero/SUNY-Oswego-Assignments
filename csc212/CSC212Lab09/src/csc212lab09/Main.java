/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // Create scanner to read from input file
        File f = new File("candy.txt");
        Scanner sc = new Scanner(f);

        // Create an array of the candy names
        String[] candyNames;

        // Take in the number of candy names
        int numNames = sc.nextInt();

        // Use up the uneeded portion of the curent line of the file
        sc.nextLine();

        // Set the size of the array of candy names
        candyNames = new String   [numNames];

        // Read in the candy names from the file and store them in the array
        for (int i = 0; i < numNames; i++) {
            candyNames[i] = sc.nextLine();
            System.out.println("Adding " + candyNames[i]);
        }

        // Create a Scanner to read user input
        Scanner kb = new Scanner(System.in);

        // Prompt the user for the information on the VendingMachine
        System.out.println("How many shelves in the vending machine?");
        int shelves = kb.nextInt();
        kb.nextLine();
        System.out.println("How many slots on each shelf?");
        int slotsPerShelf = kb.nextInt();
        kb.nextLine();

        // Create a VendingMachine based on the user's specifications
        VendingMachine vm = new VendingMachine(shelves, slotsPerShelf);
        vm.load(candyNames);
        vm.display();

        // Prompt the user to select a shelf and slot
        System.out.println("What shelf do you want?");
        int shelfSelection = kb.nextInt();
        kb.nextLine();
        System.out.println("What slot do you want?");
        int slotSelection = kb.nextInt();
        kb.nextLine();

        // Purchase the user specified Candy
        vm.purchase(shelfSelection, slotSelection);

        // Redisplay the contents of the VendingMachine
        vm.display();
    }
}
