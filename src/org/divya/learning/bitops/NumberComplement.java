package org.divya.learning.bitops;
/**
 * Given a positive integer, output its complement number.
 * Example: Input: 5 , Output: 2
 * 			Input: 1 , Output: 0
 * 
 * @author idivyas
 */
public class NumberComplement {
	public int complement(int number)
	{
		int onBit=0;
		int mask=0;
		int limit=0;
		for(int loop=0;loop<31;loop++)
		{
			onBit=1<<30;
			mask=onBit>>loop;
			if((mask&number)>0)
			{
				limit=30-loop;
				break;
			}
		}
		for(int loop=0;loop<=limit;loop++)
		{
			mask=1<<loop;
			if((number & mask)>0)
			{
				number=number&(~mask); //changing to 0
			}
			else
			{
				number=number|mask; //changing to 1
			}
		}
		return number;
	}
}
