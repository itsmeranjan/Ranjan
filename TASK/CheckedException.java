package TASK;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

	public class CheckedException {

		public static void main(String[] args) throws IOException  {
			File file = new File("D:");
			
			FileInputStream f = new FileInputStream(file);
			f.read();
			FileOutputStream f1 = new FileOutputStream(file);
			f1.write(null);
		}

	}


