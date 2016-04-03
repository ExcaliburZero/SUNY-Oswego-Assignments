/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab11;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class Main {

	/**
	 * The main method of the program. It allows the user to search through a
	 * database of baseball players.
	 *
	 * @param args the command line arguments
	 * @throws java.io.FileNotFoundException If the input file does not exist
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// Create a Scanner to read in user input
		Scanner kb = new Scanner(System.in);
		String command;	// String to store the user's latest command

		// Create a Players object and have it load information from an input file
		Players p = new Players();
		p.load("players.txt");

		// Prompt the user for commands and act on them until they choose to quit
		do {
			// Prompt the user to enter a command
			System.out.println("Enter id, name, or quit");
			command = kb.nextLine();

			// Act based on the command that the user entered
			if (command.equals("id")) {
				// Prompt the user for the player id
				System.out.println("Enter the ID:");
				String id = kb.nextLine();

				// Get the name of the player with the user specified id
				String playerName = p.getPlayerByID(id);

				// Prin out the player info if the player exists
				if (playerName != null) {
					System.out.println("Player: " + playerName);
				} else {
					System.out.println("Player id not found");
				}
			} else if (command.equals("name")) {
				// Prompt the user to enter the player's last name
				System.out.println("Enter player's last name:");
				String lastName = kb.nextLine();

				// Print out all of the players with the specified last name
				p.printIdsByName(lastName);
			} else if (command.equals("quit")) {
				System.out.println("Program ending.");
			} else {
				System.out.println("I don't understand your command");
			}

		} while (!command.equals("quit"));
	}

}
