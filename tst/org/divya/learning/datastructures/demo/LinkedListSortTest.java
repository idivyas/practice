package org.divya.learning.datastructures.demo;
import static org.junit.Assert.*;

/**
 * Given two sorted linked lists, obtain the output in which the first linked list contains the first few numbers
 * of the list which is a combination of both the lists and is completely sorted and the second linked list 
 * contains the remaining numbers.
 *
 *  @author idivyas
 */
import org.divya.learning.datastructures.SinglyLinkedList;
import org.junit.Test;
/**
 *Unit-tests for {@link LinkedListSort}
 * 
 * @author idivyas
 */
public class LinkedListSortTest {

	@Test
	public void testSort()
	{
		SinglyLinkedList<Integer> list1=new SinglyLinkedList<>();
		list1.add(1);
		list1.add(5);
		list1.add(10);

		SinglyLinkedList<Integer> list2=new SinglyLinkedList<>();
		list2.add(2);
		list2.add(3);
		list2.add(7);
		list2.add(12);
		
		LinkedListSort sort=new LinkedListSort();
		sort.sortList(list1, list2);
		
		SinglyLinkedList<Integer> newList1=new SinglyLinkedList<>();
		newList1.add(1);
		newList1.add(2);
		newList1.add(3);
		assertEquals(newList1,list1);

		SinglyLinkedList<Integer> newList2=new SinglyLinkedList<>();
		newList2.add(5);
		newList2.add(7);
		newList2.add(10);
		newList2.add(12);
		assertEquals(newList2,list2);
	}

	
	@Test
	public void testReverse()
	{
		SinglyLinkedList<Integer> list1=new SinglyLinkedList<>();
		list1.add(2);
		list1.add(3);
		
		SinglyLinkedList<Integer> list2=new SinglyLinkedList<>();
		list2.add(1);
		list2.add(5);

		LinkedListSort sort=new LinkedListSort();
		sort.sortList(list1, list2);
		
		SinglyLinkedList<Integer> newList1=new SinglyLinkedList<>();
		newList1.add(1);
		newList1.add(2);
		assertEquals(newList1,list1);

		SinglyLinkedList<Integer> newList2=new SinglyLinkedList<>();
		newList2.add(3);
		newList2.add(5);
		assertEquals(newList2,list2);
	}
	
	@Test
	public void testBorderCases()
	{
		SinglyLinkedList<Integer> list1=new SinglyLinkedList<>();
				
		SinglyLinkedList<Integer> list2=new SinglyLinkedList<>();
		list2.add(1);
		
		LinkedListSort sort=new LinkedListSort();
		sort.sortList(list1, list2);
		
		SinglyLinkedList<Integer> newList1=new SinglyLinkedList<>();
		assertEquals(newList1,list1);

		SinglyLinkedList<Integer> newList2=new SinglyLinkedList<>();
		newList2.add(1);
		assertEquals(newList2,list2);
	}

	
}
