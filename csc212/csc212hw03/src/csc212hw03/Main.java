/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw03;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare variables
        String userString;  // The string the user enters
        int start;          // The start index of the substring
        int end;            // The end index of the substring
        int split;          // The split index of the split string
        
        // Create a scanner
        Scanner kb = new Scanner(System.in);
        
        // Prompt user to enter a string and store it
        System.out.println("Enter a string:");
        userString = kb.nextLine();
        
        // Prompt user to enter a start index and store it
        System.out.println("Enter a start index:");
        start = Integer.parseInt(kb.nextLine());
        
        // Check the constraints for the start index
        if ((start >= 0) && (start < userString.length())) {
        
            // Prompt user to enter an end index and store it
            System.out.println("Enter an end index:");
            end = Integer.parseInt(kb.nextLine());
        
            // Check the constraints for the end index
            if ((end > start) && (end <= userString.length())) {
                // Print out the substring betweent the start and end indecies
                System.out.println("The substring between " + start + " and " + end + " is " + userString.substring(start, end));
            } else {
                // Notify the user that the end index is invalid
                System.out.println("End index is invalid for " + userString);
            }
        } else {
            // Notify the user that the start index is invalid
            System.out.println("Start index is invalid for " + userString);
        }
        
        // Prompt the user to enter a split index and store it
        System.out.println("Enter a split index:");
        split = Integer.parseInt(kb.nextLine());
        
        // Check the constraints for the split index
        if ((split > 0) && (split < userString.length())) {
            // Print out the split strings
            System.out.println("Split strings: " + userString.substring(0, split) + " - " + userString.substring(split));
        } else {
            // Notify the user that the split index is invalid
            System.out.println("Split index is invalid for " + userString);
        }
    }
    
}
