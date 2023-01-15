package com.app.org;

public class MyCirQueue 
{
	private int myQue[];
	private int front=-1;
	private int rear=-1;
	private int size;
	
	public MyCirQueue()
	{
		size = 3;
		myQue = new int[size];
	}
	
	public MyCirQueue(int size)
	{
		this.size = size;
		myQue = new int[size];
	}
	
	public boolean isFull()
	{
		return ((rear == (size - 1) && front ==0));
			
	}
	
	public boolean isEmpty()
	{
		return ( front == -1);
	}
	
	public void enqueue(int ele) throws Exception
	{
		 if(isFull()==false)
		{	
			 if(front == -1)
				 front = 0;
			rear=((rear+1)%size);
			myQue[rear] = ele;
		}
		else
		{
			throw new Exception("Queue is full !!!!");
		}
	}
	
	@SuppressWarnings("null")
	public int dequeue() throws Exception
	{
		if (isEmpty()==false)
		{
			int del = myQue[front];
			if(front == rear)
			{
				front = -1;
				rear = -1;
			}
			else
			{
				front=((front+1)%size);
			}
			return del;	
		}
		else
		{
			throw new Exception("Queue is Empty !!!!");
		}
	}
}
