package comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentDriver {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		Comparator<Student> compByAge = (o1,o2)->o1.age>o2.age?1:(o1.age== o2.age?0:-1);
		Comparator<Student> compByName = (o1,o2)->o1.name.compareTo(o2.name)>0?1:(o1.name.compareTo(o2.name)==0?0:-1);
		
		list.add(new Student("Zameer", 30, 11,"DY"));
		list.add(new Student("Lakhan", 25, 16,"SP"));
		list.add(new Student("Karan", 22, 12,"PK"));
		list.add(new Student("Pavan", 22, 10,"BK"));
		list.add(new Student("Ram", 21, 1,"DY"));
		
		list.sort(compByAge);
		
		System.out.println(list);
		
		list.sort(compByName);
		
		System.out.println(list);
	}
}
