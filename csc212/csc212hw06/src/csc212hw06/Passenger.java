/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw06;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class Passenger {

	private String name;
	private double fare;
	private DecimalFormat d = new DecimalFormat("0.00");

	/**
	 * The constructor method for creating Passenger objects. Sets the name of
	 * the passenger and generates a random fare between 100 and 500.
	 *
	 * @param n the name of the passenger
	 */
	public Passenger(String n) {
		Random r = new Random();
		name = n;
		fare = (r.nextFloat() * 400) + 100;
	}

	/**
	 * The method used to get the name of the passenger.
	 *
	 * @return the name of the passenger as a String
	 */
	public String getName() {
		return name;
	}

	/**
	 * The method used to return the name and fare of the passenger.
	 *
	 * @return the name and fare of the passenger as a string, with each value
	 * labeled
	 */
	@Override
	public String toString() {
		return "Name:" + name + " fare:" + d.format(fare);
	}
}
