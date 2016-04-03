/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw05;

/**
 * The Song class represents songs. Songs contains information on the song, such
 * as title, artist, and year of publish.
 *
 * @author cwells2
 */
public class Song {

	/*
	 * Variables
	 */
	private String title;	// The title of the song
	private String artist;	// The artist of the song
	private String year;	// The year the song was published

	/*
	 * Methods
	 */
	/**
	 * The constructor method of the Song class. Creates the object and assigns
	 * the values for the title and artist.
	 *
	 * @param t The title of the song.
	 * @param a The artist of the song.
	 * @param y The year the song was published.
	 */
	public Song(String t, String a, String y) {
		// Assign the values of the variables contained in the song object
		title = t;
		artist = a;
		year = y;
	}

	/**
	 * The method used to return the title, artist, and year of the song.
	 *
	 * @return The title, artist, and year of the song as a string.
	 */
	@Override
	public String toString() {
		// Return the title and the artist of the song
		return artist + ":" + title + ":" + year;
	}

	/**
	 * The method used to get the title of the song.
	 *
	 * @return The title of the song as a String.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * The method used to get the artist of the song.
	 *
	 * @return The artist of the song as a String.
	 */
	public String getArtist() {
		return artist;
	}
}
