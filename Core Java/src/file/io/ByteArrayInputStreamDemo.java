package file.io;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {
	public static void main(String[] args) {
		ByteArrayOutputStream in = new ByteArrayOutputStream();
		String fileContents = "My name is Sibaram Samal";
		byte[] byt = fileContents.getBytes();
		TimeCalculator.startTime();
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Sibaram\\Desktop\\FileDemo.txt");
			in.write(byt);
			in.writeTo(fout);
			System.out.println("Data writted successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		TimeCalculator.endTime();
	}
}
