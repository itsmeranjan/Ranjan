package TASK;
import java.util.*;
public class ThreadMain
{
	public static void main(String[] args) 
	{
		
		  Facebook f = new Facebook(); 
		  Whatsapp w = new Whatsapp();
		
		 Thread t1 = new Thread(f); t1.start();
		 Thread t2 = new Thread(w);t2.start();
		
		 
	}
}

class Facebook extends Thread
{

	synchronized void m1()
	{
		for(int i =0 ;i<5;i++)
		{
			
			System.out.println(i);
		}
	}
	public void run()
	{
		m1();
		
	}
}

class Whatsapp extends Thread
{
	synchronized void m2()
	{
		for(int j = 5;j<10;j++)
		{
			System.out.println(j);
		}
	}
	public void run()
	{
		m2();
	}
}