package file.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) throws FileNotFoundException {
		OutputStream opt = new FileOutputStream("C:\\Users\\Sibaram\\Desktop\\FileDemo.txt");
		PrintStream out = new PrintStream(opt) ;
		out.print("Data inserted using Print Stream class..");
	}
}
