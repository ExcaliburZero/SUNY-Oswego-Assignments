/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab09;

import java.io.FileNotFoundException;
import java.util.Random;

/**
 * The VendingMachine class is used to store a two dimensional array of Candy
 * objects. It allows one to display the Candy contained within it, and to
 * purchase individual pieces of Candy.
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class VendingMachine {

    private Candy[][] slots;
    private int shelves;
    private int slotsPerShelf;

    /**
     * The method used to construct a Vending Machine object. Sets the number of
     * shelves and slots per shelf, as well as setting the dimensions of the
     * Candy array.
     *
     * @param sh The number of shelves
     * @param sl The number of slots per shelf
     * @throws java.io.FileNotFoundException If the Candy name file does not
     * exist
     */
    public VendingMachine(int sh, int sl) throws FileNotFoundException {
        shelves = sh;
        slotsPerShelf = sl;
        slots = new Candy[shelves][slotsPerShelf];
    }

    /**
     * The method used to fill the VendingMachine with randomly generated Candy.
     *
     * @param names The possible names of the Candy
     */
    public void load(String[] names) {
        // Create a Random object to use for random number generation
        Random r = new Random();

        // Iterate over the shelves
        for (int i = 0; i < slots.length; i++) {
            // Iterate over the slots in a shelf
            for (int j = 0; j < slots[i].length; j++) {
                // Generate random values and create a new Candy object
                String randName = names[r.nextInt(names.length)];
                float randPrice = r.nextFloat();
                int randOunces = r.nextInt(3) + 1;
                slots[i][j] = new Candy(randName, randPrice, randOunces);
            }
        }
    }

    /**
     * The method used to display the Candy contained in the VendingMachine. It
     * prints out the contained Candy in a labeled grid.
     */
    public void display() {
        // Print the column labels
        System.out.print("  ");
        for (int j = 0; j < slots[0].length; j++) {
            System.out.printf("|%25d|", j);
        }
        System.out.println("");

        // Display the Candy contained in the VendingMachine
        for (int i = 0; i < slots.length; i++) {
            // Print the row label
            System.out.printf("%2d", i);
            for (int j = 0; j < slots[i].length; j++) {
                // If the slot is empty, then do not print it
                if (slots[i][j] == null) {
                    System.out.printf("|%25s|", "");
                } else {    // If the slot is full, then print out its contents
                    System.out.printf("|%25s|", slots[i][j].getName());
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * The method used to purchase a Candy from the VendingMachine.
     *
     * @param r The row of the Candy
     * @param s The slot of the Candy
     */
    public void purchase(int r, int s) {
        // If there is an item in row r, slot s, then purchase it
        if ((r >= 0) && (r < slots.length) && (s >= 0) && (s < slots[0].length) && (slots[r][s] != null)) {
            System.out.println("You purchased: " + slots[r][s]);
            slots[r][s] = null;
        } else {    // If there is no item in that slot, then inform the user of such
            System.out.println("Invalid selection");
        }
    }
}
