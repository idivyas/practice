package org.divya.learning.datastructures.demo;

import static org.junit.Assert.*;

import org.divya.learning.datastructures.BinarySearchTree;
import org.divya.learning.datastructures.BinarySearchTreeNode;
import org.divya.learning.datastructures.ValueHolder;
import org.junit.Test;

/**
 * Unit tests for {@link DepthOfANode}
 * 
 * @author idivyas
 */
public class DepthOfANodeTest {

	@Test
	public void testDepth()
	{
		BinarySearchTree<Integer> tree=new BinarySearchTree<>();
		tree.insert(10);
		tree.insert(7);
		tree.insert(14);
		tree.insert(5);
		tree.insert(9);
		tree.insert(12);
		tree.insert(15);
		DepthOfANode<Integer> d=new DepthOfANode<>();
		//BinarySearchTreeNode<Integer> n1=new BinarySearchTreeNode<Integer>(14);
		ValueHolder<BinarySearchTreeNode<Integer>> nodeHolder1=new ValueHolder<>(); 
		assertEquals(1,d.depth(tree.getRoot(), 14, nodeHolder1));
		//BinarySearchTreeNode<Integer> n2=new BinarySearchTreeNode<Integer>(9);
		ValueHolder<BinarySearchTreeNode<Integer>> nodeHolder2=new ValueHolder<>();
		assertEquals(2,d.depth(tree.getRoot(), 9, nodeHolder2));
		//assertEquals(1,d.depth(tree.getRoot(), 10));
	}
}
