/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw07;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class Main {

	/**
	 * @param args The command line arguments
	 * @throws java.io.FileNotFoundException If either of the input files do not
	 * exist
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner kb = new Scanner(System.in);
		Players p = new Players();
		Awards a = new Awards();
		String command;	// The last command that the user entered
		String id;
		String playerName;
		String lastName;

		// Load in the players and awards from the input files
		p.load("players.txt");
		a.load("awards.txt");

		// Print a welcome message
		System.out.println("Welcome to the Baseball Database");

		// Take in user commands and act on them until the user quits
		do {
			// Prompt the user to enter a command
			System.out.println("Enter id, name, awards, or quit:");
			command = kb.nextLine();

			// Act based on the user-entered command
			switch (command) {
				case "id":
					// Prompt the user for the player id
					System.out.println("Enter the id:");
					id = kb.nextLine();

					// Get the name of the player with the user specified id
					playerName = p.getPlayerByID(id);

					// Print out the player info if the player exists
					if (playerName != null) {
						System.out.println("Player: " + playerName);
					} else {
						System.out.println("Player id not found");
					}
					break;
				case "name":
					// Prompt the user to enter the player's last name
					System.out.println("Enter player's last name:");
					lastName = kb.nextLine();

					// Print out all of the players with the specified last name
					p.printIdsByName(lastName);
					break;
				case "awards":
					// Prompt the user for the player id
					System.out.println("Enter the id:");
					id = kb.nextLine();

					// Print out all of the awards of the player with the given id
					a.printAwards(id);
					break;
				case "quit":
					break;
				default:
					System.out.println("I don't understand your command.");
					break;
			}
		} while (!command.equals("quit"));

		// Note to the user that the program has ended
		System.out.println("Closing Baseball Database");
	}

}
