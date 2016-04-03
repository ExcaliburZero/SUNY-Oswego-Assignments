/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw02;

/**
 *
 * @author chris
 */
public class Observation {
    /*
     * Variable declarations
     */
    private String date;    // The observation date
    private int windSpeed;  // Wind speed in MPH
    private int temperature;    // Temperature in degrees F
    private double windChill;   // The calculated wind chill
    
    /*
     * Method declarations
     */
    
    // Constructor method
    public Observation(String dateIn, int windSpeedIn, int temperatureIn) {
        // Set the values of several variables based on the parameters inputted
        date = dateIn;
        windSpeed = windSpeedIn;
        temperature = temperatureIn;
        
        // Calculate and store the wind chill
        windChill = 35.74 + 0.6215 * temperature - 35.75 * (Math.pow(windSpeed, 0.16)) + 0.4275 * temperature * (Math.pow(windSpeed, 0.16));
    }
    
    // Method to get the current wind chill
    public double getWindChill() {
        return windChill;
    }
    
    // Method to get the observation date
    public String getDate() {
        return date;
    }
}
