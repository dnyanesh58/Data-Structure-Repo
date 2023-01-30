package com.app.org;

public class BinaryTreeNew 
{
	Node root;
	
	public BinaryTreeNew()
	{
		root = null;
	}
	
	public Node getRoot() 
	{
		return root;
	}

	public boolean insertNode(int data)
	{
		Node newNode = new Node(data);
		if (root == null) 
		{
			root = newNode;
			return true;
		}
		Node temp = root;
		
		while (temp != null) 
		{
			if (temp.getData() > data) 
			{
				if (temp.getLeft() == null) 
				{
					temp.setLeft(newNode);
					return true;
				}
				temp = temp.getLeft();
			} 
			else 
			{
				if (temp.getRight() == null) 
				{
					temp.setRight(newNode);
					return true;
				}
				temp = temp.getRight();
			}
		}
		return false;
	}
	
	public void inorder(Node root)
	{
		if (root == null)
		{
			return;
		}
		inorder(root.getLeft());
		System.out.print(root.getData()+" ");
		inorder(root.getRight());
	}
	
	public void preorder(Node root)
	{
		if (root == null)
		{
			return;
		}
		System.out.print(root.getData()+" ");
		inorder(root.getLeft());
		inorder(root.getRight());
	}
	
	public void postorder(Node root)
	{
		if (root == null)
		{
			return;
		}
		inorder(root.getLeft());
		inorder(root.getRight());
		System.out.print(root.getData()+" ");
	}
	
	public int getMax()
	{
		Node temp = root;
		while (temp.getRight() != null) 
		{
			temp = temp.getRight();
		}
		return temp.getData();
	}
	
	public int getMin()
	{
		Node temp = root;
		while (temp.getLeft() != null) 
		{
			temp = temp.getLeft();
		}
		return temp.getData();
	}
	
	public boolean search(int key)
	{
		Node temp = root;
		while (temp != null) 
		{
			if (temp.getData() > key) 
			{
				if (key == temp.getData()) 
				{
					System.out.println("Key found in tree");
					return true;
				}
				temp = temp.getLeft();
			}
			else
			{
				if (key == temp.getData()) 
				{
					System.out.println("Key found in tree");
					return true;
				}
				temp = temp.getRight();
			}
		}
		System.out.println("Key not found in tree");
		return false;
	}
}
