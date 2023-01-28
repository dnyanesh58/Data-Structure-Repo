package com.app.org;

public class MyProcess 
{
	private int pid;
	private  String pname;
	private String owner;
	
	public MyProcess(int pid,String pname,String owner)
	{
		this.pid = pid;
		this.pname = pname;
		this.owner = owner;
	}

	public int getPid() 
	{
		return pid;
	}

	public String getPname()
	{
		return pname;
	}

	public String getOwner() 
	{
		return owner;
	}	
}
