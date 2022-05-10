package multithreading;

class MyThreadD extends Thread {
	public void run() {
		System.out.println("Daemon thread executed...");
		System.out.println(currentThread().isDaemon());
	}
}

public class DemonThread {

	public static void main(String[] args) {
		MyThreadD m = new MyThreadD();
		m.setDaemon(true);
		m.start();
		System.out.println("rest of the code");
	}
}
