package exceptionhandling_04;

public class FinallyDemo {

	public static void main(String[] args) {
		try {
			int x = 10/0;
		}
		finally {
			System.out.println("Finally block");
		}
	}

}

/*
	- Finally block in java is the block that ensures the prgrammer that this block will execute must

*/