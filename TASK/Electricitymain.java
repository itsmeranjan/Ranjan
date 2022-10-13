package TASK;
import java.util.*;

public class Electricitymain
{
	private static Scanner sc;

	public static void main(String[] args) {
		
      sc = new Scanner(System.in);
		main m = new main();
		System .out.println("1.Residential\n2.Commertial");
		int choice= sc.nextInt();
		switch(choice)
		{
		case 1:
			  m.residential();
			  break;
		case 2:
			 m.commertial();
			 break;
		}
	}
}

 class main implements ElectricityUsingInterface {
Scanner sc = new Scanner(System.in);
private Scanner sc2;
	@Override
	public void residential() {
		// TODO Auto-generated method stub

		System.out.println("Select your Area\n1.Panjayaththu\n2.Rural\n3.Urban\n4.Metro");
		int area =  sc.nextInt();
		
		switch(area)
		{
		case 1 :System.out.println("Enter your unit");
			int unit = sc.nextInt();
			int amt = ((unit-100)*2)+80;
			System.out.println("your amount is Rs."+amt);
			break;
		case 2 :System.out.println("Enter your unit");
		int unit1 = sc.nextInt();
		int amt1 =  ((unit1-100)*3)+90;
		System.out.println("your amount is Rs."+amt1);
		break;
		
		case 3 :System.out.println("Enter your unit");
		int unit2 = sc.nextInt();
		int amt2 = ((unit2-100)*4)+40;
		System.out.println("your amount is Rs."+amt2);
		break;
		
		case 4 :System.out.println("Enter your unit");
		int unit3 = sc.nextInt();
		int amt3 = ((unit3-100)*5)+120;
		System.out.println("your amount is Rs."+amt3);
		break;
		}
		
	}

	@Override
	public void commertial() {
		sc2 = new Scanner(System.in);
		System.out.println("Select your Area\n1.Panjayaththu\n2.Rural\n3.Urban\n4.Metro");
		int area =  sc2.nextInt();
		
		switch(area)
		{
		case 1 :System.out.println("Enter your unit");
		int unit = sc2.nextInt();
		int amt = ((unit-100)*7)+80;
		System.out.println("your amount is Rs."+amt);
		break;
	case 2 :System.out.println("Enter your unit");
	int unit1 = sc2.nextInt();
	int amt1 =  ((unit1-100)*8)+90;
	System.out.println("your amount is Rs."+amt1);
	break;
	
	case 3 :System.out.println("Enter your unit");
	int unit2 = sc2.nextInt();
	int amt2 = ((unit2-100)*9)+40;
	System.out.println("your amount is Rs."+amt2);
	break;
	
	case 4 :System.out.println("Enter your unit");
	int unit3 = sc2.nextInt();
	int amt3 = ((unit3-100)*10)+120;
	System.out.println("your amount is Rs."+amt3);
	break;
		}
	}

}
 