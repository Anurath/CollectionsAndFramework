package arraylist_problems;

import java.util.ArrayList;

public class AddElements {

	public static void main(String[] args) {

//		addStringName();
		
		sum();
	}

	public static void addStringName() {
		ArrayList<String> name = new ArrayList<String>();

		name.add("Ram");
		name.add("Umesh");
		name.add("Karan");
		name.add("Ramesh");
		name.add("Pratik");
		
		name.set(3, "Amit");
		System.out.println(name);

		System.out.println(name.get(2));

	}

	public static void sum() {
		ArrayList<Integer> nums = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			nums.add(i);
		}
		System.out.println(nums);

		int sum = 0;

		for (int i = 0; i < nums.size(); i++) {
			sum += nums.get(i);
		}
		nums.add(40);
		
		
		System.out.println(sum);
	}
	
	
}
