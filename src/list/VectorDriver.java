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
		
		System.out.println(v1.capacity()); //Capacity gets increased by 2x
		
		System.out.println("----------------------------------------------------------------------------------");
		
		Vector v2 = new Vector(5,2);
		
		v2.add(10);
		v2.add(10);
		v2.add(10);
		v2.add(10);
		v2.add(10);
		System.out.println(v2.capacity());
		v2.add(10);
		System.out.println(v2.capacity()); // capacity + 2 = 7 
		
		v1.addElement(90);
		
		v2.setElementAt(v2, 0);
		
		System.out.println("--------------------------------------------------------------------------------------------");
		
		
		Vector v3 = new Vector();
		
		v3.addElement(11);
		v3.addElement(22);
		v3.addElement(33);
		v3.add(44);
		
		v3.remove((Integer)44);
		v3.removeElement(11);
		
		System.out.println(v3);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
