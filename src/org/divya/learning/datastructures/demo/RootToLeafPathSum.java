package org.divya.learning.datastructures.demo;

import org.divya.learning.datastructures.BinarySearchTreeNode;

/**
 * Given a binary tree and a number, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals the given number.
 * Return false if no such path can be found.
 * 
 * @author idivyas
 */
public class RootToLeafPathSum {

	public boolean pathSum(BinarySearchTreeNode<Integer> current,int value)
	{
		if(current==null)
			return false;
		if(current.getData()==value)
			return true;

		boolean left=pathSum(current.getLeft(),value-current.getData());

		boolean right=pathSum(current.getRight(),value-current.getData());

		return (left||right);
	}
}
