package com.app.org;

import java.util.Scanner;

public class Dlll 
{
	private Node head;
		
	public  Dlll()
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
			head.setPrev(newNode);
			head = newNode;
			return true;
		}
		return false;	
	}
	
	public boolean addAtLast(int data)
	{
		Node newNode = new Node(data);
		if (head == null)
		{
			head = newNode;
			return true;
		}
		
		Node trav = head;
		if(head != null)
		{
			while (trav.getNext() != null)
			{
				trav = trav.getNext();
			}
			trav.setNext(newNode);
			newNode.setPrev(trav);
			return true;
		}
		return false;
	}
	
	public boolean addAtpos(int data) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position : ");
		int pos = sc.nextInt();
		Node newNode = new Node(data);
		Node trav = head;
		if(head == null && pos == 1)
		{
			head = newNode;
			return true;
		}
		
		
		if(head != null)
		{
			if(pos == 1)
			{
				addAtFirst(data);
				return true;
			}
			
			if(pos > 1)
			{
				for (int i = 1; i < pos-1; i++) 
				{
					trav = trav.getNext();
				}
				
				
				if(trav.getNext() ==null)
				{
					addAtLast(data);
					return true;
				}	
				if(trav == null)
					throw new Exception("ListOutOfBounds");
				
				newNode.setNext(trav.getNext());
				trav.getNext().setPrev(newNode);
				newNode.setPrev(trav);
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
			System.out.println("List is Empty!!!!");
			return false;
		}
		
		if (head != null)
		{
			head = head.getNext();
			head.setPrev(null);
			return true;
		}
		return false;
	}
	
	public boolean removeAtLast()
	{
		if(head == null)
		{
			System.out.println("List is Empty!!!");
			return false;
		}
		
		Node trav = head;
		if(head != null)
		{
			while(trav.getNext() != null)
			{
				trav = trav.getNext();
			}
			trav.getPrev().setNext(null);
			return true;
		}
		return false;
	}
	
	public boolean removeAtPos() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position : ");
		int pos = sc.nextInt();
		if (pos == 1 && head == null)
		{
			System.out.println("List is Empty!!!");
		}
		
		if (head != null)
		{
			Node trav = head;
			
			if (pos == 1)
			{
				removeAtFirst();
			}
			
			if(pos > 1) 
			{
				for (int i = 1; i < pos-1; i++)
				{
					trav = trav.getNext();
				}
				
				if(trav == null)
					throw new Exception("ListOutOfBounds");
				
				if (trav.getNext().getNext() == null) 
				{
					trav.setNext(null);
					return true;
				}
					
				trav.setNext(trav.getNext().getNext());
				trav.getNext().setPrev(trav);
				return true;
			}
		}
		return false;	
	}
	
	public void display()
	{
		Node trav = head;
		if(head == null)
		{
			System.out.println("null");
		}
		else
		{
			while(trav != null)
			{
				System.out.print(trav.getData()+" ");
				trav = trav.getNext();
			}
			System.out.println();
		}
	}	
}
