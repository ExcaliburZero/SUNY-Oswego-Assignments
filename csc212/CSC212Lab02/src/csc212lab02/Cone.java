/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab02;

/**
 *
 * @author cwells2
 */
public class Cone {
    // Declare variables
    int radius;     // Radius of the base
    int height;     // Height of the cone
    double volume;  // Volume of the cone
    
    // Declare methods
    
    /*
     * Constuctor method for the class Cone
     *
     * Takes in the radius of the base of the cone and the height of the cone
     */
    public Cone(int r, int h) {
        // Initialize the values of the radius and height to the arguements passed to the constructor method
        radius = r;
        height = h;
        
        // Calculate the volume of the cone and assign that value to the respective object variable
        volume = (Math.PI * r * r * h) / 3.0;
    }
    
    /*
     * Method to return the current volume of the cone based on its volume variable
     *
     * Returns the volume of the cone as a double
     */
    public double getVolume() {
        return volume;
    }
}
