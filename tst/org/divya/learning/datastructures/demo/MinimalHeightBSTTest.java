package org.divya.learning.datastructures.demo;

import static org.junit.Assert.*;

import org.divya.learning.datastructures.BinarySearchTree;
import org.divya.learning.datastructures.BinarySearchTreeNode;
import org.junit.Test;

/**
 * Unit-tests for {@link MinimalHeightBST}
 * 
 * @author idivyas
 */
public class MinimalHeightBSTTest {

	@Test
	public void testCheckWithHeight()
	{
		int[] array={2,4,5,9,12,15,18,20,23,27};
		int start=0;
		int end=array.length-1;
		MinimalHeightBST minimal=new MinimalHeightBST();
		BinarySearchTree<Integer> tree=new BinarySearchTree<>();
		minimal.create(array,start,end,tree);
		HeightOfBST height=new HeightOfBST();
		assertEquals(3,height.height(tree.getRoot()));
	}
	

	@Test
	public void testCheckEachNode()
	{
	    int[] array={2,4,5,9,12,15,18,20,23,27};
	    int start=0;
	    int end=array.length-1;
	    MinimalHeightBST minimal=new MinimalHeightBST();
	    BinarySearchTree<Integer> tree=new BinarySearchTree<>();
	    minimal.create(array, start, end, tree);
	    
		BinarySearchTreeNode<Integer> current=tree.getRoot();
	    assertEquals(12,current.getData().intValue());	
	    
	    current=current.getLeft();
	    BinarySearchTreeNode<Integer> dividingNode=current;
	    assertEquals(4,current.getData().intValue());	
	    
	    current=current.getLeft();
	    assertEquals(2,current.getData().intValue());
	    
	    current=current.getLeft();
	    assertEquals(null,current);
	    
	    current=dividingNode.getRight();
	    assertEquals(5,current.getData().intValue());
	    
	    current=current.getRight();
	    assertEquals(9,current.getData().intValue());
	    
	    current=tree.getRoot().getRight();
	    dividingNode=current;
	    assertEquals(20,current.getData().intValue());
	    
	    current=current.getRight();
	    assertEquals(23,current.getData().intValue());

	    current=current.getRight();
	    assertEquals(27,current.getData().intValue());
	    
	    current=dividingNode.getLeft();
	    assertEquals(15,current.getData().intValue());
	    
	    current=current.getRight();
	    assertEquals(18,current.getData().intValue());
	}

}
