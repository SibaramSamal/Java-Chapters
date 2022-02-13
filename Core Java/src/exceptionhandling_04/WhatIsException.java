package exceptionhandling_04;

public class WhatIsException {
	public static void main(String[] args) {
		doSomething();
		
	}

	public static void doSomething() {
		doSomethingExtra();
		
	}

	public static void doSomethingExtra() {
		System.out.println("Hello");
		System.out.println(10 / 0);	//this line will cause exception
	}
}
/*
=============	steps happen after some exception raises:	==============
step1:
------
	At which method the exception is raised, that method is totally responsible to create an Exception object having the following details:
	1. Exception name (here in this example "ArithmaticException")
	2. full description of Exception (in this case, 10 devide by zero)
	3. Location where it occours ( at doSomethingExtra()
									at doSomething()
									at main()   )
				and JVM terminates that method abnormally. So doSomethingExtra() terminated abnormally.
step2:
------
	Then in the next step, JVM search for the method from where this faulty method was called.
	After finding that method, it checkes whether that code has some code related to handle that exception or not. If not there JVM terminates that mathod also. so doSomething() terminated.
	now finally JVM goes to main() and here also it didnot found any exception handling codes in it. So JVM terminates main() also.
	Now that exception object is taken by "DefaltExceptionHandler" and printeed on the console.

The following Error message:
	Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exceptionhandling_04.WhatIsException.doSomethingExtra(WhatIsException.java:16)
	at exceptionhandling_04.WhatIsException.doSomething(WhatIsException.java:10)
	at exceptionhandling_04.WhatIsException.main(WhatIsException.java:5)


*/