package org.divya.learning.other;

/**
 * Given a string such as BBBAACCCCB which has only English alphabet,
 * convert it into smaller string where each character is succeeded by
 * its continuous recurrence count. For example, the above string becomes
 * B3A2C4B. Note that the last B did not have a 1 next to it. It is an
 * optimization i.e. if a character does not have a number next to it,
 * then it occurs only once. 
 * 
 * @author idivyas
 *
 */
public class CompressAsciiString {
	public String compress(String input) {
		int count=1;
		String result="";
		for(int index=0;index<input.length();index++)
		{
			if((index==input.length()-1)&&(input.charAt(index)==input.charAt(index-1)))
			{
				//count++;
				result=result+input.charAt(index)+count;
				break;
			}
			else if((index==input.length()-1)&&(input.charAt(index)!=input.charAt(index-1)))
			{
				result=result+input.charAt(index);
				break;
			}
			
			char character=input.charAt(index);
			if(character==input.charAt(index+1))
			{
				count++;
			}
			else
			{
				if(count==1)
				{
					result=result+character;
				}
				else
				{
					result=result+character+count;
					count=1;
				}
			}

		}
		return result;
	}

}
