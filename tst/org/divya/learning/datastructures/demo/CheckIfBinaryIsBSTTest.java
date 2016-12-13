package org.divya.learning.datastructures.demo;

import static org.junit.Assert.*;

import org.divya.learning.datastructures.BinarySearchTree;
//import org.divya.learning.datastructures.BinarySearchTreeNode;
import org.junit.Test;

/**
 * Unit-tests for {@link CheckIfBinaryIsBST}
 * 
 * @author idivyas
 */
public class CheckIfBinaryIsBSTTest {
	@Test
	public void testIsBSTTrue()
	{
		BinarySearchTree<Integer> tree=new BinarySearchTree<Integer>();
		tree.insert(9);
		tree.insert(4);
		tree.insert(18);
		tree.insert(2);
		tree.insert(6);
		tree.insert(14);
		tree.insert(26);
		CheckIfBinaryIsBST check=new CheckIfBinaryIsBST();
		assertTrue(check.isBST(tree.getRoot()));
	}
	
	@Test
	public void testIsBSTFalse()
	{
		BinarySearchTree<Integer> tree=new BinarySearchTree<Integer>();
		tree.insert(9);
		tree.insert(6);
		tree.insert(16);
		tree.getRoot().setData(2);
		CheckIfBinaryIsBST check=new CheckIfBinaryIsBST();
		assertFalse(check.isBST(tree.getRoot()));
	}

}
