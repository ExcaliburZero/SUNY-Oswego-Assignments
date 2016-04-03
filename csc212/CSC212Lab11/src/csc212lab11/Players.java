/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Players class is used to represent a set of baseball players. It contains
 * an ArrayList of players and their corresponding ids. It has several methods
 * for importing and searching through the players based on their ids and last
 * names.
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class Players {

	private ArrayList<Player> list;	// The list of players
	private ArrayList<String> ids;	// The ids of the players

	/**
	 * The method used to construct a Players object and initialize its
	 * ArrayLists.
	 */
	public Players() {
		list = new ArrayList<Player>();
		ids = new ArrayList<String>();
	}

	/**
	 * The method used to import player information from a specified input file.
	 *
	 * @param fn The name of the input file
	 * @throws FileNotFoundException If the specified input file does not exist
	 */
	public void load(String fn) throws FileNotFoundException {
		// Create File and Scanner objects to read in input from the file
		File f = new File(fn);
		Scanner sc = new Scanner(f);

		// Iterate over the lines of the input file
		while (sc.hasNextLine()) {
			// Setup a Scanner to read in tokens from the input line seperated by commas
			Scanner lineScanner = new Scanner(sc.nextLine());
			lineScanner.useDelimiter(",");

			// Add the information from the line to the ArrayLists
			ids.add(lineScanner.next());
			list.add(new Player(lineScanner.next(), lineScanner.next()));
		}
	}

	/**
	 * The method used to return the information on the player with the
	 * specified id.
	 *
	 * @param id The id of the player to get information on
	 * @return The name of the player whose id was specified
	 */
	public String getPlayerByID(String id) {
		// Get the index of the specified player
		int index = ids.indexOf(id);

		// Check if the player id was found or not
		if (index > -1) {
			// The player was found, so return their name
			return list.get(index).toString();
		} else {
			// The player was not found so return as such
			return null;
		}
	}

	/**
	 * The method used to return the id of and information on each of the
	 * players with a specified last name.
	 *
	 * @param l The last name to search for
	 */
	public void printIdsByName(String l) {
		// Print the ids of all of the players with the specified last name
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getLastName().equals(l)) {
				// If the name matches, then print out the player's id and name
				System.out.println(ids.get(i) + ": " + list.get(i));
			}
		}
	}

	// TODO somethoing
}
