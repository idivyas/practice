package org.divya.learning.other;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for {@link CompressAsciiString}
 * 
 * @author idivyas
 */
public class CompressAsciiStringTest {

	@Test
	public void testCompress1()
	{
		CompressAsciiString c=new CompressAsciiString();
		assertEquals("B3A2C4B",c.compress("BBBAACCCCB"));
	}
	@Test
	public void testCompress2()
	{
		CompressAsciiString c=new CompressAsciiString();
		assertEquals("AB2C3",c.compress("ABBCCC"));
		assertEquals("", c.compress(""));
	}
}
