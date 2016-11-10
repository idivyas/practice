package org.divya.learning.datastructures.demo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit-tests for {@link NibbleSwap}
 * 
 * @author idivyas
 */
public class NibbleSwapTest {

	@Test
	public void testSwap()
	{
		NibbleSwap ns=new NibbleSwap();
		assertEquals(0b01101010, ns.swap(0b10100110));
		assertEquals(0b01101101,ns.swap(0b11010110));
	}
}
