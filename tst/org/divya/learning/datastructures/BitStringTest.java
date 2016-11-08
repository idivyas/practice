package org.divya.learning.datastructures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit-tests for {@link BitString}.
 * 
 * @author idivyas
 */
public class BitStringTest {

	@Test
	public void testSetAndGetForAllIndexes() {
		BitString instance = new BitString(16);
		for (int i = 0; i < instance.getNumBits(); ++i) {
			assertFalse("Index: " + i, instance.getBit(i));
			
			assertFalse("Index: " + i, instance.setBit(i, true));
			assertTrue("Index: " + i, instance.getBit(i));
			
			assertTrue("Index: " + i, instance.setBit(i, false));
			assertFalse("Index: " + i, instance.getBit(i));
		}
	}
	
}
