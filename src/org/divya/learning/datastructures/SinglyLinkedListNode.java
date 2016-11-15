package org.divya.learning.datastructures;
/**
 * Implementation of Node for Singly Linked List
 * 
 * @author idivyas
 */
class SinglyLinkedListNode<T> {
	private T data;
	private SinglyLinkedListNode<T> next;
	
	SinglyLinkedListNode(T data){
		this(data,null);
	}
	
	SinglyLinkedListNode(T data,SinglyLinkedListNode<T> next){
	this.data=data;
	this.next=next;
	}
	
	T getData()
	{
		return data;
	}
	
	void setNext(SinglyLinkedListNode<T> next)
	{
		this.next=next;
	}
	
	SinglyLinkedListNode<T> getNext()
	{
		return next;
	}
}
