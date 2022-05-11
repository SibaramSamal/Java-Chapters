package multithreading;

import java.util.Timer;
import java.util.TimerTask;

class MyThreadS extends TimerTask{
	public void run() {
		System.out.println("Hello");
	}
}

public class ThreadScheduling {
	public static void main(String[] args) {
		Timer t = new Timer();
		t.scheduleAtFixedRate(new MyThreadS(), 5000, 5000);/*this method expets one Timer task typeobject
		and two integer type value. 1st one is suspend and 2nd one is delay.
		 After starting of the program, it will remain suspended for 5 secs and then after every 5 secs,
			it will execute the thread. */
	}
}
