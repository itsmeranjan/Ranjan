package TASK;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.*;
public class FileRead {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
		FileOutputStream fo= new FileOutputStream("D:\\ gayu.txt");
		DataOutputStream d=new DataOutputStream(fo);
		System.out.println("Enter the String Input");
		String str=sc.nextLine();
		d.write(str.getBytes());
		d.close();
		fo.close();
		FileInputStream fi=new FileInputStream("D:\\ gayu.txt");
		DataInputStream d1=new DataInputStream(fi);
        int count =fi.available();
        byte br[]=new byte[count];
        d1.read(br);
        for(byte bt:br) {
        	char k=(char)bt;
        	System.out.print(k);
        }
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
