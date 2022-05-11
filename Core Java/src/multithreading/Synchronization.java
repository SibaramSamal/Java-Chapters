package multithreading;

class Th1 extends Thread{
	private CommonResource c;
	Th1(CommonResource c, String threadName){
		super(threadName);
		this.c = c;
	}
	public void run() {
		System.out.println(currentThread().getName());
		c.displayTable(2);
	}
}
class Th2 extends Thread{
	private CommonResource c;
	Th2(CommonResource c, String threadName){
		super(threadName);
		this.c = c;
	}
	public void run() {
		System.out.println(currentThread().getName());
		c.displayTable(5);
	}
}
class Th3 extends Thread{
	private CommonResource c;
	Th3(CommonResource c, String threadName){
		super(threadName);
		this.c = c;
	}
	public void run() {
		System.out.println(currentThread().getName());
		c.displayTable(6);
	}
}
public class Synchronization {
	public static void main(String[] args) {
		CommonResource c = new CommonResource();
//		CommonResource c2 = new CommonResource();
//		CommonResource c3 = new CommonResource();
		
		Th1 o1 = new Th1(c,"First Thread");
		Th2 o2 = new Th2(c,"Second Thread");
		Th3 o3 = new Th3(c,"Third Thread");
		// here all the threads having common lock
		
		
		//here all the threads having different locks
//		Th2 o2 = new Th2(c2,"Second Thread");
//		Th3 o3 = new Th3(c3,"Third Thread");
		
		
		o1.start();
		o2.start();
		o3.start();
	}
}

class CommonResource{
	// synchronized public void displayTable(int x) {	-->this is synchronization()
	//public static void displayTable(int x) {	--> this is static synchronization
		synchronized public void displayTable(int x) {
		for(int i=1 ; i<=10 ; i++) {
			System.out.println(x * i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			/*synchronized(CommonResource.class){	//synchronized block which can have object reference or class reference
				System.out.println("hi");
				System.out.println("hi");
			}*/
		}
	}
}
/*	
	If all the threads are using a common resourse and executed concurrently, threads are accessing the resource
	randomely and executed randomly.
	To solve this issue, we can make that common resource's method synchronized ao that when one thread is 
	executing, it will complete it's task thenonly rest of the threads will get chance.
*/

