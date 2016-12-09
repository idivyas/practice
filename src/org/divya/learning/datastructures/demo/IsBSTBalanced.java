package org.divya.learning.datastructures.demo;

import org.divya.learning.datastructures.BinarySearchTree;
import org.divya.learning.datastructures.BinarySearchTreeNode;

/**
 * Determine if a binary tree is balanced.
 *
 * Situation:
 * 
 * You want to return a result if and only if a condition is met. Otherwise, failure has to
 * be communicated.
 * 
 * Option-1: Expensive, useful when failure is less likely.
 * 
 * Throw a runtime exception. When your call succeeds, you return the value. If it fails, then
 * throw an exception. (See ArrayBackedQueue).
 * 
 * Option-2:
 * 
 * Return an Optional.
 * 
 * @author idivyas
 */
public class IsBSTBalanced {
	
	public static class UnbalancedTreeException extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

	public boolean isBalanced(BinarySearchTree<?> tree)
	{
		try {
			check(tree.getRoot(),tree);
			return true;
		} catch (UnbalancedTreeException e) {
			return false;
		}
	}

	public int check(BinarySearchTreeNode<?> current,BinarySearchTree<?> tree)
	{
		if(current==null)
		{
			return -1;//Height of empty tree is -1. Empty tree is always height balanced
		}

		int leftHeight=check(current.getLeft(),tree)+1;
		/*if(leftHeight>1)
		{
			return leftHeight;
		}*/
		int rightHeight=check(current.getRight(),tree)+1;
		/*if(rightHeight>1)
		{
			return rightHeight;
		}*/
		int diff=leftHeight-rightHeight;
		if(diff > 1 || diff < -1)  // BUG: What if leftHeight is > rightHeight.
		{
			throw new UnbalancedTreeException();
		}
		else
		{
			if(current==tree.getRoot())
			{
				return diff;
			}
			if(leftHeight>rightHeight)
			{
				return leftHeight;
			}
			else
				return rightHeight;
		}
	}

}
