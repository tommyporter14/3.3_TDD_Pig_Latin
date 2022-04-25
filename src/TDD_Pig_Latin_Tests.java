import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TDD_Pig_Latin_Tests {

	@Test
	void testTranslate1()//1-5 all vowels
	{
		String expected = "appleway";
		String actual = TDD_Pig_Latin.translate("Apple");
		assertEquals(expected, actual);
	}

	@Test
	void testTranslate2()
	{
		String expected = "iceway";
		String actual = TDD_Pig_Latin.translate("Ice");
		assertEquals(expected, actual);
	}
	
	@Test
	void testTranslate3()
	{
		String expected = "openway";
		String actual = TDD_Pig_Latin.translate("Open");
		assertEquals(expected, actual);
	}
	
	@Test
	void testTranslate4()
	{
		String expected = "underway";
		String actual = TDD_Pig_Latin.translate("Under");
		assertEquals(expected, actual);
	}
	
	@Test
	void testTranslate5()
	{
		String expected = "enterway";
		String actual = TDD_Pig_Latin.translate("Enter");
		assertEquals(expected, actual);
	}
	
	@Test
	void testTranslate6()//6-7 one consonant
	{
		String expected = "ellohay";
		String actual = TDD_Pig_Latin.translate("Hello");
		assertEquals(expected, actual);
	}
	
	@Test
	void testTranslate7()
	{
		String expected = "iraffegay";
		String actual = TDD_Pig_Latin.translate("Giraffe");
		assertEquals(expected, actual);
	}
	
	@Test
	void testTranslate8()//two consonants
	{
		String expected = "ateplay";
		String actual = TDD_Pig_Latin.translate("Plate");
		assertEquals(expected, actual);
	}
	
	@Test
	void testTranslate9()//three consonants
	{
		String expected = "ongstray";
		String actual = TDD_Pig_Latin.translate("Strong");
		assertEquals(expected, actual);
	}
	
	@Test
	void testTranslate10()//to lower case
	{
		String expected = "ihay";
		String actual = TDD_Pig_Latin.translate("HI");
		assertEquals(expected, actual);
	}
}


