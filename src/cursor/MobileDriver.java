package cursor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class MobileDriver {

	public static void main(String[] args) {
		
		ArrayList<Mobile> m1 = new ArrayList<Mobile>();
		
		m1.add(new Mobile("Redmi 13",11000,6,128,"Redmi"));
		m1.add(new Mobile("Redmi 8 Pro",12000,6,128,"Redmi"));
		m1.add(new Mobile("Vivo 13",11000,6,128,"Vivo"));
		m1.add(new Mobile("Apple 13 Pro",110000,6,128,"Apple"));
		m1.add(new Mobile("Nothing 10 Pro",15000,6,128,"Nothing"));
		
		
		ListIterator<Mobile> list = m1.listIterator();
		
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		
		Collections.sort(m1);
		
		System.out.println(m1);
	}
}
