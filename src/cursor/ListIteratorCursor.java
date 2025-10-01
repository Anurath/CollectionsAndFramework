package cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorCursor {
	
	public static void main(String[] args) {
		
		
		ArrayList a1 = new ArrayList();
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		ListIterator l1 = a1.listIterator();
		
		
		
		//Forward Traversal 
		while(l1.hasNext())
		{
			int index = l1.nextIndex();
			System.out.println(index+" : "+l1.next());
		}
		
		
		//Backward Traversal
		while(l1.hasPrevious())
		{
			int index = l1.previousIndex();
			System.out.println(index+" : "+l1.previous());
		}
		
		
		//adding
		l1.add(50);
		
		//Modifying elements  and Removing elements
		l1 = a1.listIterator();
		while(l1.hasNext())
		{
			int num = l1.nextIndex();
			if(num==20)
			{
				l1.set((Object)100);
			}
			else if(num==40)
			{
				l1.remove();
			}
		}
		
		System.out.println(a1);
		
		
		
		
		
		
	}

}
