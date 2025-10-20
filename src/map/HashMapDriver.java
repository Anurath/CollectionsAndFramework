package map;

import java.util.HashMap;

public class HashMapDriver {

	public static void main(String[] args) {
		HashMap<Integer, String> std = new HashMap<>();
		
		std.put(1, "Anurath");
		std.put(2, "Ram");
		std.put(3, "Pratik");
		std.put(17,"Umesh" );
		System.out.println(std);
	}
}
