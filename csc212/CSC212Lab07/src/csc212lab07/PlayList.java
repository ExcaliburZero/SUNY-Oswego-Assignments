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
public class PlayList {

    /**
     * Variables
     */
    private Song[] songs;  // The array of songs
    private int filled = 0; // The number of array posistions that have been filled

    /**
     * Methods
     */
    
    /**
     * Constructor
     *
     * @param size the number of songs in the song list
     */
    public PlayList(int size) {
        songs = new Song[size];
    }

    /**
     * isFull
     *
     * @return if the song array is fully filled or not
     */
    public boolean isFull() {
        return (filled >= songs.length);
    }

    /**
     * add
     *
     * @param t the title of the song to be added
     * @param a the artist of the song to be added
     */
    public void add(String t, String a) {
        // Iterate over the array of songs
        for (int i = 0; i < songs.length; i++) {
            // If the song entry is blank, then fill it
            if (songs[i] == null) {
                // Fill the song entry
                songs[i] = new Song(t, a);
                // Increment the number of song entries filled
                filled += 1;
                // Break since the song has been added
                break;
            }
        }
    }

    /**
     * display
     */
    public void display() {
        // Iterate over the array of songs
        for (int i = 0; i < songs.length; i++) {
            // If the current song entry is not empty, then print it
            if (songs[i] != null) {
                // Print the current song
                System.out.println(songs[i]);
            }
        }
    }

    /**
     * remove
     *
     * @param t the title of the song to be removed
     */
    public void remove(String t) {
        // Iterate over the array of songs
        for (int i = 0; i < songs.length; i++) {
            // Check if the current song exists
            if (songs[i] != null) {
                // Check if the current song is the one that has been specified to be removed
                if (songs[i].title.equals(t)) {
                    // Remove the current song from the array
                    songs[i] = null;
                    // Decrement the number of song entries that have been filled
                    filled -= 1;
                    // Break since the entry to be removed has been removed
                    break;
                }
            }
        }
    }
}
