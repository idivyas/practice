package org.divya.learning.datastructures.demo;

import org.divya.learning.datastructures.BitString;

/**
 * Given an array that contains numbers from 1 to n-1 and exactly 1 duplicate.
 * Find that duplicate using bit operations.
 * 
 * @author idivyas
 *
 */
public class ExactlyOneDuplicateInteger {

	public int duplicate(int[] values)
	{
		BitString bs=new BitString(values.length);
		for(int i=0;i<values.length;i++)
		{
			if(bs.getBit(values[i]))
			{
			return values[i];
			}
			bs.setBit(values[i], true);
		}
		return 0;
	}
	
	
}
