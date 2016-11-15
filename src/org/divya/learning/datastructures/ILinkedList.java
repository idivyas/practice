package org.divya.learning.datastructures;
/**
 *Interface that declares the operations of a Singly Linked List
 * 
 * @author idivyas
 */
public interface ILinkedList<T>{
	public void add(T e);
	public void clear();
	public int indexOf(T o);
	public boolean remove(T o);
	public boolean isEmpty();
	public int size();
	public T get(int index);
}
