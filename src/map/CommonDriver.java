package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonDriver {

	public static void main(String[] args) {
		
		Map<Integer, String > students  = new HashMap<Integer, String>();
		
//		System.out.println(students.isEmpty());
		
		students.put(1,"Anurath");
		students.put(2,"Ram");
		students.put(3,"Shyam");
		students.put(4,"Namdev");
		students.put(5,"Ramdas");
		
//		System.out.println(students);
		
//		System.out.println(students.size());
		
//		System.out.println(students.isEmpty());
		
//		System.out.println(students.put(6, "Karan"));
//		System.out.println(students.put(1, "Pratik"));
		
		
		
		Map<Integer, String> teachers = new HashMap<Integer, String>();
		
		teachers.put(1, "Navale");
		teachers.put(2, "Parkhe");
		teachers.put(3, "Bhosale");
		
		Map<Integer, String> teachers1 = new HashMap<Integer, String>();
		teachers1.put(1, "Mule");
		teachers1.put(3, "Phiske");
		
		teachers1.putAll(teachers);
		
		System.out.println(teachers1);
		
		Set<Map.Entry<Integer,String>> entries = teachers1.entrySet();
		
		System.out.println(entries);
	}
}
