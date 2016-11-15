package org.divya.learning.datastructures;
/**
 * Implementation of Singly Linked list
 * 
 * @author idivyas
 */
public class SinglyLinkedList<T> implements ILinkedList<T>{
	private SinglyLinkedListNode<T> head;
	private SinglyLinkedListNode<T> tail;
	private int size;

	public void add(T e) {
		if(isEmpty())
		{
			head=new SinglyLinkedListNode<T>(e);
			tail=head;
		}
		else
		{
			SinglyLinkedListNode<T> newNode=new SinglyLinkedListNode<T>(e,null);
			tail.setNext(newNode);
			tail=newNode;
		}
		size++;
	}

	public void setHead(SinglyLinkedListNode<T> head)
	{
		this.head=head;
	}


	public  SinglyLinkedListNode<T> getHead()
	{
		return head;
	}

	public void setTail(SinglyLinkedListNode<T> tail)
	{
		this.tail = tail;
	}


	public  SinglyLinkedListNode<T> getTail()
	{
		return tail;
	}

	public void clear() {
		head=tail=null;
		size=0;
	}

	public T get(int index) {
		int i=0;
		for(SinglyLinkedListNode<T> node=head;node!=null;node=node.getNext())
		{
			if(index==i)
				return node.getData();
			i++;
		}
		return null;
	}

	public int indexOf(T o){
		int i=0;
		for(SinglyLinkedListNode<T> node=head;node!=null;node=node.getNext())
		{
			if(o.equals(node.getData()))
			{
				return i;
			}
			i++;
		}
		throw new IllegalArgumentException("Value passed does not exist in the list");
	}

	public boolean remove(T o) {
		SinglyLinkedListNode<T> previous=null;
		for(SinglyLinkedListNode<T> current=head;current!=null;current=current.getNext())
		{
			if(o.equals(current.getData()))
			{
				SinglyLinkedListNode<T> next=current.getNext();
				if(previous!=null)
				{
					previous.setNext(next);
				}
				//				if(next!=null)
				//				{
				//					current.setNext(null);
				//				}
				if(current==head)
				{
					head=next;
				}
				if(current==tail)
				{
					tail=previous;
				}

				size--;
				return true;
			}
			previous=current;
		}
		return false;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public void print()
	{
		for(SinglyLinkedListNode<T> node=head;node!=null;)
		{
			System.out.print(node.getData()+" ");
			node=node.getNext();
		}
	}

	void decrementSize() {
		size--;
	}

}