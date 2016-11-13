package org.divya.learning.bitops;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit-test for {@link BinaryRepresentation}
 * 
 * @author idivyas
 */
public class BinaryRepresentationTest {

	@Test
	public void testBinary()
	{
		BinaryRepresentation represent=new BinaryRepresentation();
		assertEquals(1101,represent.binary(13));
		assertEquals(10000101,represent.binary(133));
		assertEquals(1000111,represent.binary(71));
	}
}
