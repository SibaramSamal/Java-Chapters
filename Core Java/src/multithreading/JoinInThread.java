package multithreading;

class T1 extends Thread{
	private T2 o2;
	private T3 o3;
	T1(String name,T2 o2,T3 o3){	// as join() needs object of thread class, we have received it in the constructor.
		super(name);
		this.o2 = o2;
		this.o3 = o3;
	}
	public void run() {
		try {
			// Here onwards T1 thread suspended and after T2 and T3 finished, it will resume.
			o2.join();	// T2 thread
			o3.join();	// T3 thread
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0 ; i<5 ; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" Finished Execution");
	}
}

class T2 extends Thread{
	T2(String name){
		super(name);
	}
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" Finished Execution");
	}
}

class T3 extends Thread{
	T3(String name){
		super(name);
	}
	public void run() {
		for(int i=0 ; i<15 ; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" Finished Execution");
	}
}
public class JoinInThread {
	public static void main(String[] args) {
		T2 o2 = new T2("Second");
		T3 o3 = new T3("Third");
		T1 o1 = new T1("First",o2,o3);//this constructor is used to test join() in different threads
		
		o1.start();
		o2.start();
		o3.start();
		
		//when a thread join()s to others, that thread become suspended until the execution of all the threads completed.
		try {
			o1.join();
			o2.join();
			o3.join();
			// Here main thread joined all these threads. So after execution of these threads only main thread will resume. Otherwise it will remain in in suspend mode.
			
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		for(int i=0 ; i<5 ; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" Finished Execution");
	}
}



