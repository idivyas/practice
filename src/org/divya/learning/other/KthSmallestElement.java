package org.divya.learning.other;
/**
 * Find out the Kth smallest element or Quick Search in O(n) or less than O(nlogn)
 * Implement the Quick sort of partitioning and get the position of the pivot placed, if the given k is greater 
 * than the position of the pivot then do the partition on the right side,recursively.
 * Complexity: Everytime we are dividing the list into half i.e,n+n/2+n/4+n/8+....+1
 *             It is in GP so Sum of n in GP=a(1-r^n)/1-r => n(1-1/2^logn)/(1-1/2)= O(n)
 * 
 * @author idivyas
 */
public class KthSmallestElement {

	public int quickSearch(int[] array,int k)
	{
		int inclStart=0;
		int exclEnd=array.length;
		return kthSmall(array,inclStart,exclEnd,k);
	}

	public int kthSmall(int[] array,int inclStart,int exclEnd,int k)
	{
		if(inclStart==exclEnd-1)
		{
			return array[k-1];
		}
		
		int pivot=exclEnd-1;
		int i=inclStart;
		int j=pivot-1;
		while(i<=j)
		{
			if(array[i]<array[pivot])
			{
				i++;
			}
			else
			{
				if(array[j]>array[pivot])  // What happens to == ?
				{
					j--;
				}
				else
				{
					int temp=array[j];
					array[j]=array[i];
					array[i]=temp;
					i++;
					j--;
				}
			}
		}
		int temp=array[pivot];
		array[pivot]=array[i];
		array[i]=temp;

		if(k-1<i)
		{
			return kthSmall(array,inclStart,i,k);
		}
		else if(k-1>i)
		{
			return kthSmall(array,i+1,exclEnd,k);
		}
		else
		{
			return array[i];
		}
	}
}
