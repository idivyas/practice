package org.divya.learning.datastructures.demo;

import static org.junit.Assert.*;
import org.divya.learning.datastructures.BinarySearchTree;
import org.junit.Test;

/**
 * Unit tests for {@link RootToLeafPathSum}
 * 
 * @author idivyas
 */
public class RootToLeafPathSumTest {

	@Test
	public void testPathSum()
	{
		RootToLeafPathSum sum=new RootToLeafPathSum();
		BinarySearchTree<Integer> tree=new BinarySearchTree<Integer>();
		tree.insert(5);
		tree.insert(4);
		tree.insert(8);
		tree.insert(11);
		tree.insert(13);
		tree.insert(9);
		tree.insert(7);
		tree.insert(2);
		assertFalse(sum.pathSum(tree.getRoot(), 26));
		assertTrue(sum.pathSum(tree.getRoot(), 11));
		assertTrue(sum.pathSum(tree.getRoot(), 20));
		assertTrue(sum.pathSum(tree.getRoot(), 33));
		assertTrue(sum.pathSum(tree.getRoot(), 37));
	}
}
