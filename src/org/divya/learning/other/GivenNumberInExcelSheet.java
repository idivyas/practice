package org.divya.learning.other;
/**
 * Given a column number in excel sheet, return the column name.
 * 
 * @author idivyas
 */
public class GivenNumberInExcelSheet {

	public String columnName(int columnNumber)
	{
		StringBuilder s=new StringBuilder();
		char[] array=new char[26];//A=0,B=1...,Z=25
		for(char alphabet='A';alphabet<='Z';alphabet++)
		{
			array[alphabet-'A']=alphabet;
		}

		while(columnNumber!=0)
		{
			if(columnNumber%26==0)
			{
				s.insert(0, array[26-1]);
				columnNumber=(columnNumber/26)-1;
			}
			else
			{
				s.insert(0,(array[(columnNumber%26)-1])); //stringbuilder.insert(int,object) inserts Object at a particular 'int' location.
				columnNumber=columnNumber/26;
			}
		}
		return s.toString();
	}
}
