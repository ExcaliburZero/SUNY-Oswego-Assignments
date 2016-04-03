/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author cwells2
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
        candyNames = new String[numNames];

        // Read in the candy names from the file and store them in the array
        for (int i = 0; i < numNames; i++) {
            candyNames[i] = sc.nextLine();
            System.out.println("Adding " + candyNames[i]);
        }

        // Create object to use to generate random numbers
        Random r = new Random();
        
        // Create scanner to take in input from the keyboard
        Scanner kb = new Scanner(System.in);
        
        // Create variables to store the random values for the creation of the candy objects
        String randName;
        float randPrice;
        int randOunces;
        Candy c;

        // Begin reading user commands
        System.out.println("Press ENTER for candy, or type 'quit'");
        String command = kb.nextLine();
        while (!command.equals("quit")) {
            // Create a candy using random parameters
            randName = candyNames[r.nextInt(numNames)];
            randPrice = r.nextFloat();
            randOunces = r.nextInt(3) + 1;
            c = new Candy(randName, randPrice, randOunces);
            
            // Print out the contents of the cnady object
            System.out.println(c);
            
            // Get the user's next command
            command = kb.nextLine();
        }

    }
}