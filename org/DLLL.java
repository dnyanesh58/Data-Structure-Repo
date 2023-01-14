package com.app.org;

public class DLLL <T>
{
	Node head;
	
	public DLLL()
	{
		head = null;
	}
	
	public boolean addAtFirst(T data)
	{
		Node newNode = new Node(data);
		if (head == null) 
		{
			head = newNode;
			return true;
		}
		newNode.setNext(head);
		newNode.setPrev(null);
		head = newNode;
		return false;
	}
	
	public boolean addAtLast(T data)
	{
		Node newNode = new Node(data);
		if (head == null) 
		{
			head = newNode;
			return true;
		}
		
		Node trav = head;
		while (trav.getNext() != null)
		{
			trav = trav.getNext();
		}
		trav.setNext(newNode);
		newNode.setPrev(trav);
		return true;
	}
	
	public boolean addAtPos(T data,int pos) throws Exception
	{
		Node newNode = new Node(data);
		if (head == null) 
		{
			head = newNode;
			return true;
		}
		
		if (head != null) 
		{
			if (pos == 1) 
			{
				newNode.setNext(head);
				newNode.setPrev(null);
				head = newNode;
				return true;
			}
			
			Node trav = head;
			if (pos > 1) 
			{
				for (int i = 1; i < pos - 1; i++) 
				{
					trav = trav.getNext();
				}
				
				if (trav.getNext() == null) 
				{
					trav.setNext(newNode);
					newNode.setPrev(trav);
					return true;
				}
				if (trav == null) 
					throw new Exception("ListOutOfBounds");
				
				newNode.setNext(trav.getNext());
				trav.getNext().setPrev(newNode);
				trav.setNext(newNode);
				newNode.setPrev(trav);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeAtFirst()
	{
		if (head == null) 
			return false;
		head = head.getNext();
		head.setPrev(null);
		return true;
	}
	
	
	public boolean removeAtLast()
	{
		if (head == null) 
			return false;
		Node trav = head;
		while (trav.getNext() != null) 
		{
			trav = trav.getNext();
		}
		trav.getPrev().setNext(null);
		return true;
	}
	
	public boolean removeAtPos(int pos) throws Exception
	{
		if (head == null) 
			return false;
		if (head != null) 
		{
			if (pos == 1) 
			{
				head = head.getNext();
				head.setPrev(null);
				return true;
			}
			Node trav = head;
			if (pos >1) 
			{
				for (int i = 1; i < pos-1; i++) 
				{
					trav = trav.getNext();
				}
				
				if (trav.getNext().getNext() == null) 
				{
					trav.setNext(null);
					return true;
				}
				
				trav.setNext(trav.getNext().getNext());
				trav.getNext().setPrev(trav);
				
				if (trav==null)
					throw new Exception("ListOutOfBounds");
				return true;
			}
		}
		return false;
	}
	
	public void display()
	{
		Node trav = head;
		while (trav != null) 
		{
			System.out.print(trav.getData()+" ");
			trav = trav.getNext();
		}
		System.out.println();
	}
}
