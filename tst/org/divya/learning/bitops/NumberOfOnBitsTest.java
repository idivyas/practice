package org.divya.learning.bitops;

import static org.junit.Assert.*;

import org.divya.learning.bitops.NumberOfOnBits;
import org.junit.Test;

/**
 * Unit-tests for {@link NumberOfOnBits}}
 * @author idivyas
 *
 */
public class NumberOfOnBitsTest {

	@Test
	public void testOnBits()
	{
		NumberOfOnBits number=new NumberOfOnBits();
		assertEquals(1,	number.onBits(16));
		assertEquals(3, number.onBits(7));
	}
}
