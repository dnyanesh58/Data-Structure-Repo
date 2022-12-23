package com.app.dsa;

public class MyStack 
{
	private int top,size;
	private int MyStk[];
	
	public MyStack()
	{
		top = -1;
		size = 5;
		MyStk = new int[size];
	}
	
	public MyStack(int s)
	{
		top = -1;
		size = s;
		MyStk= new int[size];
	}
	
	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public boolean isFull()
	{
		if(top == size-1)
			return true;
		else
			return false;
	}
		
	public void push(int ele) throws Exception
	{
		if(isFull() == false)
		{
			top++;
			MyStk[top] = ele;
		}	
		else
			throw new Exception("Stack Overflow!!!!!");
	}
	
	public int pop() throws Exception
	{
		if (isEmpty() == false)
		{
			int temp = MyStk[top];
			top--;
			return temp;
		}
		else
		{
			throw new Exception("Stack Underflow!!!!");
		}
	}
	
	@Override
	public String toString()
	{
		return "MyStack : "+MyStk[0]+" "+MyStk[1]+" "+MyStk[2]+" "+MyStk[3]+" "+MyStk[4];
	}

	public int peek() throws Exception
	{
		if(isEmpty() == false)
			return MyStk[top];
		else
			throw new Exception("Stack is Empty!!!!");
	}
	
	public int getSize()
	{
		return this.size;
	}
}
