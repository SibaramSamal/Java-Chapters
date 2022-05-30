package collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo2 {

	public static void main(String[] args) {
		Queue q = new PriorityQueue(15,new MyComparator());
		q.add(12);
		q.offer(26);
		q.add(56);
		System.out.println(q); // [56,26,12] customized sorting
		System.out.println(q.remove());	//56
		System.out.println(q.remove());	//26
		System.out.println(q);
	}
}
class MyComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2){
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}