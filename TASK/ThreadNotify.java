package TASK;

public class ThreadNotify {

	public static void main(String[] args) {
	
		
		Task obj=new Task();
		new Thread()
		{
			public void run()
			{
				obj.withdraw(11000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				obj.Deposit(5000);
			}
		}.start();
		
		}
	}
class Task
{
	int amount = 15000;
	private int amt;
	synchronized void withdraw(int amt)
	{
		
		System.out.println("going to withdraw");
		
		if(this.amt<amount)
		{
			System.out.println("low balance");
			try 
			{
			wait();	
			}
			catch(Exception e)
			{
				
			}
			this.amt-=amount;
			System.out.println("withdraw completed");
		
		}
	
	}
	synchronized void Deposit(int amt)
	{
		System.out.println("going to deposite");
		this.amt+=amount;
		System.out.println("deposite completed");
		notify();
	}

	
	}	

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	