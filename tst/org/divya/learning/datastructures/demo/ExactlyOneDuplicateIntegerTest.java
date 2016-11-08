package org.divya.learning.datastructures.demo;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Unit-tests for {@link ExactlyOneDuplicateInteger}
 * 
 * @author idivyas
 */
public class ExactlyOneDuplicateIntegerTest {
	
	@Test
	public void testDuplicate()
	{
		int[] given={1,2,4,5,4,3,7,6};
		ExactlyOneDuplicateInteger duplicateInt=new ExactlyOneDuplicateInteger();
		assertEquals(4,duplicateInt.duplicate(given));
	}

}
