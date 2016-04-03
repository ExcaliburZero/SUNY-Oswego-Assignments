/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab13;

import java.io.File;
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
		// Create a Scanner to read in user input
		Scanner kb = new Scanner(System.in);

		try {
			// Prompt the user to input values
			System.out.println("Enter an integer, a Boolean, and a String:");

			// Read in and print out an integer token
			System.out.println("Integer: " + kb.nextInt());

			// Read in and print out a boolean token
			System.out.println("Boolean: " + kb.nextBoolean());

			// Read in and print out the rest of the line
			System.out.println("String: " + kb.nextLine());
		} catch (Exception e) {
			System.out.println("Line Exception: " + e.toString());
		}

		// Prompt the user to enter the name of a file
		System.out.println("Enter a file name:");
		String fileName = kb.nextLine();

		try {
			// Create File and Scanner objects to read in from the user specified file
			File f = new File(fileName);
			Scanner fs = new Scanner(f);
			System.out.println("Scanner created.");

			// Print out the contents of the file
			System.out.println("Here are the contents.");
			while (fs.hasNextLine()) {
				System.out.println(fs.nextLine());
			}
		} catch (Exception e) {
			System.out.println("File Exception: " + e.toString());
		}
	}
}
