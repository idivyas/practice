package org.divya.learning.phonepad;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 *Unit-tests for {@link WordToNumber}
 * 
 * @author idivyas
 */
public class WordToNumberTest {

	@Test
	public void testOne()
	{
		WordToNumber w=new WordToNumber();
		assertEquals(758,w.getNumber("pjt"));
	}

	@Test
	public void testTwo()
	{
		WordToNumber w=new WordToNumber();
		assertEquals(3337,w.getNumber("deep"));
	}
}
