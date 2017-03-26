package org.divya.learning.datastructures;

public class DoublyLinkedList<T> implements ILinkedList<T> {

	private DoublyLinkedListNode<T> head;
	private DoublyLinkedListNode<T> tail;
	private int size;

	public void add(T e) {
		if (isEmpty()) {
			head = new DoublyLinkedListNode<T>(e); 
			tail = head;
		} else {
			DoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<T>(e, tail /* previous*/, null /* next */);
			tail.setNext(newNode);
			newNode.setPrevious(tail);
			tail = newNode;
		}
		size++;
	}

	public void clear() {
		head = tail = null;
		size = 0;
	}

	public T get(int index) {
		int i=0;
		for(DoublyLinkedListNode<T> n=head;n!=null;)
		{
			if(index==i)
			{
				return n.getData();
			}
			n=n.getNext();
			i++;
		}
		return null;
	}

	public int indexOf(T o) {

		int i=0;
		for(DoublyLinkedListNode<T> n=head;n!=null;)
		{
			if(o==n.getData())
			{
				return i;
			}
			n=n.getNext();
			i++;
		}
		throw new IllegalArgumentException("Value passed does not exist in the list");
	}

	public boolean remove(T o) {
		for(DoublyLinkedListNode<T> current=head;current!=null; current=current.getNext())
		{
			if(o.equals(current.getData()))  // Never use == to compare objects. It's only for primitives and enums.
			{
				DoublyLinkedListNode<T> previous=current.getPrevious();
				DoublyLinkedListNode<T> next=current.getNext();
				if (previous != null) {
					previous.setNext(next);
				}
				if (next != null) {
					next.setPrevious(previous);
				}
				if (current == head) {
					head = next;
				}
				if (current == tail) {
					tail = previous;
				}
				
				size--;
				return true;
			}
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
		for(DoublyLinkedListNode<T> n=head;n!=null;)
		{
			System.out.print(n.getData()+" ");
			n=n.getNext();
		}
	}
}	
/*
	public static void main(String[] args) throws Exception
	{
		LinkedList<Integer> l=new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.print();
		System.out.println();
		System.out.println(l.get(2));
		System.out.println(l.indexOf(20));
		l.remove(10);
		l.print();
	}

}

/*
if(n==head)
{
	  n=n.getNext();
	  head=n;
	  head.setPrevious(null);
	  return true;
}
if(n==tail)
{
	 n=n.getPrevious();
	 tail=n;
	 tail.setNext(null);
	 return true;
}
*/