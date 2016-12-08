package org.divya.learning.datastructures.demo;

import static org.junit.Assert.*;

import org.divya.learning.datastructures.BinarySearchTree;
import org.junit.Test;

/**
 * Unit-tests for {@link HeightOfBST}
 * 
 * @author idivyas
 */
public class HeightOfBSTTest {

	@Test
	public void testHeight()
	{
		BinarySearchTree<Integer> tree=new BinarySearchTree<>();
		tree.insert(8);
		tree.insert(5);
		tree.insert(10);
		tree.insert(3);
		tree.insert(9);
		tree.insert(13);
		tree.insert(15);
		HeightOfBST maximumDepth=new  HeightOfBST();
		assertEquals(3,maximumDepth.height(tree.getRoot()));
	}
	
	@Test
	public void testHeightOfSingleNode()
	{
		BinarySearchTree<Integer> tree=new BinarySearchTree<>();
		tree.insert(5);
		HeightOfBST maximumDepth=new  HeightOfBST();
		assertEquals(0,maximumDepth.height(tree.getRoot()));
	}

	@Test
	public void testHeightOfEmptyTree()
	{
		BinarySearchTree<Integer> tree=new BinarySearchTree<>();
		HeightOfBST maximumDepth=new  HeightOfBST();
		assertEquals(-1,maximumDepth.height(tree.getRoot()));
	}

}