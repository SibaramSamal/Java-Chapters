package collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue q = new PriorityQueue();
		System.out.println(q.peek());
		q.offer(1);
		q.offer(20);
		q.offer(30);
		q.offer(56);
		System.out.println("Before any operations: "+q);
		System.out.println("Head element is: "+q.peek());	//display head element
		System.out.println("After performing peek() : "+q);
		System.out.println("After performing poll() : "+q.poll());	// remove head element
		System.out.println("Final queue after all the operations: "+q);
	}
}
