/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab12;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class Main {

	/**
	 * @param args the command line arguments
	 * @throws java.io.FileNotFoundException If the input file does not exist.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner kb = new Scanner(System.in);	// Scanner to read in user input
		String command;	// The user's latest command

		// Create and load the CDDB from the input file
		CDDB db = new CDDB();
		db.load("cds.csv");

		// Continuously prompt the user for input and act on it until they quit
		do {
			// Prompt the user to input a command
			System.out.println("Enter search, or quit:");
			command = kb.nextLine();

			// Act based on the entered command
			if (command.equals("search")) {
				// Prompt the user to enter a upc
				System.out.println("Enter the UPC:");
				String upc = kb.nextLine();

				// Get the cd info from the database
				String cdInfo = db.getCD(upc);

				// If the cd exists then print it out, if not then give a message as such
				if (cdInfo != null) {
					System.out.println(cdInfo);
				} else {
					System.out.println("CD not found");
				}

			} else if (command.equals("quit")) {
				// Note that the program is ending
				System.out.println("Program ending.");
			} else {
				System.out.println("I don't understand your command");
			}
		} while (!command.equals("quit"));
	}

}
