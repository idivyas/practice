package org.divya.learning.other;
/**
 * Given a string, find the minimum number of characters you would add at the
 * end to make it a palindrome.
 * Example:abcac
 * Output:2 i.e; abcac+ba=abcacba
 * 
 * @author idivyas
 */
public class MinimumInsertionsPalindrome {

	public int insert(String input)
	{
		int maxPalindromeIndex=0;
		String str="";
		int count=0;
		for(int index=input.length()-1;index>=0;index--)
		{
			//str=str.concat(Character.toString(input.charAt(index)));
			str=input.substring(index);
			if(isPalindrome(str))
			{
				maxPalindromeIndex=index;
			}			
		}
		for(int reverseIndex=maxPalindromeIndex-1;reverseIndex>=0;reverseIndex--)
		{
			input=input+input.charAt(reverseIndex);//concat(Character.toString(input.charAt(reverseIndex)));
			count++;
		}
		return count;
	}

	public boolean isPalindrome(String input)
	{
		for(int i=0;i<input.length()/2;i++)
		{
			if(input.charAt(i)!=input.charAt(input.length()-i-1))
			{
				return false;
			}
		}
		return true;
	}


}
