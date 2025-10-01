package collectoinsclass;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		
		ArrayList<Employee> emps = new ArrayList<Employee>();
		
		emps.add(new Employee("Ram",23,123,45000,"Pune"));
		emps.add(new Employee("Sham",25,124,50000,"Mumbai"));
		emps.add(new Employee("Karan",30,125,23000,"Delhi"));
		emps.add(new Employee("Anurath",23,126,30000,"Pune"));
		
		System.out.println(emps);
		
		Collections.sort(emps);
		
		System.out.println(emps);
		
		Collections.rotate(emps,2);
		
		System.out.println(emps);
		
		System.out.println(Collections.max(emps));  //Max on the basis of compareTo() implementatoin
		
		System.out.println(Collections.min(emps)); //Min on the basis of compareTo() implementatoin
		
		System.out.println(Collections.binarySearch(emps,new Employee("Sham",25,124,50000,"Mumbai")));  // index
		
		Collections.fill(emps, new Employee("Sham",25,124,50000,"Mumbai"));
		
		System.out.println(emps);
		
		Collections.shuffle(emps);
		
		System.out.println(emps);
		
		
		Collections.replaceAll(emps,new Employee("Sham",25,124,50000,"Mumbai"), new Employee("Karan",30,125,23000,"Delhi"));
		
		System.out.println(emps);
	}
}
