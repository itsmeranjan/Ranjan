package TASK;

import java.util.*;
public class Palindrome {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int num1=num;
		int rev=0,rem;
		while(num!=0)
		{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		System.out.println(rev);
		if(num1 == rev)
		{
		
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
		
		
	}
	}


