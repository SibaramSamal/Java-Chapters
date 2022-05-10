package multithreading;

class Thread1 extends Thread{
	public Thread1(String string) {
		super(string);
	}
	public void run(){
		System.out.println("Task 1: Addition");
		System.out.println(Task.sum(23, 5));
	}
}
class Thread2 extends Thread{
	public Thread2(String string) {
		super(string);
	}
	public void run(){
		System.out.println("Task 2: Check even odd");
		System.out.println(Task.checkEven(561));
	}
}
class Thread3 extends Thread{
	public Thread3(String string) {
		super(string);
	}
	public void run(){
		System.out.println("Task 3: Prime check");
		System.out.println(Task.chkPrime(71));
	}
}
public class MultiThreadMultiTask {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
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
	static int sum(int a,int b) {
		return a + b;
	}
	
	static String checkEven(int x) {
		if((x % 2) == 0)
			return "Even";
		else
			return "Odd";
	}
	
	static String chkPrime(int x) {
		String result = null;
		if(x == 1) {
			//result =  "Prime";
			return "Prime";
		}
		for(int i=2 ; i<(x/2) ; i++) {
			if(x % i == 0)
				return "Not prime";
		}
		return "Prime";
	}
}


