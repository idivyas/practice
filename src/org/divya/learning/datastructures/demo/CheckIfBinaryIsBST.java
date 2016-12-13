package org.divya.learning.datastructures.demo;

import org.divya.learning.datastructures.BinarySearchTreeNode;

/**
 * Implement a function to check if a binary tree is a BST
 * 
 * @author idivyas
 */
public class CheckIfBinaryIsBST {

	public boolean isBST(BinarySearchTreeNode<Integer> current)
	{
		if(current==null)
		{
			return true;
		}

		if (current.getLeft() != null) {
			if(current.getData()<=current.getLeft().getData()) {
				return false;
			} 
			if (!isBST(current.getLeft())) {
				return false;
			}
		}

		if (current.getRight() != null) {
			if(current.getData()>=current.getRight().getData()) { 
				return false;
			}
			if (!isBST(current.getRight())) {
				return false;
			}
		}

         return true;
	}

}