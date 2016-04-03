/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw08;

/**
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class CompactDisc {

	private String upc;
	private double price;
	private String artist;
	private String title;

	/**
	 * The method used to construct a CompactDisc and set all of its initial
	 * values.
	 *
	 * @param u The upc of the disc
	 * @param p The price of the disc
	 * @param a The artist of the disc
	 * @param t The title of the disc
	 */
	public CompactDisc(String u, double p, String a, String t) {
		upc = u;
		price = p;
		artist = a;
		title = t;
	}

	/**
	 * The method used to get the upc of the CompactDisc.
	 *
	 * @return The upc of the disc
	 */
	public String getUPC() {
		return upc;
	}

	/**
	 * The method used to get the name of the artist of the Compact Disc.
	 *
	 * @return The artists of the disc
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * The method used to print out the information of the CompactDisc formatted
	 * as a String.
	 *
	 * @return The information on the disc formatted with labels
	 */
	public String toString() {
		return "Artist:" + artist + " Title:" + title + " price:" + price;
	}
}
