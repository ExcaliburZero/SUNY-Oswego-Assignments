/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212hw06;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class PassengerTest {

	public String testName = "Tom";
	public Passenger testPassenger = new Passenger(testName);
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	public PassengerTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
		// Setup output stream
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void tearDown() {
		// Cleanup output stream
		System.setOut(null);
	}

	/**
	 * A test which checks the getName method of the Passenger class.
	 */
	@Test
	public void testGetName() {
		String testInfo = "A test of the getName method of the Passenger class";
		String expectedName = testName;
		String returnedName = testPassenger.getName();
		assertEquals(testInfo, expectedName, returnedName);
	}

	/**
	 * A test which checks the toString method of the Passenger class.
	 */
	@Test
	public void testToString() {
		String expectedString = "Name:" + testName + " fare:";

		// Test first part of returned String
		int endOfFirstSection = 5 + testName.length() + 6;
		String fullReturn = ("" + testPassenger);
		String returnedString = fullReturn.substring(0, endOfFirstSection);
		assertEquals(expectedString, returnedString);

		// Test that the fare is between 100 and 500
		double returnedFare = Double.parseDouble(fullReturn.substring(endOfFirstSection, fullReturn.length()));
		assertTrue((returnedFare > 100.0) && (returnedFare < 500.0));
	}
}
