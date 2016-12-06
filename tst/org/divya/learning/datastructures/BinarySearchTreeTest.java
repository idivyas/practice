package org.divya.learning.datastructures;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

/**
 * Unit-tests for {@link BinarySearchTree}.
 * 
 * @author idivyas
 */
public class BinarySearchTreeTest {

	@Test
	public void testInOrder() {
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
		tree.insert(8);
		tree.insert(10);
		tree.insert(5);
		tree.insert(3);
		tree.insert(6);
		tree.insert(7);
		assertEquals(Arrays.asList(3,5,6,7,8,10),tree.inOrder());
	}

	@Test
	public void testPreOrder(){
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
		tree.insert(8);
		tree.insert(5);
		tree.insert(10);
		tree.insert(9);
		tree.insert(7);
		tree.insert(3);
		tree.insert(12);
		tree.insert(6);
		tree.insert(1);
		assertEquals(Arrays.asList(8,5,3,1,7,6,10,9,12),tree.preOrder());
	}


	@Test
	public void testPostOrder(){
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
		tree.insert(8);
		tree.insert(5);
		tree.insert(10);
		tree.insert(9);
		tree.insert(7);
		tree.insert(3);
		tree.insert(12);
		tree.insert(6);
		tree.insert(1);
		assertEquals(Arrays.asList(1,3,6,7,5,9,12,10,8),tree.postOrder());
	}


	@Test
	public void testSearch(){
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
		tree.insert(8);
		tree.insert(5);
		tree.insert(10);
		tree.insert(3);
		tree.insert(7);
		tree.insert(9);
		tree.insert(12);
		tree.insert(1);
		tree.insert(6);
		assertTrue(tree.search(9));
		assertFalse(tree.search(4));
	}

	
	@Test
	public void testDelete(){
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
		tree.insert(8);
		tree.insert(5);
		tree.insert(10);
		tree.insert(3);
		tree.insert(7);
		tree.insert(9);
		tree.insert(12);
		tree.insert(1);
		tree.insert(6);
		tree.delete(9);
		assertEquals(Arrays.asList(1,3,5,6,7,8,10,12),tree.inOrder());
		tree.delete(10);
		assertEquals(Arrays.asList(1,3,5,6,7,8,12),tree.inOrder());
		tree.delete(5);
		assertEquals(Arrays.asList(1,3,6,7,8,12),tree.inOrder());
	}
}