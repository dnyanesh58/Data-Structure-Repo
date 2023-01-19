package com.app.org;

public class SCLL 
{
	Node head;
	
	public SCLL()
	{
		head = null;
	}
	
	public boolean addAtFirst(int data)
	{
		Node newNode = new Node(data);
		if (head == null) 
		{
			head = newNode;
			newNode.setNext(head);
			return true;
		}
		Node trav = head;
		while (trav.getNext() != head) 
		{
			trav = trav.getNext();
		}
		newNode.setNext(head);
		head = newNode;
		trav.setNext(newNode);
		return true;
	}
	
	public boolean addAtLast(int data)
	{
		Node newNode = new Node(data);
		if (head == null) 
		{
			head = newNode;
			newNode.setNext(head);
			return true;
		}
		Node trav = head;
		while(trav.getNext() != head)
		{
			trav = trav.getNext();
		}
		trav.setNext(newNode);
		newNode.setNext(head);
		return true;
	}
	
	
	public boolean addAtPos(int data,int pos) throws Exception 
	{
		Node newNode = new Node(data);
		if (head == null) 
		{
			head = newNode;
			newNode.setNext(head);
			return true;
		}
		
		if (head != null) 
		{
			Node trav = head;
			if (pos == 1) 
			{
				while(trav.getNext() != head)
				{
					trav = trav.getNext();
				}
				newNode.setNext(head);
				head = newNode;
				trav.setNext(newNode);
				return true;
			}
			
			if (pos > 1) 
			{
				for (int i = 1; i < pos-1; i++) 
				{
					trav = trav.getNext();
					if (trav == null)
						throw new Exception("ListOutOfBounds");
				}
				newNode.setNext(trav.getNext());
				trav.setNext(newNode);
				return true;
			}
		}
		return false; 
	}
	 
	public boolean removeAtFirst()
	{
		if (head == null) 
			return false;
		if (head != null) 
		{
			Node trav = head;
			while (trav.getNext() != head) 
			{
				trav = trav.getNext();
			}
			head = head.getNext();
			trav.setNext(head);
			return true;
		}
		return false;	
	}
	
	public boolean removeAtLast()
	{
		if (head == null)
			return false;
		if (head != null) 
		{
			Node del = null;
			Node trav = head;
			while (trav.getNext() != head) 
			{
				del = trav;
				trav = trav.getNext();
			}
			del.setNext(head);
			return true;
		}
		return false;
	}
	
	public boolean removeAtPos(int pos) throws Exception
	{
		if (head == null) 
		{
			return false;
		}
		if (head != null) 
		{
			if (pos == 1) 
			{
				Node trav = head;
				while (trav.getNext() != head) 
				{
					trav = trav.getNext();
				}
				head = head.getNext();
				trav.setNext(head);
				return true;
			}
			
			if (pos > 1) 
			{
				Node trav = head;
				for (int i = 1; i < pos - 1; i++) 
				{
					trav = trav.getNext();
					if (trav == null) 
						throw new Exception("ListOutOfBounds");
				}
				trav.setNext(trav.getNext().getNext());
				return true;
			}
		}
		return false;
	}
	
	public boolean addAtMiddle(int data)
	{
		 	int count = 0;
		 	Node temp = head;
		 	Node newNode = new Node(data);
		 	if (head != null) 
			{
				do 
				{
					count++;
					temp = temp.getNext();
				} while (temp != head);
				
				Node trav = head;
				for (int i = 1; i < count/2; i++) 
				{
					trav = trav.getNext();
				}
				newNode.setNext(trav.getNext());
				trav.setNext(newNode);
				return true;
			}
		 	return false;
	}
	
	public void display()
	{
		Node trav = head;
		if (head != null) 
		{
			do 
			{
				System.out.print(trav.getData()+" ");
				trav = trav.getNext();
			} while (trav != head);
		}
	}
}
