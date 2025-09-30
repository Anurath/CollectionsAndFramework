package list;

import java.util.Vector;

public class VectorDriver {

	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		System.out.println(v1.capacity());
		v1.add(10);
		v1.add(10);
		v1.add(10);
		v1.add(10);
		v1.add(10);
		v1.add(10);
		v1.add(10);
		v1.add(10);
		v1.add(10);
		v1.add(10);
		System.out.println(v1);
		v1.add(10);
		
		//Capacity gets increased by 2x
		System.out.println(v1.capacity());
		
		System.out.println("----------------------------------------------------------------------------------");
		
		Vector v2 = new Vector(5,2);
		
		v2.add(10);
		v2.add(10);
		v2.add(10);
		v2.add(10);
		v2.add(10);
		System.out.println(v2.capacity());
		v2.add(10);
		System.out.println(v2.capacity());
	}
}
