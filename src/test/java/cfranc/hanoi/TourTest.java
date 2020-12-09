package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	Disque d1 = new Disque(1);
	Disque d2 = new Disque(2);

	@Test
	/**
	 * GIVEN_WHEN_THEN
	 */
	public void testEmpiler_TourPleine_False() {

		Tour tourPleine = new Tour(1);
		tourPleine.empiler(d2);

		boolean expected = false;
		boolean actual = tourPleine.empiler(d1);

		assertEquals(expected,actual);
	}

	@Test
	/**
	 * GIVEN_WHEN_THEN
	 */
	public void testEmpiler_TourNonVideDisquePlusPetit_TRUE() {

		Tour tourNonVide = new Tour(3);
		tourNonVide.empiler(d2);

		boolean expected = true;
		boolean actual = tourNonVide.empiler(d1);

		assertEquals(expected, actual);
	}

	@Test
	/**
	 * GIVEN_WHEN_THEN
	 */
	public void testEmpiler_TourVide_TRUE() {
		Tour tourVide = new Tour(3);

		boolean expected = true;
		boolean actual = tourVide.empiler(d1);

		assertEquals(expected,actual);
	}

	@Test
	/**
	 * GIVEN_WHEN_THEN
	 */
	public void testEmpiler_() {

//A écrire
	}



	}
