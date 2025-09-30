package list;

import java.util.LinkedList;

public class LinkedListDirver {

	public static void main(String[] args) {
		
		LinkedList l1  = new LinkedList();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		System.out.println(l1);
		
		l1.addLast(500);
		System.out.println(l1);
		
		l1.addFirst(1000);
		System.out.println(l1);
		
		l1.removeFirst();
		System.out.println(l1);
		 
		l1.removeLast();
		System.out.println(l1);
		
//		l1.remove(20);                IndexOutOfBoundsException
//		System.out.println(l1);
		
		
		l1.remove((Integer)10);
		System.out.println(l1);
		
		l1.remove(1);
		System.out.println(l1);
	}
}
