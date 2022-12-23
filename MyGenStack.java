package com.app.org;

public class MyGenStack <T>
{
	private int top,size;
	private T MyStk[];
	
	public MyGenStack()
	{
		top = -1;
		size = 5;
		MyStk = (T[]) new Object[size];
	}
	
	public MyGenStack(int s)
	{
		top = -1;
		size = s;
		MyStk= (T[]) new Object[size];
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
		
	public void push(T ele) throws Exception
	{
		if(isFull() == false)
		{
			top++;
			MyStk[top] = ele;
		}	
		else
			throw new Exception("Stack Overflow!!!!!");
	}
	
	public T pop() throws Exception
	{
		if (isEmpty() == false)
		{
			T temp = MyStk[top];
			top--;
			return temp;
		}
		else
		{
			throw new Exception("Stack Underflow!!!!");
		}
	}
	
	public T peek() throws Exception
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
