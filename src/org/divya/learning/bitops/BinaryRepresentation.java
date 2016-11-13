package org.divya.learning.bitops;
/**
 * Binary representation of a given number.
 * 
 * @author idivyas
 */
public class BinaryRepresentation {
	public int binary(int number)
	{

		StringBuilder s=new StringBuilder();
		int binaryValue=0;
		for(int loop=0;loop<31;loop++)
		{
			int result=0;
			int onBit=1<<30;
			int mask=onBit >>loop;
			result=number & mask;
			result=result > 0 ? 1 : 0;
			binaryValue=Integer.parseInt(s.append(result).toString());
		}
		return binaryValue;
	}
}



