package comparator;

import java.util.ArrayList;
import java.util.LinkedList;

public class CountryDriver {
	public static void main(String[] args) {
		
		ArrayList c1 = new ArrayList();
		
		c1.add(new Country("India","New Delhi","Dropdi Murmu",91));
		c1.add(new Country("New Zeland","Wellington","Rt Hon Christopher Luxon",64));
		c1.add(new Country("United States", "Washington, D.C.", "Joe Biden", 1));
		c1.add(new Country("Japan", "Tokyo", "Fumio Kishida", 81));
		c1.add(new Country("France", "Paris", "Emmanuel Macron", 33));
		
		System.out.println(c1);
		
		LinkedList l1 = new LinkedList(c1);
		
		System.out.println(l1);
		
		
	}

}
