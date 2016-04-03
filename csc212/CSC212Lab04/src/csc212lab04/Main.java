/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab04;

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
        // Intialize and declare variables
        String testSchool = "Oswego State";
        String testMovie = "Best in Show";
        int testYear = 2016;
        int matchCount = 0;
        String userMovie, userSchool, line;
        int userYear;
        
        // Create a scanner
        Scanner kb = new Scanner(System.in);
        
        /**
         * School name
         */
        
        // Prompt user to enter their school name and store their response
        System.out.println("Enter your school:");
        userSchool = kb.nextLine();
        
        // Compare the user entered school with the test school
        if (testSchool.equals(userSchool)) {
            // If there is a match, notify user and increment matches
            System.out.println("Me too!");
            matchCount = matchCount + 1;
        } else {
            // If there is no match then notify user
            System.out.println("I hear " + userSchool + " is nice.");
        }
        
        /**
         * Graduation year
         */
        
        // Prompt user to enter their graduation year and store their response
        System.out.println("Enter your grad year:");
        line = kb.nextLine();
        userYear = Integer.parseInt(line);
        
        // Compare the entered year with the test year
        if (testYear == userYear) {
            // If there is a match, notify user and increment matches
            System.out.println("Me too!");
            matchCount = matchCount + 1;
        } else {
            // If there is no match then notify user
            System.out.println("I graduate in " + testYear);
        }
        
        /**
         * Favorite movie
         */
        
        // Prompt user to enter their favorite move and store their response
        System.out.println("Enter your favorite movie:");
        userMovie = kb.nextLine();
        
        // Compare the user entered movie with the test movie
        if (testMovie.equals(userMovie)) {
            // If there is a match, notify user and increment matches
            System.out.println("Me too!");
            matchCount = matchCount + 1;
        } else {
            // If there is no match then notify user
            System.out.println("My favorite movie is " + testMovie);
        }
        
        /**
         * Match count
         */
        
        // Print blank line for spacing
        System.out.println("");
        
        // Print out match count
        System.out.println("Our match count is " + matchCount);
        
        // Print out summary of match count
        if (matchCount == 3) {
            // 3 Matches
            System.out.println("OMG! We're soulmates!");
        } else {
            if (matchCount == 2) {
                // 2 Matches
                System.out.println("We have a lot in common");
            } else {
                // 1 or less matches
                System.out.println("We should get to know each other better");
            }
        }
    }
    
}
