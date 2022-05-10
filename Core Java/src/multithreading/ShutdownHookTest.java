package multithreading;

class MyThreadR extends Thread{
	public void run() {
		System.out.println("Hello from Shutdown Hook test class");
	}
}

public class ShutdownHookTest {
	public static void main(String args[]) {
		MyThreadR m = new MyThreadR();
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(m);
		System.exit(0);
		m.start();
	}
}

/*
- ShutdownHooks are the initialized, unstarted threads.
- There are maintained and registered and when JVM begins it's shutdown sequence, it executes all the registered threads in an unspecified order.
- It acts as some one wants to put cleanup code before JVM shuts down.
- JVM shuts doen when System.exit(int) s called, when ctrl + c is typed in cmd and etc.
- The Runtime.addShutdownHook() is used to register the thread with  the JVM.
- It is a factory method of Runtime class.

 */
