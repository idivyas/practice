package org.divya.learning.datastructures.demo;
/**
 * Depth of a node in a Binary Tree.
 * This is the code to determine the depth of a node in a BINARY TREE, but I've given BST as input 
 * instead of BINARY TREE.
 * 
 * @author idivyas
 */
import org.divya.learning.datastructures.BinarySearchTreeNode;
import org.divya.learning.datastructures.ValueHolder;

public class DepthOfANode<T> {
	
	// TODO: This has to return the depth AND a reference to the node.
	public int depth(BinarySearchTreeNode<T> current, T nodeData, 
			ValueHolder<BinarySearchTreeNode<T>> nodeHolder)
	{
		if(current==null)
		{
			return -1;
		}
		
		// BUGBUG: Comparison of objects must be done with .equals() or Objects.equals().
		if(current.getData().equals(nodeData))
		{
			nodeHolder.setValue(current);     //Storing the node for using it in Lowest Common Ancestor program using getParent() 
			return 0;
		}

		int depth1=depth(current.getLeft(),nodeData,nodeHolder);
		int depth2=depth(current.getRight(),nodeData,nodeHolder);
		if(depth1>depth2) //(or)(depth1>-1)
		{
			return depth1+1;
		} 
		else if(depth2>depth1)//(or) (depth2>-1)
		{
			return depth2+1;
		}
		return depth1>depth2 ? depth1 :depth2;
	}
}
