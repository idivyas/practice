package org.divya.learning.bitops;

import static org.junit.Assert.*;

import org.divya.learning.bitops.NumberOfOnBits;
import org.junit.Test;

/**
 * Unit-tests for {@link NumberOfOnBits}}
 * 
 * @author idivyas
 */
public class NumberOfOnBitsTest {

	@Test
	public void testOnBits()
	{
		NumberOfOnBits number=new NumberOfOnBits();
		assertEquals(0,	number.onBits(0b00000000));
		assertEquals(4,	number.onBits(0b01010101));
		assertEquals(3, number.onBits(0b00101010));
	}
}
