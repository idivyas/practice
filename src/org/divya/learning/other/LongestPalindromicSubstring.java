package org.divya.learning.other;
/**
 * Longest palindrome in a string
 * 
 * @author idivyas
 */
public class LongestPalindromicSubstring {

	public String longestPalindrome(String str)
	{
		//TreeMap<Integer,String> map=new TreeMap<>();
		int length=0;
		int startIndex=0;
		int endIndex=0;
		for(int outer=0;outer<str.length();outer++)
		{
			//String augment=Character.toString(str.charAt(outer));
			//if(augment.length()==1)
			//{
			//	map.put(augment.length(), augment);
			//}
			StringBuilder augment=new StringBuilder();
			augment.append(str.charAt(outer));
			
			for(int inner=outer+1;inner<str.length();inner++)
			{
				// augment = augment + str.charAt(inner);	                      //new string object is created everytime and old string object is thrown away(garbage collected)
				//augment=augment.concat(Character.toString(str.charAt(inner)));  //Concat can take only string paramater
				augment.append(str.charAt(inner));								  
				if(!isPalindrome(augment))
				{
					continue;
				}
				else
				{
					if(augment.length()>length)
					{
						length=augment.length();
						startIndex=outer;
						endIndex=inner;
					}
				//map.put(augment.length(), augment);
				}
			}
		}
		return str.substring(startIndex, endIndex+1);
		//return map.get(map.lastKey());
	}

	public boolean isPalindrome(CharSequence str) //CharSequence is the parent class of String and String Builder. So either string or String builder can be passed to this function.
	{														
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))    
			{
				return false;
			}
		}
		return true;
	}
}
