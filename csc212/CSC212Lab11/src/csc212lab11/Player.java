/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab11;

/**
 * The Player class is used to represent baseball players. It contains
 * information on the player's first and last names. It also includes some
 * methods for accessing and formatting that information as a String.
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class Player {

	private String firstName;	// The first name of the player
	private String lastName;	// The last name of the player

	/**
	 * The method used to construct a Player object and initialize its
	 * variables.
	 *
	 * @param f The first name of the player
	 * @param l The last name of the player
	 */
	public Player(String f, String l) {
		firstName = f;
		lastName = l;
	}

	/**
	 * The method used to get the last name of the Player
	 *
	 * @return The last name of the player
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * The method used to return the player's name formatted.
	 *
	 * @return The first and last name of the player formatted
	 */
	@Override
	public String toString() {
		return lastName + ", " + firstName;
	}
}
