package multithreading;

public class ThreadUsingAnnonimusClass {
	public static void main(String[] args) {

		// Here are some approaches to create thread and execute them
		// approach 1:
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Hello from Approach 1");
			}
		};
		new Thread(r).start();

		// approach 2:
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello from approach 2");
			}
		}).start();
		
		//approach 3:
		Thread t = new Thread(new Runnable() {public void run() { System.out.println("Hello from approach 3");}});
		t.start();
	}
}
