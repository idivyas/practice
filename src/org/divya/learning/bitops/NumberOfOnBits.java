package org.divya.learning.bitops;
/**
 * Find the number of on(1) bits in a given number.
 * For example, number 5 has 2 bits that are 1. Number 7 has 3 bits that are 1.
 * 
 * @author idivyas
 */
public class NumberOfOnBits {

	public int onBits(int number)
	{
		int count=0;
		
		for(int i=0;i<32;i++)
		{
			int mask=1<<i;
			if((number & mask)>0)
			{
				count++;
			}
		}
		return count;
	}

}
