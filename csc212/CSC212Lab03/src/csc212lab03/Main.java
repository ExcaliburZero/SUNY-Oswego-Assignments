/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab03;

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
        // Variable declarations
        String userString, line;
        int start, end;
        
        // Crerate scanner used to take in user input
        Scanner kb = new Scanner(System.in);
        
        // Prompt the user to enter a string and then read in the string
        System.out.println("Enter a charcter string:");
        userString = kb.nextLine();
        
        // Print out the string that the user entered
        System.out.println("You typed: " + userString);
        
        // Print out the length of the user entered string
        System.out.println("String length: " + userString.length());
        
        // Print out the string in lowercase
        System.out.println("Lower case: " + userString.toLowerCase());
        
        // Print out the string in uppercase
        System.out.println("Upper case: " + userString.toUpperCase());
        
        // Promt the user to enter a number and store it as the start position
        // of the substring
        System.out.println("Enter a start position: ");
        line = kb.nextLine();
        start = Integer.parseInt(line);
        
        // Promt the user to enter a number and store it as the end position of
        // the substring
        System.out.println("Enter an end position: ");
        line = kb.nextLine();
        end = Integer.parseInt(line);
        
        // Print out the character at the start position
        System.out.println("The character at position " + start + " is " + userString.charAt(start));
        
        // Print out the substring using the user entered start and endpoints
        System.out.println("The substring between positions " + start + " and " + end + " is " + userString.substring(start, end));
    }
    
}
