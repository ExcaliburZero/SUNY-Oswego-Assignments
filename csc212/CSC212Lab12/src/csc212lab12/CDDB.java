/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class CDDB {

	private HashMap<String, CompactDisc> database;

	/**
	 * The method used to create a CDDB and initialize its database.
	 */
	public CDDB() {
		database = new HashMap();
	}

	/**
	 * The method used to load in compact disc information form a file and
	 * create CompactDisc objects based on them and store those objects in the
	 * database.
	 *
	 * @param fn The name of the input file
	 * @throws FileNotFoundException If the input file does not exist
	 */
	public void load(String fn) throws FileNotFoundException {
		// Create file and scanner objects to read in from the input file
		File f = new File(fn);
		Scanner sc = new Scanner(f);

		// Iterate over the entries of the input file and log the compac disc
		// info on each line
		while (sc.hasNextLine()) {
			// Create a scanner to read through the current line
			Scanner lineScanner = new Scanner(sc.nextLine());

			// Change the scanner to use a comma as a delimiter
			lineScanner.useDelimiter(",");

			// Create a CompactDisc object based on the info from the current line
			CompactDisc cd = new CompactDisc(lineScanner.next(),
					lineScanner.nextDouble(), lineScanner.next(),
					lineScanner.next());

			// Put the CompactDisc object in the database
			database.put(cd.getUPC(), cd);
		}
	}

	/**
	 * The method used to get the information on a CompactDisc based on its upc.
	 *
	 * @param key The upc of the disc
	 * @return The information on the disc
	 */
	public String getCD(String key) {
		// Check if the given key is in the database or not
		if (database.containsKey(key)) {
			// The key was found, so return the value
			return database.get(key).toString();
		} else {
			// The key was not found
			return null;
		}
	}
}
