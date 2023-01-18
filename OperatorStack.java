package com.app.org;

public class OperatorStack
{
		private int top,size;
		private char MyStk[];
		
		public OperatorStack()
		{
			top = -1;
			size = 5;
			MyStk = new char[size];
		}
		
		public OperatorStack(int s)
		{
			top = -1;
			size = s;
			MyStk= new char[size];
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
			
		public void push(char ch) throws Exception
		{
			if(isFull() == false)
			{
				top++;
				MyStk[top] = ch;
			}	
			else
				throw new Exception("Stack Overflow!!!!!");
		}
		
		public char pop() throws Exception
		{
			if (isEmpty() == false)
			{
				char temp = MyStk[top];
				top--;
				return temp;
			}
			else
			{
				throw new Exception("Stack Underflow!!!!");
			}
		}
		
		public char peek() throws Exception
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
		
		public boolean isBalanced(String exprs) throws Exception
		{
			boolean flag1 = false;
			for (int i = 0; i < exprs.length(); i++) 
			{
				char x = exprs.charAt(i);
				
				if (x == '(' || x == '{' || x == '[' || x == '<') 
				{
					push(x);
				}
				
				if(isEmpty() == false)
				{
					char check;
					switch (x)
					{
					case ')':
		                check = pop();
		                if (check == '{' || check == '[' || check == '<')
		                	flag1 = false;
		                else
		                	flag1 = true;
		                break;
		                
					case '}':
		                check = pop();
		                if (check == '(' || check == '[' || check == '<')
		                	flag1 = false;
		                else
		                	flag1 = true;
		                break;
		                
					case ']':
		                check = pop();
		                if (check == '{' || check == '(' || check == '<')
		                	flag1 = false;
		                else
		                	flag1 = true;
		                break; 
		                
					case '>':
		                check = pop();
		                if (check == '{' || check == '(' || check == '[')
		                	flag1 = false;
		                else
		                	flag1 = true;
		                break; 
		    		}
				}
			}
			
			if (flag1)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
}
