package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class VillageDriver {

	public static void main(String[] args) {
		
		
		ArrayList<Village> v1 = new ArrayList<Village>();
		
		v1.add(new Village("Girlgaon",500,"Rupali",7));
		v1.add(new Village("Dudhodi",1500,"Sunita Mahanvar",9));
		v1.add(new Village("Pathrud",5500,"Bhau Tikte",5));
		
		Comparator<Village> com = (o1,o2)->o1.name.compareTo(o2.name)>0?1:(o1.name.compareTo(o2.name)==0?0:-1);
		Comparator<Village> com1 = (o1,o2)->o1.pop>o2.pop?1:(o1.pop==o2.pop?0:-1);
 		
		Collections.sort(v1,com);
		
		System.out.println(v1);
		
		Collections.sort(v1,com1);

		System.out.println(v1);
		
		
		
		
		
		
		TreeSet<Village> t1 = new TreeSet<Village>(com);
		
		t1.add(new Village("Pathrud",5500,"Bhau Tikte",5));
		t1.add(new Village("Dudhodi",1500,"Bhau Tikte",5));
		t1.add(new Village("Girlgaon",500,"Bhau Tikte",5));
		
		System.out.println(t1);
		
		
		
		
		
		Village[] arr = new Village[3];
		
		arr[0] = new Village("Rampur", 3000,"Ramlal", 21);
		arr[1] = new Village("Waki",2000,"Pavan Dhobe",15);
		arr[2] = new Village("Mohari",1200,"Ram Shinde",11);
		
		Arrays.sort(arr,com);
		
		System.out.println(Arrays.toString(arr));
		
		PriorityQueue<Village> p1 = new PriorityQueue<Village>(com);
		
		p1.add(new Village("Pathardi",50500,"Revika Dethe",31));
		p1.add(new Village("Anterwali",800,"Dagdu Patil",7));
		p1.add(new Village("Beleshwar",1400,"Kamal Patil",9));
		
		System.out.println(p1);
	
		
	}
}
