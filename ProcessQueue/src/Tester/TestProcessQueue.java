package Tester;

import java.util.Scanner;

import com.app.org.MyProcess;
import com.app.org.ProcessQueue;

public class TestProcessQueue 
{

	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in))
		{
			ProcessQueue mQue = new ProcessQueue();
			System.out.println("1.Enqueue element in queue");
			System.out.println("2.Dequeue element in queue");
			System.out.println("3.Exit");
			
			boolean flag = true;
			
			while (flag)
			{
				System.out.print("Enter the choice : ");
				try
				{
					switch (sc.nextInt()) 
					{
					case 1:
						System.out.print("Enter the Process details in queue :(pid,pname,owner): ");
						mQue.enqueue(new MyProcess(sc.nextInt(),sc.next(),sc.next()));
						break;
						
					case 2:
						MyProcess mp =(MyProcess) mQue.dequeue();
						System.out.println("Last Process dequeued : "+"\nPNAME : "+mp.getPname()+""
								+ "\nOWNER : "+mp.getOwner());
						break;
						
					case 3:
						flag = false;
					}
				}
				catch (Exception e)
				{
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
