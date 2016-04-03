/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw06;

import java.util.Scanner;

/**
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String flightNumber;	// The flight number of the user selected flight
		int rows;	// The number of rows of seats the plane has
		int seats;	// The number of seats per row the plane has
		String command;	// The latest command the user has entered
		Plane userPlane;	// The Plane that the user specifies
		String passName;	// The name of the currently specified Passenger
		int passRow;	// The row of the currently specified Passenger
		int passSeat;	// The seat of the currently specified Passenger
		
		// Welcome the user to the program
		System.out.println("Welcome to Oswego Airlines");
		
		// Get the flight info from the user
		System.out.println("Enter a flight number:");
		flightNumber = kb.nextLine();
		System.out.println("Enter the number of rows:");
		rows = kb.nextInt();
		System.out.println("Enter the number of seats per row:");
		seats = kb.nextInt();
		kb.nextLine();	// Use up extra newline
		
		// Create a Plane based on the user input
		userPlane = new Plane(flightNumber, rows, seats);
		
		// Prompt the user for commands and act on them
		do {
			// Ask the user to enter a command
			System.out.println("Enter add, remove, seats, list, or quit:");
			command = kb.nextLine();
			
			// Act on the user's entered command
			switch (command) {
				case "add":
					// Prompt user for passenger information
					System.out.println("Enter passenger name, row, and seat:");
					passName = kb.next();
					passRow = kb.nextInt();
					passSeat = kb.nextInt();
					kb.nextLine();	// Use up extra newline
					
					// Attempt to add the Passenger to the Plane
					if (!userPlane.addPassenger(passName, passRow, passSeat)) {
						// If it fails, then inform the user
						System.out.println("Invalid seat -- please try again.");
					}
					break;
				case "remove":
					// Prompt user for passenger information
					System.out.println("Enter row and seat:");
					passRow = kb.nextInt();
					passSeat = kb.nextInt();
					kb.nextLine();	// Use up extra newline
					
					// Attempt to remove the Passenger from the Plane
					if (!userPlane.removePassenger(passRow, passSeat)) {
						// If it fails, then inform the user
						System.out.println("Invalid seat -- please try again.");
					}
					break;
				case "seats":
					userPlane.showSeats();
					break;
				case "list":
					userPlane.passengerList();
					break;
				case "quit":
					break;
				default:
					System.out.println("Unknown command -- please try again.");
					break;
			}
			
		} while (!command.equals("quit"));
		
		// Print out a closing message
		System.out.println("Closing Oswego Airlines");
	}

}
