package TASK;
import java.io.*;
import java.util.*;
public class FileHandling {

	public static void main(String[] args) {
while(true)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("\nEnter your comment");
	String r = sc.next();

	

		try
		{
			FileOutputStream f = new FileOutputStream("D:\\ranjith.txt");
			DataOutputStream d = new DataOutputStream(f);
		
			f.write(r.getBytes());
			
			FileInputStream f1 = new FileInputStream("D:\\ranjith.txt");
			DataInputStream d1 = new DataInputStream(f1);
			int count = d1.available();
			byte c []= new byte[count];
			 d1.read(c);
			
			for(byte b : c)
			{
				char k = (char)b;
				System.out.print(k);
			}
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}}

}
