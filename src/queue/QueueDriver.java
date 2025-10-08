package queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
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
		
		
//		
//		PriorityQueue<Student> p1 = new PriorityQueue<Student>();
//		
//		p1.add(new Student("Karan", 22, "PK", 12));
//		p1.add(new Student("Anurath", 21, "BK", 13));
//		p1.add(new Student("Aniket", 23, "DB", 15));
//		p1.add(new Student("Anjali", 21, "ZP", 17));
//		p1.add(new Student("Anuradha", 20, "DZ", 3));
//		
//		System.out.println(p1);
		
		
//		PriorityQueue p1 = new PriorityQueue(5);
//		
//		p1.add(10);
//		p1.add(20);
//		p1.add(20);
//		p1.add(5);
//		p1.add(1);
//		
//		System.out.println(p1);
//		
		
		
		
//		ArrayList hList = new ArrayList();
//		
//		hList.add(new House(4, 2, 1200000,"Degdkar"));
//		hList.add(new House(3, 4, 800000,"Nikam"));
//		hList.add(new House(5, 5, 1000000,"Rani"));
//		hList.add(new House(2, 0, 900000,"Kamal"));
//		
//		System.out.println(hList);
//		
//		PriorityQueue p1 = new PriorityQueue(hList);
//		
//		
//		System.out.println(p1);
//		
		
		
		ArrayDeque a = new ArrayDeque();
		
		a.add(10);
		a.add(5);
		a.add(200);
		
		
		a.addLast(500);
		
		System.out.println(a);
		
		a.removeFirst();
		System.out.println(a);
		
		a.addFirst(12);
		System.out.println(a);
		
		a.removeLast();
		System.out.println(a);
		
		System.out.println(a.pollFirst());
		
		System.out.println(a);
		
		System.out.println(a.pollLast());
		
		a.add(40);
		a.add(25);
		a.add(23);
		a.add(40);
		a.add(25);
		a.add(59);
		
		System.out.println(a);
		
		a.push(118);
		
		System.out.println(a);
		
		a.pop();
		
		System.out.println(a);
		
		System.out.println(a.getFirst());
		System.out.println(a.getLast());
		
		
		a.removeFirstOccurrence(40);
		
		System.out.println(a);
	
	}
}
