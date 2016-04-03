/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Main {

	/**
	 * @param args the command line arguments
	 * @throws java.io.FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		String line;	// The current line of the file
		Song [] songs;	// An array of the songs
		int lines = 0;	// The number of lines/songs in the input file
		int nextEntSong = 0;	// The next song to be entered
		String [] info = new String[3];	// An array to hold the split information
		String command;	// The user's latest command
		String subCommand;	// The user's latest subcommand
		
		// Create a file object and a scanner to read from the file of songs
		File musicCsv = new File("songs.csv");
		Scanner sc = new Scanner(musicCsv);
		
		// Create a scanner to read input from the keyboard
		Scanner kb = new Scanner(System.in);
		
		// Find how many lines the file contains
		Scanner lineFinder = new Scanner(musicCsv);
		while(lineFinder.hasNext()) {
			line = lineFinder.nextLine();
			lines += 1;
		}
		
		// Create the song array
		songs = new Song[lines];
		
		// Create a song object from each line of the file
		while(sc.hasNextLine()) {
			// Grab and seperate the contents of each line of the file
			line = sc.nextLine();
			info = line.split(",");
			
			// Create a song object based on the contents of the line
			songs[nextEntSong] = new Song(info[1], info[0], info[2]);
			nextEntSong += 1;
		}
		
		// Welcome the user to the music database
		System.out.println("Welcome to the Music Database");
		
		// Have the user enter commands until they quit
		do {
			// Prompt the user to enter a command
			System.out.println("Enter a search command (title, artist) or quit:");
			command = kb.nextLine();
			
			// Check what command the user entered
			if(command.equals("title")) {
				// Prompt the user to enter a title
				System.out.println("Enter a word or phrase in the title:");
				subCommand = kb.nextLine();
				
				// Iterate over all of the songs
				for (int i = 0; i < lines; i++) {
					// Print the song if it contains the search term in its title
					if(songs[i].getTitle().indexOf(subCommand) != -1) {
						System.out.println(songs[i]);
					}
				}
			} else if(command.equals("artist")) {
				// Prompt the user to enter an artist
				System.out.println("Enter part or all of the artist name:");
				subCommand = kb.nextLine();
				
				// Iterate over all of the songs
				for (int i = 0; i < lines; i++) {
					// Print the song if it contains the search term in its artist
					if(songs[i].getArtist().indexOf(subCommand) != -1) {
						System.out.println(songs[i]);
					}
				}				
			} else {
				if(!command.equals("quit")) {
					// If the user prints out an unkown command, then inform them of such
					System.out.println("Unknown command");
				}
			}
		} while(!command.equals("quit"));
	
		// Inform the user that the program has ended
		System.out.println("Closing the Music Database");
	}
}
