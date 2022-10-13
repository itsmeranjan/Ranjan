package TASK;

public class  Catogeries1 extends  Thread
{
 public void run()
{
	Bill_Calculation .Dairy();
}
}
class   Catogeries2 extends Thread
{
	public void run()
	{
		Bill_Calculation .Vegtables();
	}
}
 class Catogeries3 extends Thread
{
	 public void run()
	 {
	 	Bill_Calculation .Drinks();
	 }
}
