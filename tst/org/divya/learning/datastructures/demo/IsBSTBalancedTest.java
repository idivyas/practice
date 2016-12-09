package org.divya.learning.datastructures.demo;

import static org.junit.Assert.*;

import org.divya.learning.datastructures.BinarySearchTree;
import org.junit.Test;

/**
 * Unit-tests for {@link IsBSTBalanced}
 * 
 * @author idivyas
 */
public class IsBSTBalancedTest {

	@Test
	public void testForBalancedTree()
	{
		BinarySearchTree<Integer> tree=new BinarySearchTree<>();
		tree.insert(5);
		tree.insert(3);
		tree.insert(7);
		tree.insert(1);
		tree.insert(4);
		tree.insert(6);
		tree.insert(8);
		IsBSTBalanced balance=new IsBSTBalanced();
		assertTrue(balance.isBalanced(tree));
	}
	
	@Test
	public void testForUnBalancedTree()
	{
		BinarySearchTree<Integer> tree=new BinarySearchTree<>();
		tree.insert(8);
		tree.insert(5);
		tree.insert(11);
		tree.insert(3);
		tree.insert(7);
		tree.insert(10);
		tree.insert(2);
		tree.insert(9);
		tree.insert(1);
		IsBSTBalanced balance=new IsBSTBalanced();
		assertFalse(balance.isBalanced(tree));
	}
}
