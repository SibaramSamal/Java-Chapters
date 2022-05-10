package multithreading;

class MyThread extends Thread{
	MyThread(String str){
		super(str);	//calling Thread(String) 
	}
	public void run() {
		System.out.println("Thread is running...");
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread stoped.");
	}
}
public class MultiThreadSingleTask {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread obj1 = new MyThread("My First thread");	//Another approach to setthread name
		//obj1.setName("My First thread");	//Thread name can be set in this method call
		//obj1.start();
		obj1.run();
		MyThread obj2 = new MyThread("My second thread");
		//obj2.setName("My second thread");
		//obj2.start();
		obj2.run();
	}
}
