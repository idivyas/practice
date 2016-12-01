package org.divya.learning.datastructures.demo;
import org.divya.learning.datastructures.*;
/**
 *Given two sorted Linked Lists and the expected output is two sorted linked lists of same sizes as the given 
 *linked lists and the numbers in the first list are less than the numbers in the second list.
 *Example:Given linked lists are: 1->5->10, 2->3->7->12  
 *        Output: 1->2->3, 5->7->10->12
 *       
 * @author idivyas
 */
public class LinkedListSort {

	public void sortList(SinglyLinkedList<Integer> list1,SinglyLinkedList<Integer> list2)
	{
		SinglyLinkedListNode<Integer> current1=list1.getHead();
		SinglyLinkedListNode<Integer> current2=list2.getHead();
		SinglyLinkedListNode<Integer> endOfList1=null;
		SinglyLinkedListNode<Integer> previous=null;
		int count=0;
		if((current1==null)||(current2==null))
		{
			return;
		}
		while((current1!=null)&&(current2!=null))
		{
			if(count==list1.size())
			{
				endOfList1=previous;
			}
			if(current1.getData()<current2.getData())
			{
				previous=current1;
				current1=current1.getNext();
			}
			else
			{
				SinglyLinkedListNode<Integer> newCurrent2=current2.getNext();
				current2.setNext(current1);
				if(previous==null)
				{
					list1.setHead(current2);
					previous=current2;
					current2=newCurrent2;
				}
				else
				{
					previous.setNext(current2);
					previous=previous.getNext();
					current2=newCurrent2;
				}
			}
			count++;
		}
		if(current2!=null)
		{
			previous.setNext(current2);
		}
		SinglyLinkedListNode<Integer> headOfList2=endOfList1.getNext();
		list2.setHead(headOfList2);
		endOfList1.setNext(null);
	}

}