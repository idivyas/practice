package org.divya.learning.bitops;
/**
 * Swap all odd and even bits.
 * 
 * @author idivyas
 */
public class SwapOddAndEven {
	public int swap(int value)
	{
		int result=0;
		int count=1;
		int oddSwappedMask=0;
		int evenSwappedMask=0;
		for(int loop=0;loop<32;loop++)
		{
			// Find the current bit.
			int mask=value & (1<<loop);
			
			if((count%2)!=0)
			{
				// For odd bits, move the bit to the left.
				oddSwappedMask=mask<<1;
			}
			else
			{
				// For even bits, move the bit to the right.
				evenSwappedMask=mask>>1;
				
				// After every pair, OR the current odd and even masks.
				result=result | oddSwappedMask | evenSwappedMask;

			}

			count++;
		}

		return result;
	}

}