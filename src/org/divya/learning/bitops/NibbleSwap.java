package org.divya.learning.bitops;
/**
 * Swapping two nibbles in a byte.
 * 
 * @author idivyas
 */
public class NibbleSwap {

	public int swap(int value)
	{
		int nibble1=value>>4;
		int nibble2=value<<4;
		int mask=0b11111111;
		nibble2=nibble2 & mask;
		int result=nibble1 | nibble2;
		return result;
	}
}