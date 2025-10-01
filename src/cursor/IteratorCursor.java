package cursor;

import java.util.Iterator;
import java.util.PriorityQueue;

public class IteratorCursor {
	
	public static void main(String[] args) {
		
		PriorityQueue p1 = new PriorityQueue();
		
		p1.add(20);
		p1.add(30);
		p1.add(40);
		p1.add(50);
		
		Iterator it = p1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
