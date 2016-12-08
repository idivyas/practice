package org.divya.learning.datastructures.demo;
import org.divya.learning.datastructures.BinarySearchTreeNode;

/**
 * Height of Binary Search Tree
 * 
 * @author idivyas
 */
public class HeightOfBST {

	public int height(BinarySearchTreeNode<Integer> root)
	{
		return heightOfBST(root);
	}

	private int heightOfBST(BinarySearchTreeNode<Integer> current)
	{
		if(current==null)
		{
		return -1;
		}
		int leftHeight=heightOfBST(current.getLeft());
		int rightHeight=heightOfBST(current.getRight());
	    int height=leftHeight > rightHeight ? leftHeight+1 : rightHeight+1;
	    return height;
	}

}
