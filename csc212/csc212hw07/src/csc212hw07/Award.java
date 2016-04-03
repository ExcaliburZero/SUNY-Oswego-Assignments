/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw07;

/**
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class Award {

	private String title;
	private String year;
	private String league;

	/**
	 * The method used to construct an Award object an set its title, year, and
	 * league.
	 *
	 * @param t The title of the award
	 * @param y The year of the award
	 * @param l The league of the award
	 */
	public Award(String t, String y, String l) {
		title = t;
		year = y;
		league = l;
	}

	/**
	 * The method used to return the information on the award as a String.
	 *
	 * @return The year, league, and title of the award formatted
	 */
	public String toString() {
		return year + " " + league + " " + title;
	}
}
