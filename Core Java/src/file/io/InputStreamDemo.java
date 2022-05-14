package file.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamDemo {
	
	public static void main(String[] args) {
		try {
			FileOutputStream obj = new FileOutputStream("C:\\Users\\Sibaram\\Desktop\\FileDemo.txt",true);
			String data = "This is the demo contents to be writen in a file... ok";
			byte[] byteConvertedData = data.getBytes();
			TimeCalculator.startTime();	//Time measurement at starting point
			for(int i=0 ; i<data.length() ; i++) {
				obj.write(byteConvertedData[i]);
			}
			obj.write(97); // we can pass within -128 to 127
			System.out.println("Data inserted successfully !!!");
			TimeCalculator.endTime();	//time measurement at end point
			
			/*
			// to read file data
			FileInputStream fin = new FileInputStream("C:\\Users\\Sibaram\\Desktop\\FileDemo.txt");
			while(true) {
				int i = fin.read();
				if(i == -1) {
					System.out.println("End of file");
					break;
				}
				System.out.print((char)i);
			}
			*/
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
