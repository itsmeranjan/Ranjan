package TASK;
import java.util.*;
public class ThreadExample {
     static Scanner sc= new Scanner(System.in); 
    

			   public static void main(String[] args) {
				   System.out.println("Enter 1st elements");
				    int a=sc.nextInt();
				    System.out.println("Enter 2st elements");
				    int b=sc.nextInt();
               
				    Division div=new Division();
		               div.run(a,b);
		               System.out.println("Division Priority "+div.getPriority());
		      
		               Multiplication mul=new   Multiplication();
		                mul.run(a,b);
		             	System.out.println("Multiplication Priority "+mul.getPriority());
		            	System.out.println();
		            	
		            	
		            	Subtraction sub= new Subtraction();
		                sub.run(a,b);
		             	System.out.println("Subtraction Priority "+sub.getPriority());
		               
		            	System.out.println();
		            	
				Addition add= new Addition();
				add.run(a,b);
				System.out.println("Addition Priority "+add.getPriority());
				add.setPriority(10);
				System.out.println("Addition Priority "+add.getPriority());
				
				System.out.println();
                
               
              
               
	}

}
class Addition extends Thread
{
	public void run(int a,int b)
	{
		
		int c=a+b;
		System.out.println("Addition = "+c);
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
class Subtraction extends Thread
{

	public void run(int a,int b)
	{
		int c=a-b;
		System.out.println("Subtraction = "+c);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Multiplication extends Thread
{

	public void run(int a,int b)
	{
		int c=a*b;
		System.out.println("Multiplication = "+c);
		
		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Division extends Thread
{

	public void run(int a,int b)
	{
		
		int c=a/b;
		System.out.println("Division = "+c);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}