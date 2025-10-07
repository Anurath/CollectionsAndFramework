package queue;

import java.util.PriorityQueue;

public class QueueDriver {

	public static void main(String[] args) {
		PriorityQueue p1 = new PriorityQueue();
		
		p1.add(70);
		p1.add(50);
		p1.add(100);
		p1.add(30);
		p1.add(90);
		p1.add(60);
		
		System.out.println(p1);
		
		
	}
}
