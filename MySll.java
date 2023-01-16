package com.app.org;

import java.util.Scanner;

public class MySll
{
	private Node head;
	
	public MySll()
	{
		head = null;
	}
	
	public boolean addAtFirst(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return true;
		}
		
		if(head != null)
		{
			newNode.setNext(head);
			head = newNode;
			return true;
		}
		return false;
	}
	
	public boolean addAtLast(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return true;
		}
		Node trav = head;
		if(head != null)
		{
			while(trav.getNext() != null)
			{
				trav = trav.getNext();
			}
			trav.setNext(newNode);
			return true;
		}
		return false;	
	}
	
	public boolean addAtPos(int data,int pos1) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the position : ");
		int pos = pos1;
		Node newNode = new Node(data);
		
		if(head == null && pos == 1)
		{
			head = newNode;
			return true;
		}
		
		if(head != null)
		{
			if(pos == 1)
			{
				newNode.setNext(head);
				head = newNode;
				return true;
			}
			
			Node trav = head;
			if(pos > 1)
			{
				for (int i = 1; i < pos-1; i++) 
				{
					trav = trav.getNext();
					if(trav == null)
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
		if(head == null)
		{
			return false;
		}
		
		if(head != null)
		{
			head = head.getNext();
			return true;
		}
		return false;
	}
	
	public boolean removeAtLast()
	{
		if(head == null)
		{
			return false;
		}
		
		Node trav = head;
		if(head != null)
		{
			while (trav.getNext().getNext() != null)
			{
				trav = trav.getNext();
			} 
			trav.setNext(null);
			return true;
		}
		
		return false;
	}
	
	public boolean removeAtPos() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Position : ");
		int pos = sc.nextInt();
		
		if(head == null)
		{
			return false;
		}
		
		if(head != null)
		{
			if(pos == 1)
			{
				head = head.getNext();
				return true;
			}
			
			Node trav = head;
			if (pos > 1)
			{
				for (int i = 1; i < pos-1; i++) 
				{
					trav = trav.getNext();
				}
				if (trav == null) 
					throw new Exception("ListOutOfBounds");
			}
			trav.setNext(trav.getNext().getNext());
			return true;
		}
		return false;	
	}
	
	public void display() throws Exception
	{
		Node trav = head;
		while(trav != null)
		{
			System.out.print(trav.getData()+" ");
			trav = trav.getNext();
		}
		System.out.println();
	}
}
