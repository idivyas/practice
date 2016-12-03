package org.divya.learning.datastructures;
/**
 * Node of Binary Search Tree 
 * 
 * @author idivyas
 */
public class BinarySearchTreeNode<T> {
	private T data;
	private BinarySearchTreeNode<T> left;
	private BinarySearchTreeNode<T> right;
	
	BinarySearchTreeNode(T data)
	{
		this(data,null,null);
	}
	
	BinarySearchTreeNode(T data,BinarySearchTreeNode<T> left,BinarySearchTreeNode<T> right)
	{
		this.data=data;
		this.left=left;
		this.right=right;
	}
	
	T getData()
	{
		return data;
	}
	
	void setData(T data)
	{
		this.data=data;
	}
	
    BinarySearchTreeNode<T> getLeft()
	{
		return left;
	}
	
    void setLeft(BinarySearchTreeNode<T> left)
    {
    	this.left=left;
    }
    
    BinarySearchTreeNode<T> getRight()
    {
    	return right;
    }
    
    void setRight(BinarySearchTreeNode<T> right)
    {
    	this.right=right;
    }

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BinarySearchTreeNode [data=");
		builder.append(data);
		builder.append(", left=");
		builder.append(left);
		builder.append(", right=");
		builder.append(right);
		builder.append("]");
		return builder.toString();
	}

}
