/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw06;

/**
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class Plane {

	private Passenger[][] passengers;
	private String flightNumber;

	/**
	 * The method used to construct a Plane object.
	 *
	 * @param num the flight number
	 * @param r the number of rows in the plane
	 * @param s the number of seats in each row of the plane
	 */
	public Plane(String num, int r, int s) {
		flightNumber = num;
		passengers = new Passenger[r][s];
	}

	/**
	 * The method used to determine whether a position is valid or not.
	 *
	 * @param r the row
	 * @param s the seat in the row
	 * @return whether the position is valid or not
	 */
	private boolean isValidPos(int r, int s) {
		return (((r > -1) && (r < passengers.length)) && ((s > -1) && (s < passengers[0].length)));
	}

	/**
	 * The method used to determine whether a position is empty or not.
	 *
	 * @param r the row
	 * @param s the seat in the row
	 * @return whether the position is empty or not
	 */
	private boolean isEmptyPos(int r, int s) {
		return (passengers[r][s] == null);
	}

	/**
	 * The method used to create and add a passenger to the plane. Fails if the
	 * position is not valid, or is not empty.
	 *
	 * @param n the name of the passenger
	 * @param r the row of the passenger
	 * @param s the seat number in the row of the passenger
	 * @return whether the operation was successful or not
	 */
	public boolean addPassenger(String n, int r, int s) {
		if (isValidPos(r, s) && isEmptyPos(r, s)) {
			passengers[r][s] = new Passenger(n);
			System.out.println("Passenger " + n + " was added.");
			return true;
		} else {
			return false;
		}
	}

	/**
	 * The method used to remove a passenger from the plane.
	 *
	 * @param r the row of the passenger
	 * @param s the seat number in the row of the passenger
	 * @return whether the operation was successful or not
	 */
	public boolean removePassenger(int r, int s) {
		if (isValidPos(r, s) && !(isEmptyPos(r, s))) {
			passengers[r][s] = null;
			System.out.println("Passenger was removed.");
			return true;
		} else {
			return false;
		}
	}

	/**
	 * The method used to show a grid containing all rows and seat, and each
	 * passenger assigned to them.
	 */
	public void showSeats() {
		// Print out the column headings
		System.out.print("  ");
		for (int j = 0; j < passengers[0].length; j++) {
			System.out.print("|");
			System.out.printf("%10s", j);
			System.out.print("|");
		}
		System.out.println();

		// Print out the row numbers and passenger names
		for (int i = 0; i < passengers.length; i++) {
			System.out.printf("%2s", i);

			for (int j = 0; j < passengers[i].length; j++) {
				System.out.print("|");

				// If there is no passenger in the seat, then leave the cell blank
				String printName = "";
				if (!isEmptyPos(i, j)) {
					printName = passengers[i][j].getName();
				}

				System.out.printf("%10s", printName);
				System.out.print("|");
			}
			System.out.println();
		}
	}

	/**
	 * The method used to print out a list of the passengers. Includes their
	 * names and fare.
	 */
	public void passengerList() {
		for (int i = 0; i < passengers.length; i++) {
			for (int j = 0; j < passengers[i].length; j++) {
				if (passengers[i][j] != null) {
					System.out.println(passengers[i][j]);
				}
			}
		}
	}
}
