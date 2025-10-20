package arraylist_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentDriver {

	public static void main(String[] args)
	{
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student(101, "Ram", 26, 87));
		students.add(new Student(102,"Karan",21,98));
		students.add(new Student(103,"Yash",24,87));
		students.add(new Student(104,"Anurath",23,87));
		
		System.out.println(students);
		
		Comparator<Student> compByage = (o1,o2)->o1.age>o2.age?1:(o1.age==o2.age)?0:-1;
		Comparator<Student> compByScore = (o1,o2)->o1.score<o2.score?1:(o1.score==o2.score)?0:-1;
		
		
		Collections.sort(students,compByage);
		
		System.out.println(students);
		
		Collections.sort(students,compByScore);
		
		System.out.println(students);
	}
}
