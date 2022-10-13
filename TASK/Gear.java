package TASK;
import java.util.*;
 public class Gear
{

private static Scanner sc;
public static void main(String[] args) {
		sc = new Scanner(System.in);
    System.out.println("Enter the GEAR number");
    int n=sc.nextInt();
  
    switch(n)
    {
    case 1:
    	car.gear1();
    	break;
    case 2:
    	car.gear2();
    	break;
    case 3:
    	car.gear3();
    	break;
    case 4:
    	car.gear4();
    	break;
    default:
    	System.out.println(" car already stopped");
    	break;
    	
    }
}
class car extends Gear{

	 static Scanner s1;
     static Scanner s2;
	 static Scanner s3;
	 static Scanner s4;
	 static void gear1()
{
System.out.println("current speed is 10 to 20");
System.out.println("Do you want to apply the break"); 
s1 = new Scanner(System.in);
int yes= s1.nextInt();
 if(yes==1)
 {
System.out.println(" Stop ");	 
 }
}
public static void gear2()
{
	System.out.println("current speed is 20 to 30");
	System.out.println("Do you want to apply the break"); 
	s2 = new Scanner(System.in);
	int yes= s2.nextInt();
	 if(yes==1)
	 {
	gear1();	 
	 }
}
public static void gear3()
{
	System.out.println("current speed is 30 to 40");
	System.out.println("Do you want to apply the break"); 
	s3 = new Scanner(System.in);
	int yes= s3.nextInt();
	 if(yes==1)
	 {
	gear2();
	 }
}
public  static void gear4()
{
	System.out.println("current speed is 40 and above");
	System.out.println("Do you want to apply the break"); 
	s4 = new Scanner(System.in);
	int yes= s4.nextInt();
	 if(yes==1)
	 {
	gear3();	 
	 }
}
    
	}

}