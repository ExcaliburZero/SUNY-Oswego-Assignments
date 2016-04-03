/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw08;

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

		// Greet the user
		System.out.println("Welcome to the CD Database");

		// Create and load the CDDB from the input file
		CDDB db = new CDDB();
		db.load("cds.csv");

		// Continuously prompt the user for input and act on it until they quit
		do {
			// Prompt the user to input a command
			System.out.println("Enter search, add, name, list, or quit:");
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
			} else if (command.equals("name")) {
				// Prompt the user to enter a partial name
				System.out.println("Enter the full or partial name:");
				String partialName = kb.nextLine();

				// Print out the cds whose artists contain the partial name
				db.printByName(partialName);
			} else if (command.equals("add")) {
				// Prompt the user to enter the cd information
				System.out.println("Enter the UPC:");
				String upc = kb.nextLine();
				System.out.println("Enter the price:");
				double price = kb.nextDouble();
				kb.nextLine();	// Clear out the buffer
				System.out.println("Enter the Artist:");
				String artist = kb.nextLine();
				System.out.println("Enter the Title:");
				String title = kb.nextLine();

				// Add the cd to the database
				db.addCD(upc, price, artist, title);
				System.out.println("Add complete.");
			} else if (command.equals("list")) {
				db.printAll();
			} else if (command.equals("quit")) {
				// Note that the program is ending
				System.out.println("Program ending.");
			} else {
				System.out.println("I don't understand your command. Please try again.");
			}
		} while (!command.equals("quit"));
	}

}
