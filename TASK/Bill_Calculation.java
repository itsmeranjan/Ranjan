package TASK;
import java.util.*;
public class Bill_Calculation {
     static String Tname1,Tname2,Tname3;
	 static Scanner sc= new Scanner(System.in);
	 static String Product[]=new String[5];
	 static String dairy_pd[]= {"milkpowder","curd","Butter","chees","ghee"};
	static String veg_pd[]= {"potato","onion","tomato","carrot","mushroom"};
	
	static String drink_pd[]= {"pepsi","redbull","marienda","sprite","fanta"};
	public static void main(String[] args) {
    System.out.println("\nEnter your product:");
	for(int i=0;i<Product.length;i++)
	{
		   Product[i]=sc.nextLine();
	}
  Bill_Calculation bc=new Bill_Calculation();
  Catogeries1 c1=new  Catogeries1();
  c1.start();
  c1.setName("DAIRY PRODUCTS");
  Tname1=c1.getName();
  Catogeries2 c2=new  Catogeries2();
  c2.start();
  c2.setName("VEGTABLE PRODUCTS");
  Tname2=c2.getName();
  Catogeries3 c3=new  Catogeries3();
  c3.start();
  c3.setName("DRINKING PRODUCTS");
  Tname3=c3.getName();
	}
	static synchronized void Dairy()
	{
		System.out.println(Tname1);
		for(int i=0;i<Product.length;i++)
		{
	     for(int j=0;j<dairy_pd.length;j++)
	{
		if(Product[i].equals(dairy_pd[j]))
		{
			System.out.println(dairy_pd[j]);
		}
		
	}
		}
	}
	static synchronized void Vegtables()
	{
		System.out.println(Tname2);
		for(int i=0;i<Product.length;i++)
		{
	     for(int j=0;j<veg_pd.length;j++)
	{
		if(Product[i].equals(veg_pd[j]))
		{
			System.out.println(veg_pd[j]);
		}
		
	}
		}
	}
	static synchronized void Drinks()
	{
		System.out.println(Tname3);
		for(int i=0;i<Product.length;i++)
		{
	     for(int j=0;j<drink_pd.length;j++)
	{
		if(Product[i].equals(drink_pd[j]))
		{
			System.out.println(drink_pd[j]);
		}
		
	}
		}
	}}
	 
 
