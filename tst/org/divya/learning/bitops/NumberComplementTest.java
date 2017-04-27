package org.divya.learning.bitops;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for {@link NumberComplement}
 * 
 * @author idivyas
 */
public class NumberComplementTest {

	@Test
	public void testComplement()
	{
		NumberComplement nc=new NumberComplement();
		assertEquals(0b00000010,nc.complement(0b00000101));
		assertEquals(0,nc.complement(1));
		assertEquals(7,nc.complement(8));
		assertEquals(1,nc.complement(0));
	}
}
