package multithreading;

public class Multithreading {
	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(Thread.currentThread());
		System.out.println(t.getThreadGroup());
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		t.setName("MyThread");
		t.setPriority(7);
		try {
			t.sleep(2000);	//sleep will exception prone, so we have to handle it explecitly
		}catch(Exception e) {
			e.printStackTrace();
		}
		t.setName("MyThread");
		t.setPriority(7);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
	}
}