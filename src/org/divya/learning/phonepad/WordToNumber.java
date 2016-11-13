package org.divya.learning.phonepad;

import java.util.HashMap;

/**
 * Given a word,find the corresponding number associated with that in the phone pad.
 * 
 * @author idivyas
 */
public class WordToNumber{
	private static final HashMap<Character,Integer> phoneMap=new HashMap<>();
	
	private static void assignNumbers(String alphabets,int number)
	{
		for(char ch:alphabets.toCharArray())
		{
			phoneMap.put(ch, number);
		}
	}
	
	static {
		assignNumbers("abc", 2);
		assignNumbers("def", 3);
		assignNumbers("ghi", 4);
		assignNumbers("jkl", 5);
		assignNumbers("mno", 6);
		assignNumbers("pqrs",7);
		assignNumbers("tuv", 8);
		assignNumbers("wxyz", 9);
	}

	public int getNumber(String word)
	{
		StringBuilder s=new StringBuilder();
		int num=0;
		for(char ch:word.toCharArray())
		{
			int number = phoneMap.get(ch);
            num=Integer.parseInt(s.append(number).toString());
		}
		 return num;
		
	}


}
