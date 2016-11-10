package org.divya.learning.bitops;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit-tests for{@link SwapOddAndEven}
 * 
 * @author idivyas
 */
public class SwapOddAndEvenTest {

	@Test
	public void testSwap()
	{
		SwapOddAndEven s=new SwapOddAndEven();
		assertEquals(0b10110111,s.swap(0b01111011));	
		assertEquals(0b10100101,s.swap(0b01011010));
		assertEquals(0b1100101,s.swap(0b10011010));
	}


}
