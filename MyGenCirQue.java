package com.app.org;

public class MyGenCirQue <T>
{
	private T myQue[];
	private int front=-1;
	private int rear=-1;
	private int size;
	
	public MyGenCirQue()
	{
		size = 3;
		myQue = (T[]) new Object[size];
	}
	
	public MyGenCirQue(int size)
	{
		this.size = size;
		myQue = (T[]) new Object[size];
	}
	
	public boolean isFull()
	{
		return ((rear == (size - 1) && front ==0));
			
	}
	
	public boolean isEmpty()
	{
		return ( front == -1);
	}
	
	public void enqueue(T ele) throws Exception
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
	public T dequeue() throws Exception
	{
		if (isEmpty()==false)
		{
			T del = myQue[front];
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
