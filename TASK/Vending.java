package TASK;

import java.util.Scanner;

public class Vending {

	 static Scanner sc= new Scanner (System.in);
	  static int amount,balance;
	  
	  private static void balmethod(int value)
	  
	  {
		  if(balance < 10)
		  {
			  System.out.println("Low balance");
			  System.out.println("Your balance is " +value);
		  }else if(balance>=10)
		  {
			 
			  System.out.println("Your balance is"+value);
			  System.out.println("Do you want to continue Shopping Enter yes or enter No");
			  String value2=sc.nextLine();
			  if(value2.equalsIgnoreCase("yes"))
			  {
				  if(balance>=10&&balance<20)
				  {
					  tenProd();
				  }
				  else
				  {
					  twentyProd();
				  }
			  }
			  else
			  {
				  System.out.println("your balance is"+ balance);
			  }
		  }
	  }
	 private static void tenProd()
	 {
		 System.out.println("These Are Rs.10 Products");
		 System.out.println("1.Apple");
		 System.out.println("2.Orange");
		 System.out.println("3.gouva");
		 System.out.println("4.mango");
		 int num =sc.nextInt();
		 switch(num)
		 {
		 case 1:
			 System.out.println("Apple Rs.10");
			 break;
		 case 2:
			 System.out.println("Orange Rs.10");
			 break;
		 case 3:
			 System.out.println("Gouva Rs.10");
			 break;
		 case 4:
			 System.out.println("Mango Rs.10");
			 break;
		default:
			System.out.println("Invalid Number..");
			System.out.println("Try Again...");
			tenProd();
			break;

		 }
		 balance=amount-10;
		 balmethod(balance);
	 }
	 private static void twentyProd()
	 {
		 System.out.println("These Are Rs.20 Products");
		 System.out.println("1.Tea");
		 System.out.println("2.Coffee");
		 System.out.println("3.boost");
		 System.out.println("4.Horlicks");
		System.out.println("want to buy 20 rupees product Enter yes or No to buy Rs.10 product");
		String val = sc.nextLine();
		if(val.equalsIgnoreCase("No"))
		{
			tenProd();
		}
		else
		{
			System.out.println("enter a number");
		
		 int num =sc.nextInt();
		 switch(num)
		 {
		 case 1:
			 System.out.println("Tea Rs.20");
			 break;
		 case 2:
			 System.out.println("Coffee Rs.20");
			 break;
		 case 3:
			 System.out.println("Boost Rs.20");
			 break;
		 case 4:
			 System.out.println("Horlicks Rs.20");
			 break;
		default:
			System.out.println("Invalid Number..");
			System.out.println("Try Again...");
			twentyProd();
			break;

		 }
		 balance=amount-20;
		 balmethod(balance);
	 }
	 }
	 private static void thirdProd()
	 {
		 System.out.println("These Are Rs.30 Products");
		 System.out.println("1.Pizza");
		 System.out.println("2.Burger");
		 System.out.println("3.Sandwich");
		 System.out.println("4.Hotdog");
		System.out.println("want to buy 30 rupees product Enter yes or No to buy Rs.20 product");
		String val = sc.nextLine();
		if(val.equalsIgnoreCase("No"))
		{
			twentyProd();
		}
		else
		{
			System.out.println("enter a number");
		
		 int num =sc.nextInt();
		 switch(num)
		 {
		 case 1:
			 System.out.println("pizza Rs.30");
			 break;
		 case 2:
			 System.out.println("burger Rs.30");
			 break;
		 case 3:
			 System.out.println("sandwich Rs.30");
			 break;
		 case 4:
			 System.out.println("Hotdog Rs.30");
			 break;
		default:
			System.out.println("Invalid Number..");
			System.out.println("Try Again...");
			thirdProd();
			break;

		 }
		 balance=amount-30;
		 balmethod(balance);
	 }
	 }
	public static void main(String[] args) {
	
System.out.println("Welcome...");
System.out.println("Enter Amount..");
amount=sc.nextInt();
System.out.println("Your Amount ...Rs"+amount);
if(amount>=10&& amount<20)
{
	tenProd();
	
}
else if(amount>=20&&amount<30)
{
	twentyProd();
}
else if(amount>=30&&amount<40)
{
	thirdProd();
}

	}

}
