package queue;

import java.util.PriorityQueue;

public class QueueDriver {

	public static void main(String[] args) {
//		PriorityQueue p1 = new PriorityQueue();
//		
//		p1.add(70);
//		p1.add(50);
//		p1.add(100);
//		p1.add(30);
//		p1.add(90);
//		p1.add(60);
//		
//		System.out.println(p1);
		
		
		
		PriorityQueue<Student> p1 = new PriorityQueue<Student>();
		
		p1.add(new Student("Karan", 22, "PK", 12));
		p1.add(new Student("Anurath", 21, "BK", 13));
		p1.add(new Student("Aniket", 23, "DB", 15));
		p1.add(new Student("Anjali", 21, "ZP", 17));
		p1.add(new Student("Anuradha", 20, "DZ", 3));
		
		System.out.println(p1);
	}
}
