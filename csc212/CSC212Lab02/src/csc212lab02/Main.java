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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create several objects of class Cone and print out their volumes
        Cone cone1 = new Cone(8, 18);
        System.out.println("The volume is " + cone1.getVolume());
    }
}
