/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab07;

/* Imports */
import java.util.Scanner;

/**
 *
 * @author cwells2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Variables
         */
        PlayList p = new PlayList(5);   // The play list object to be used
        Scanner sc = new Scanner(System.in);    // The scanner to be used to read in input from the keyboard
        String command; // The command given by the user
        String title;   // The title of the current song
        String artist;  // The artist of the current song

        // Prompt the user to enter a command
        System.out.println("Enter a to add, r to remove, d to display, or q to quit:");
        // Read in the user's command from the keyboard
        command = sc.nextLine();
        // Interpret the user's command and continue to allow them to enter
        // commands until they quit the program
        while (!command.equals("q")) {
            // Interpret the command that the user entered
            if (command.equals("a")) {
                // Make sure that the play list is not full
                if (!p.isFull()) {
                    // Prompt the user to enter a title for the new song
                    System.out.print("Title: ");
                    // Take in the song title from the keyboard input
                    title = sc.nextLine();
                    // Prompt the user to enter an artist for the new song
                    System.out.print("Artist: ");
                    // Take in the song artist from the keyboard input
                    artist = sc.nextLine();

                    // Add the new song to the play list
                    p.add(title, artist);
                }
            } else if (command.equals("r")) {
                // Prompt the user to enter the title of the song to be removed
                System.out.print("Title: ");
                // Take in the title of the songe from the keyboard input
                title = sc.nextLine();
                // Remove the user specified song from the play list
                p.remove(title);
            } else if (command.equals("d")) {
                // Display the play list
                p.display();
            }

            // Prompt the user to enter another command
            System.out.println("Enter a to add, r to remove, d to display, or q to quit:");
            // Read in the user's command from the keyboard
            command = sc.nextLine();
        }

        // Print out that the program has ended
        System.out.println("Program Ended");
    }
    
}
