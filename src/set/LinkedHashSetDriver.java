package set;

import java.util.LinkedHashSet;

public class LinkedHashSetDriver {

	public static void main(String[] args) {
		
		LinkedHashSet h1 = new LinkedHashSet();
		
		h1.add(10);
		h1.add(50);
		h1.add(30);
		h1.add(20);
		
		
		System.out.println(h1);
		
		h1.addFirst(100);
		
		System.out.println(h1);
		
		
		h1.addLast(500);
		
		System.out.println(h1);
		
		h1.removeFirst();
		
		System.out.println(h1);
		
		h1.removeLast();
		
		System.out.println(h1);
		
		h1.clear();

	}
}
