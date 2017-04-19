package org.divya.learning.other;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for {@link MinimumInsertionsPalindrome}
 * 
 * @author idivyas
 */
public class MinimumInsertionsPalindromeTest {
	@Test
	public void testInsert()
	{
		MinimumInsertionsPalindrome i=new MinimumInsertionsPalindrome();
		assertEquals(2,i.insert("abcac"));
	}
}
