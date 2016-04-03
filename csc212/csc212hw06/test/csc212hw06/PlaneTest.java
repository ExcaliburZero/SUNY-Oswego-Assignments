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
public class PlaneTest {

	public String testFlightNumber = "R21";
	public int testRows = 2;
	public int testSeats = 2;
	public Plane testPlane = new Plane(testFlightNumber, testRows, testSeats);
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	public PlaneTest() {
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
	 * A test which checks the addPassenger and removePassenger methods of the
	 * Plane class.
	 */
	@Test
	public void testAddAndRemovePassenger() {
		String name = "L.Toler";
		int row = 0;
		int seat = 1;

		// Add passenger
		boolean addResult = testPlane.addPassenger(name, row, seat);
		assertTrue(addResult);

		// Remove passenger
		boolean removeResult = testPlane.removePassenger(row, seat);
		assertTrue(removeResult);
	}

	/**
	 * A test which checks the showSeats method of the Plane class.
	 */
	@Test
	public void testShowSeats() {
		String testInfo = "A test for the showSeats method of the Plane class";
		String expectedOutput = "  |         0||         1|\n 0|          ||          |\n 1|          ||          |\n";
		testPlane.showSeats();
		String returnedOutput = outContent.toString();
		assertEquals(testInfo, expectedOutput, returnedOutput);
	}
}
