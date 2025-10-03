package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CountryDriver {

	public static void main(String[] args) {
		ArrayList<Country> list = new ArrayList<Country>();
		
		Comparator<Country> comp = (o1, o2) -> o1.code>o2.code?1:(o1.code==o2.code)?0:-1;
		
		list.add(new Country("India","Delhi",91, "Dropati Murmu"));
		list.add(new Country("Isrial","Telaviv",79, "Benjamin Netnyahu"));
		list.add(new Country("Russia","Mosco",41, "Volmodir Putin"));
		list.add(new Country("USA","VDC",23, "Donald Trump"));
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.sort(list, comp);
		
		System.out.println(list);
	}
}
