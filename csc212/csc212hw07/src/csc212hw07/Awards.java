/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class Awards {

	private ArrayList<Award> list;	// The list of awards
	private ArrayList<String> ids;	// The list of player ids for each award

	/**
	 * The method used to construct a new Awards object and initialize its
	 * ArrayLists.
	 */
	public Awards() {
		list = new ArrayList<Award>();
		ids = new ArrayList<String>();
	}

	/**
	 * The method used to load in awards from an input file.
	 *
	 * @param fn The name of the input file
	 * @throws java.io.FileNotFoundException If the input file does not exist
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
			list.add(new Award(lineScanner.next(), lineScanner.next(), lineScanner.next()));
		}
	}

	/**
	 * The method used to print all of the awards of the player with the
	 * specified id.
	 *
	 * @param id The id of the player whose awards are to be printed
	 */
	public void printAwards(String id) {
		// Create ArrayList to store the idexs of the awards that the give person has recieved
		ArrayList<Integer> matches = new ArrayList<Integer>();

		// Find all of the awards for the given id
		for (int i = 0; i < ids.size(); i++) {
			if (ids.get(i).equals(id)) {
				matches.add(i);
			}
		}

		// If there are any awards that match the id, then print them out
		if (!matches.isEmpty()) {
			for (int i = 0; i < matches.size(); i++) {
				System.out.println(list.get(matches.get(i)));
			}
		} else {
			// If there were no matching awards, then note that that was the case
			System.out.println("No awards for this player.");
		}
	}
}
