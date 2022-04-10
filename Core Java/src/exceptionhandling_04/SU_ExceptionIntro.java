package exceptionhandling_04;

import java.util.Scanner;

public class SU_ExceptionIntro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int x = sc.nextInt();
		System.out.println("Enter 2nd number:");
		int y = sc.nextInt();
		System.out.println("Sum = "+(x+y)); //no exception
		try{
		System.out.println("Div = "+(x/y)); //exception
		}
		catch(ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("Division not possible because 2nd number can't be zero");
		}
		System.out.println("Difference = "+(x-y));
		System.out.println("Product = "+(x*y));
	}
}
