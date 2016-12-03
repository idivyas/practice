package org.divya.learning.datastructures;
/**
 * Insert, Search, Delete operations of Binary Search Tree
 * InOrder, PreOrder, PostOder traversals of Binary Search Tree recursively.
 * 
 * @author idivyas
 */
import java.util.ArrayList;



public class BinarySearchTree<T extends Comparable<T>> {
	private BinarySearchTreeNode<T> root;
	private int size=0;

	public void insert(T data)       //Iterative Insertion 
	{
		BinarySearchTreeNode<T> newNode = new BinarySearchTreeNode<T>(data);
		if(root==null)
		{
			root=newNode;
			size++;
			return;
		}

		// Insert into a non-empty tree. You have to traverse it to find a node
		// whose left or right child is null & this node can be put there.
		BinarySearchTreeNode<T> current = root;
		BinarySearchTreeNode<T> parent=null;
		while(current!=null)
		{
			parent=current;//keep track of parent while walking through the nodes 
			if(current.getData().compareTo(data)<0)
			{
				current=current.getRight();
			}
			else
			{
				current=current.getLeft();
			}
		}

		if(parent.getData().compareTo(data)<0)
		{
			parent.setRight(newNode);
		}
		else
			parent.setLeft(newNode);

		size++;
	}

	public void recursiveInsert(T data)    //Recursive Insertion
	{
		BinarySearchTreeNode<T> newNode = new BinarySearchTreeNode<T>(data);
		if(root==null)
		{
			root=newNode;
			size++;
			return;
		}
		else
			recursiveInsert(root,data);
	}
	private void recursiveInsert(BinarySearchTreeNode<T> current,T data){
		BinarySearchTreeNode<T> newNode = new BinarySearchTreeNode<T>(data);
		if(current==null)
		{
			return;
		}
		int compare=current.getData().compareTo(data);
		if(compare==0)
		{
			current.setData(data);
		}
		else if(compare<0)
		{
			recursiveInsert(current.getRight(),data);
			if(current.getRight()==null)
			{
				current.setRight(newNode);
			}
		}
		else if(compare>0)
		{
			recursiveInsert(current.getLeft(),data);
			if(current.getLeft()==null)
			{
				current.setLeft(newNode);
			}
		}
	}






	public boolean search(T data)
	{
		return search(root,data); 
	}

	/**
	 * Step-1: Eliminate unnecessary found variable. 
	 * Step-2: 
	 */
	public boolean iterativeSearch(BinarySearchTreeNode<T> current,T data)   //Iterative Search
	{
		while (current != null) {
			int compare = current.getData().compareTo(data);
			if (compare == 0) {
				return true;
			} else if (compare < 0) {
				current = current.getRight();
			} else {
				current = current.getLeft();
			}
		}
		return false;
	}

	private boolean search(BinarySearchTreeNode<T> current,T data)  //Recursive Search
	{
		boolean found=false;
		if(current==null){
			return false;
		}
		if(current.getData().compareTo(data)==0)
		{
			found=true;
		}
		else if(current.getData().compareTo(data)<0)
		{
			return search(current.getRight(),data);
		}
		else if(current.getData().compareTo(data)>0)
		{
			return search(current.getLeft(),data);
		}
		return found;
	}



	public void delete(T data)            //  Recursive Delete
	{
		delete(root,data);
	}
	private BinarySearchTreeNode<T> delete(BinarySearchTreeNode<T> current,T data)
	{
		if(current==null)
		{
			return null;
		}
		int compare = current.getData().compareTo(data);
		
		if(compare<0)
		{
			current.setRight(delete(current.getRight(),data));
		}
		else if(compare>0)
		{
			current.setLeft(delete(current.getLeft(),data));
		}
		else
		{
			if(current.getRight()==null)
			{
				current=current.getLeft();
			}
			else //find Inorder Successor
			{
				T successor=min(current.getRight());
				current.setData(successor);
				current.setRight(delete(current.getRight(),successor));
			}
		}
		return current;
	}

	public T min(BinarySearchTreeNode<T> node)
	{
		if(node.getLeft()==null)
		{
		  return node.getData();
		}
		else
		  return min(node.getLeft());
	}
	




	public ArrayList<T> inOrder()
	{
		ArrayList<T> values=new ArrayList<>();
		inOrder(values,root);
		return values;
	}	
	private void inOrder(ArrayList<T> values,BinarySearchTreeNode<T> node) {
		if(node==null) //base case
		{
			return;
		}

		inOrder(values,node.getLeft());  //recursive case 
		values.add(node.getData());
		inOrder(values,node.getRight());
	}




	public ArrayList<T> preOrder()
	{
		ArrayList<T> values=new ArrayList<T>();
		preOrder(values,root);
		return values;
	}
	private void preOrder(ArrayList<T> values,BinarySearchTreeNode<T> node)
	{
		if(node==null)
		{
			return;   
		}
		values.add(node.getData());
		preOrder(values,node.getLeft());
		preOrder(values,node.getRight());
	}





	public ArrayList<T> postOrder()
	{
		ArrayList<T> values=new ArrayList<T>();
		postOrder(values,root);
		return values;
	}
	private void postOrder(ArrayList<T> values,BinarySearchTreeNode<T> node)
	{
		if(node==null)
		{
			return;
		}
		postOrder(values,node.getLeft());
		postOrder(values,node.getRight());
		values.add(node.getData());
	}
}