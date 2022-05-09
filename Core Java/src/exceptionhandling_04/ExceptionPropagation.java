package exceptionhandling_04;

import java.io.IOException;

public class ExceptionPropagation {
	public static void m1() throws IOException {
		System.out.println("In first method...");
			System.out.println(10 / 0);	//this line will raise exception
			/* 
				We can put this line in try block and handle it for normal flow of the program or we can 
				handle it at any step where m1() is being called.
					As m1() is directly or indirectly called by m2 and m3(), that is m1() is propagated
					from top level to buttom level.
				As we can handle the exception at any level of propagated location, such type of exception
				handling is called, "Exception Propagation".
			 */
			
			throw new IOException();//here we have thrown checked exception. So mandatory to use throws in method defination.
	}
	public static void m2() throws IOException {
		m1();	//as this method throws an checked exception, here also we have to use throws with Exceptio type in method defination. 
		System.out.println("In second method...");
	}
	public static void m3() {
		try {
		m2();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("In third method...");
	}
	
	public static void main(String[] args) {
		m3();
		System.out.println("Rest of the line...");
	}
}
