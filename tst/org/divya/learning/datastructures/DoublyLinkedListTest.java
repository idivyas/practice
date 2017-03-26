package org.divya.learning.datastructures.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.divya.learning.datastructures.DoublyLinkedList;
import org.junit.Test;

/**
 * Unit-tests for {@link DoublyLinkedList}.
 * 
 * @author Santoshi
 */
public class DoublyLinkedListTest {

	@Test
	public void testAddToEmptyList() {
		DoublyLinkedList<Integer> list =new DoublyLinkedList<>();
		list.add(10);
		assertEquals(10L, list.get(0).longValue());
		assertEquals(1, list.size());
		assertFalse(list.isEmpty());
	}
	
	@Test
	public void testRemoveOnlyElement() {
		DoublyLinkedList<Integer> list =new DoublyLinkedList<>();
		list.add(10);
		assertTrue(list.remove(10));
		assertTrue(list.isEmpty());
		assertEquals(0, list.size());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIndexOfWithEmptyList() throws Exception{
		DoublyLinkedList<Integer> list=new DoublyLinkedList<>();
		assertEquals(1,list.indexOf(10));
	}
	
	//public void testIndexOfWithElements
}
