/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw02;

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
        /*
         * Variable declarations
         */
        String date;
        int windSpeed;
        int temperature;
        
        // Create scanner
        Scanner kb = new Scanner(System.in);
        
        // Prompt the user to enter the observation date
        System.out.println("Enter the observation date:");
        
        // Take in the observation date and store it
        date = kb.nextLine();
        
        // Prompt the user to enter the wind speed and store it
        System.out.println("Enter the wind speed in MPH:");
        
        // Take in the wind speed and store it
        windSpeed = Integer.parseInt(kb.nextLine());
        
        // Prompt the user to enter the temperature and store it
        System.out.println("Enter the temperature in degrees F:");
        
        // Take in the temperature and store it
        temperature = Integer.parseInt(kb.nextLine());
        
        // Create the observation object
        Observation first = new Observation(date, windSpeed, temperature);
        
        // Print out the observation date
        System.out.println("Observation date: " + first.getDate());
        
        // Print out the wind chill
        System.out.println("Wind chill: " + first.getWindChill());
    }
    
}
