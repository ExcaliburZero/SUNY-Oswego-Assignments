/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw04;

// Import statements
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		/**
		 * Variables
		 */
		int rows = 0;				// The number of rows the grid will have
		int columns = 0;			// The number of columns the grid will have
		String fillChar = "";		// The character to fill the grid with
		boolean entered = false;	// Whether or not the user has successfully enterd the input

		Scanner kb = new Scanner(System.in);		// The scanner used to read input from the keyboard

		// Have the user enter the rows, columns, and fill character until they enter proper responses
		while (!entered) {
			// Prompt the user for the rows, columns, and fill character
			System.out.println("Enter the number of rows, columns, and fill character:");
			rows = kb.nextInt();
			columns = kb.nextInt();
			fillChar = kb.nextLine();

			// Trim the trailing whitespace off of the fillChar
			fillChar = fillChar.trim();

			// Check if the user entered info is valid
			if ((rows >= 0) && (columns >= 0) && (fillChar.length() == 1)) {
				// If the entered info is valid, exit the while loop
				entered = true;
			}
		}

		// Create the grid
		String[][] grid = new String[rows][columns];

		// Fill the grid with the fill character
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				grid[i][j] = fillChar;
			}
		}

		// Print out the contents of the grid
		System.out.println("Solid:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				// Print out the character in the specified cell
				System.out.print(grid[i][j]);
			}
			// Print a new line
			System.out.print("\n");
		}

		// Set the grid to have a checkerboard pattern
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (j % 2 == 0 && i % 2 == 1) {
					grid[i][j] = " ";
				} else if (j % 2 == 1 && i % 2 == 0) {
					grid[i][j] = " ";
				}
			}
		}

		// Print out the contents of the grid
		System.out.println("Checkerboard:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				// Print out the character in the specified cell
				System.out.print(grid[i][j]);
			}
			// Print a new line
			System.out.print("\n");
		}
	}

}
