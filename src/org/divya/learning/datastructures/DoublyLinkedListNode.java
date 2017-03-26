package org.divya.learning.datastructures;

class DoublyLinkedListNode<T> {
	private final T data;
	private DoublyLinkedListNode<T> next;
	private DoublyLinkedListNode<T> previous;
	
	DoublyLinkedListNode(T data) {
		this(data, null /* previous */, null /* next */);//this() constructor:It calls the other constructors in this class
	}
	
	DoublyLinkedListNode(T data, DoublyLinkedListNode<T> previous, DoublyLinkedListNode<T> next) {
		this.data=data;
		this.previous = previous;
		this.next=next;
	}
	
	T getData() { 
		return data;
	}
	
	DoublyLinkedListNode<T> getNext() {
		return next;
	}
	
	void setNext(DoublyLinkedListNode<T> next) {
		this.next=next;
	}

	DoublyLinkedListNode<T> getPrevious() {
		return previous;
	}
	
	void setPrevious(DoublyLinkedListNode<T> previous) {
		this.previous = previous;
	}

}