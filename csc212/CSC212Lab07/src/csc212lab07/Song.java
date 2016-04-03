/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab07;

/**
 *
 * @author cwells2
 */
public class Song {
    /**
     * Variables
     */
    public String title;    // The title of the song
    public String artist;   // The artist of the song
    
    /**
     * Methods
     */
    
    /**
     * Song
     * @param t the title of the song
     * @param a the artist of the song
     */
    // Create the constructor method
    public Song(String t, String a) {
        // Assign the values of the variables contained in the song object
        title = t;
        artist = a;
    }
    
    /**
     * toString
     * @return the title and the artist of the song
     */
    // Override the output of the object when it is printed as a string
    public String toString() {
        // Return the title and the artist of the song
        return "Title: " + title + "  Artist: " + artist;
    }
}
