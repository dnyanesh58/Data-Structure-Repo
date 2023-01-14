package com.app.org;

public class Node <T>
{
	Node prev;
	Node next;
	T data;
	
	public Node(T data2)
	{
		prev = null;
		next = null;
		this.data =  data2;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
