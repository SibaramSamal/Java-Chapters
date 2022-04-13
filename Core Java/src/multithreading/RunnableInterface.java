package multithreading;

class MyThreadx implements Runnable{
	@Override
	public void run() {
		System.out.println("Hello");
		System.out.println(Thread.currentThread().getName());
	}
}

public class RunnableInterface {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThreadx obj = new MyThreadx();
		Thread t = new Thread(obj);	//Association
		t.setName("Samal");
		t.start();
	}
}
