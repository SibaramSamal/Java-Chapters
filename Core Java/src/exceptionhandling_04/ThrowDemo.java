package exceptionhandling_04;

import java.util.Scanner;

class Voting {
	int age;

	void validate(int age) {
		this.age = age;
		if (age < 18)
			try {
				throw new ArithmeticException("Age not sufficient");
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
		else
			System.out.println("Vote for your candidate");
	}
}

public class ThrowDemo {
	public static void main(String[] args) {
		Voting obj = new Voting();
		obj.validate(15); // exception prone line
		System.out.println("Other codes");

	}
}