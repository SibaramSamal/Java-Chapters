package multithreading;

class Thread1 extends Thread{
	public Thread1(String string) {
		super(string);
	}
	public void run(){
		System.out.println("Task 1: Addition");
	}
}
class Thread2 extends Thread{
	public Thread2(String string) {
		super(string);
	}
	public void run(){
		System.out.println("Task 2: Check even odd");
	}
}
class Thread3 extends Thread{
	public Thread3(String string) {
		super(string);
	}
	public void run(){
		System.out.println("Task 3: Prime check");
	}
}
public class MultiThreadMultiTask {
	public static void main(String[] args) throws InterruptedException {
		Thread1 t1 = new Thread1("One");
		Thread2 t2 = new Thread2("Two");
		Thread3 t3 = new Thread3("Three");
		t1.start();
		Thread.sleep(2000);
		t2.start();
		Thread.sleep(2000);
		t3.start();
	}
}
class Task{
	
}


