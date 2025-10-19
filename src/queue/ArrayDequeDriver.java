package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class ArrayDequeDriver {

	public static void main(String[] args) {
		
		ArrayDeque a1 = new ArrayDeque();
		
		a1.add(10);
		a1.addLast(20);
		a1.addFirst(30);;
		a1.push(50);
		a1.push(60);
//		System.out.println(a1);
//		
//		System.out.println(a1.pop());
//		
//		System.out.println(a1);
//		
//		System.out.println(a1.peek());
//		
//		System.out.println(a1);
		
		ArrayDeque a2 = new ArrayDeque(20);
		
//		a2.add(20);
//		a2.addFirst(50);
//		a2.addLast(100);
//		System.out.println(a2);
//		a2.remove();
//		System.out.println(a2);
//		a2.removeFirst();
//		System.out.println(a2);
//		a2.removeLast();
//		System.out.println(a2);
//		a2.remove();
		
		LinkedList l1 = new LinkedList();
		
		l1.add(null);
		l1.add(20);
		l1.add(50);
		l1.add(null);
		l1.add(100);
		l1.add(200);
		
		
		ArrayDeque a3 = new ArrayDeque(l1);
		
		System.out.println(a3);
		
		
	}
}
