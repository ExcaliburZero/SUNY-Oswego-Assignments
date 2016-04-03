/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab06;

// Import statements
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
        String line;                            // The next line of input taken in by the program
        int request = 0;                        // The song that the user has most recently requested to see information on
        Scanner kb = new Scanner(System.in);    // The scanner used to take in input from the keyboard
        Song [] playList = new Song[5];         // The array used to store songs
        String userTitle, userArtist;           // The latest title and artist entered by the user
        
        // Add the various user entered songs into the playList array
        for (int i= 0; i < 5; i++) {
            // Ask the user for a title
            System.out.println("Enter Song " + i + " title:");
            userTitle = kb.nextLine();
            
            // Ask the user for the artist
            System.out.println("Enter Song " + i + " artist:");
            userArtist = kb.nextLine();
            
            // Call the Song constructor and assign the array element
            playList[i] = new Song(userTitle, userArtist);
        } 
        
        // Ask the user what song they would like to see information on
        System.out.println("Enter a song number (0-4), or q to quit:");
        line = kb.nextLine();
        
        // Until the user decides to quit, allow them to see information on various songs
        while(!line.equals("q")) {
            // Print out the information on the user requested song
            request = Integer.parseInt(line);
            System.out.println("Song " + request + ": " + playList[request]);
        
            // Ask the user what song they would like to see
            System.out.println("Enter a song number (0-4), or q to quit:");
            line = kb.nextLine();
        }
    }
    
}
