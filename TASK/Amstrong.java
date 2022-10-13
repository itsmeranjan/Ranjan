 package TASK;

import java.util.*;

public class Amstrong {
	private static Scanner sc;

	public static void main(String arg[])
	{
		sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum=0,r ,digit=0;
		int temp=num;
		while(num>0)
		{
			num=num/10;
			digit++;
		}
		num=temp;
		while(num>0)
		{
			r=num%10;
			sum=(int)(sum+(Math.pow(r,digit)));
			num=num/10;
		}
	
		if(temp==sum)
		{
			System.out.println("Amstrong Number");
		}
		else
		{
			System.out.println("not Amstrong Number");
		}
		
	}

}
