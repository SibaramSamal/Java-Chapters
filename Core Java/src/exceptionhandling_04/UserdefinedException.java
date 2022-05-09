package exceptionhandling_04;

import java.util.Scanner;

class MyException extends ArithmeticException{
	private String ExpnMsg;
	//method 1:
	MyException(String ExpnMsg){
		this.ExpnMsg = ExpnMsg;
//		super(ExpnMsg);
	}
	
	//method 2:
	public String toString() {
		return ExpnMsg;
	}
}

public class UserdefinedException{
	public static void voterValidation(int age) {
		if(age < 18)
			throw new MyException("Under age for a voter !!!");
		else
			System.out.println("Valid voter ... ");
	}
	public static void main(String[] args) {
		int age = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		try {
		voterValidation(age);
		}catch(MyException e) {
			System.out.println(e);
		}
	}
}
