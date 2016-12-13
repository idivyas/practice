package org.divya.learning.datastructures.demo;

import org.divya.learning.datastructures.BinarySearchTree;

/**
 * Given a sorted array, create a binary search tree with minimal height
 * 
 * @author idivyas
 */
public class MinimalHeightBST {

	public BinarySearchTree<Integer> create(int[] array,int start,int end,BinarySearchTree<Integer> tree)
	{
		if(start>end)
		{
			return tree;
		}
		int mid=(start+end)/2;
		int current = array[mid];

		tree.insert(current);
		create(array,start,mid-1,tree);
		create(array,mid+1,end,tree);
		return tree;
	}
}
