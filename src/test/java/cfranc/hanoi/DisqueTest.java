package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {
	
	Disque dSmall = new Disque(1);
	Disque dMedium = new Disque(2);
	Disque dTall = new Disque(3);

/*	@Test
	public void testCompareTo() {
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		Disque grand = new Disque(3);


		assertEquals(-1, petit.compareTo(moyen));
		assertEquals(-1, moyen.compareTo(grand));
		assertEquals(-1, petit.compareTo(grand));

		assertEquals(1, moyen.compareTo(petit));
		assertEquals(1, grand.compareTo(petit));
		assertEquals(1, grand.compareTo(moyen));

		assertEquals(0, petit.compareTo(petit));
		assertEquals(0, moyen.compareTo(moyen));
		assertEquals(0, grand.compareTo(grand));

	}
*/
	//////////////////////////////////////////////COMPARE TO NEGATIVE
	@Test
	public void compareTo_SmallMedium_Negative(){
		int expected = -1;
		int actual = dSmall.compareTo(dMedium);
		assertEquals(expected, actual);
	}

	@Test
	public void compareTo_SmallTall_Negative()
	{
		int expected = -1;
		int actual = dSmall.compareTo(dTall);

		assertEquals(expected,actual);
	}

	@Test
	public void compareTo_MediumTall_Negative()
	{
		int expected = -1;
		int actual = dMedium.compareTo(dTall);

		assertEquals(expected,actual);
	}

	//////////////////////////////////////////COMPARE TO POSITIVE
	@Test
	public void compareTo_MediumSmall_Positive(){
		int expected = 1;
		int actual = dMedium.compareTo(dSmall);
		assertEquals(expected, actual);
	}

	@Test
	public void compareTo_TallSmall_Positive(){
		int expected = 1;
		int actual = dTall.compareTo(dSmall);
		assertEquals(expected, actual);
	}

	@Test
	public void compareTo_TallMedium_Positive(){
		int expected = 1;
		int actual = dTall.compareTo(dMedium);
		assertEquals(expected, actual);
	}


	///////////////////////////////////////////////MEME TAILLE
	@Test
	public void compareTo_Small_SMall(){
		int expected = 0;
		int actual = dSmall.compareTo(dSmall);
		assertEquals(expected, actual);
	}

	@Test
	public void compareTo_Medium_Medium(){
		int expected = 0;
		int actual = dMedium.compareTo(dMedium);
		assertEquals(expected, actual);
	}

	@Test
	public void compareTo_Tall_Tall(){
		int expected = 0;
		int actual = dTall.compareTo(dTall);
		assertEquals(expected, actual);
	}



}
