package org.divya.learning.other;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for {@link LongestPalindromicSubstring}
 * 
 * @author idivyas
 */
public class LongestPalindromicSubstringTest {

	@Test
	public void testLongestPalindrome()
	{
		LongestPalindromicSubstring l=new LongestPalindromicSubstring();
		assertEquals("saas",l.longestPalindrome("asaas"));
		assertEquals("geeksskeeg",l.longestPalindrome("forgeeksskeegfor"));
	}
}
