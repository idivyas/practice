package org.divya.learning.other;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for {@link KthSmallestElement}
 *   
 * @author idivyas
 */
public class KthSmallestElementTest {

	@Test
	public void testQuickSearch()
	{
		KthSmallestElement k=new KthSmallestElement();
		int[] given={2,6,9,1,5,4};
		assertEquals(1,k.quickSearch(given, 1));
		assertEquals(2,k.quickSearch(given, 2));
		assertEquals(4,k.quickSearch(given, 3));
		assertEquals(5,k.quickSearch(given, 4));
		assertEquals(6,k.quickSearch(given, 5));
		assertEquals(9,k.quickSearch(given, 6));
		
	}
}
