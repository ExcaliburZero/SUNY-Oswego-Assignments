/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab01;

/**
 *
 * @author cwells2
 */
public class Person {
    /* Variable declarations */
    public String lastName;     // The last name of the person
    public String firstName;    // The first name of the person
    public int age;             // The age of the person
    
    /* Methods */
    
    /*
      Method to return the full name of the person as a string, with the first
      and last name seperated by a space.
    */
    public String getFullName() {
        return firstName + " " + lastName;
    }
}
