/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab10;

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
		StringStack ss = new StringStack(4);	// The String Stack to use for the program
		String command;	// The last user entered command
		String word;	// The last user entered word
		Scanner sc = new Scanner(System.in);	// The Scanner used to read in input from the keyboard

		// Continually take in user commands and act on them until the user quits
		System.out.println("Enter push, pop, peek, combine, or quit:");
		command = sc.next();
		while (!command.equals("quit")) {
			if (command.equals("push")) {
				// Push the user entered word onto the StringStack
				word = sc.next();
				ss.push(word);
			} else if (command.equals("peek")) {
				// Print out the top element of the StringStack if it exists
				String peekString = ss.peek();
				if (peekString != null) {
					System.out.println("Top: " + peekString);
				} else {
					// If the StringStack is empty, then print out a notice of such
					System.out.println("Stack is empty");
				}
			} else if (command.equals("pop")) {
				// Pop the top element of the String Stack if it exists
				String popString = ss.pop();
				if (popString != null) {
					System.out.println(popString);
				} else {
					// If the StringStack is empty, then print out a notice of such
					System.out.println("Stack is empty");
				}
			} else if (command.equals("combine")) {
				// Combine the two topmost entries into one if both entries exist
				if (ss.peek() != null) {
					String one = ss.pop();
					if (ss.peek() != null) {
						String two = ss.pop();
						ss.push(one + " " + two);
					} else {
						// If there exists no second element then return the first element to the String Stack
						ss.push(one);
					}
				}
			}

			// Prompt the user to enter another command
			System.out.println("Enter push, pop, peek, combine, or quit:");
			command = sc.next();
		}

		// Inform the user that the program is ending
		System.out.println("Program Ending");
	}

}
