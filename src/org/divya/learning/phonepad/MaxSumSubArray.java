package org.divya.learning.phonepad;
/**
 * Find the contiguous sub array within an array (containing at least one number) which has the largest sum.
 * Return the indexes of the start and end of the sub array.
 */
import javafx.util.Pair;

public class MaxSumSubArray {

	public Pair<Integer,Integer> maxSum(int[] array)
	{
		int[] temp=new int[array.length];
		temp[0]=array[0];
		int max=temp[0];
		int endIndex=0;
		Pair<Integer,Integer> p=null;
		
		for(int i=1;i<array.length;i++)
		{
			if((array[i]+temp[i-1])>array[i])
			{
				temp[i]=array[i]+temp[i-1];
			}
			else
			{
				temp[i]=array[i];
			}
		}
		for(int j=1;j<temp.length;j++)
		{
			if(temp[j]>max)
			{
				max=temp[j];
				endIndex=j;
			}
		}

		for(int backtrack=endIndex;backtrack>=0;backtrack--)
		{
			if(temp[backtrack]==array[backtrack])
			{
				p=new Pair<>(backtrack,endIndex);
				break;
			}
		}
		return p;
	}
}
