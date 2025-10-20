package arraylist_problems;

import java.util.ArrayList;

public class StudentDriver {

	public static void main(String[] args)
	{
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student(101, "Ram", 20, 87));
		students.add(new Student(102,"Karan",21,98));
		students.add(new Student(103,"Yash",22,87));
		students.add(new Student(104,"Anurath",23,87));
		
		System.out.println(students);
	}
}
