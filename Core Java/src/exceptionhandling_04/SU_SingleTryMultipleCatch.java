package exceptionhandling_04;

import java.util.Scanner;

class Xyz{
	int x;
}
public class SU_SingleTryMultipleCatch {
	public static void main(String[] args) {
		int x,y;
		Xyz obj = null;
		int[] arr = new int[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no. : ");
		x = sc.nextInt();
		System.out.println("Enter second no. : ");
		y = sc.nextInt();
		try {
			System.out.println("Div = "+(x/y));
			arr[2] = 25;
			System.out.println(obj.x);
		}
		catch(ArithmeticException e) {
			System.out.println("Can't devide by zero");
		}
		catch(NullPointerException e) {
			System.out.println("Initialize reference variable");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index can't be <0 or >(size-1)");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		// We can also place all these separate catch blocks in a single line
		/*catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			if(e instanceof ArithmeticException)
				System.out.println("Can't devide by zero");
			if(e instanceof NullPointerException)
				System.out.println("Initialize reference variable");
			if(e instanceof ArrayIndexOutOfBoundsException)
				System.out.println("Array index can't be <0 or >(size-1)");
		}*/
	}
}

/*
	- We can not place multiple try blocks without catch bu t can have multiple catch blocks for a single try block
	- After any one of catch block, no further catch will execute. So it is recomended to handle all the exceptions in separate try blocks.



*/