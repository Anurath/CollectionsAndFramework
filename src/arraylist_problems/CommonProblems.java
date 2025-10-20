package arraylist_problems;

import java.util.ArrayList;

public class CommonProblems {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(39);
		list.add(34);
		list.add(34);
		list.add(65);
		
		

//		addStringName();
		
//		sum();
		
//		System.out.println(max(list));
		
//		System.out.println(min(list));
		
		reverse(list);
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
		
		System.out.println(nums.contains(40));
		
		System.out.println(sum);
	}
	
	
	public static int max(ArrayList<Integer> list)
	{
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<list.size();i++)
		{
			if(max<list.get(i))
			{
				max = list.get(i);
			}
		}
		return max;
	}
	
	public static int min(ArrayList<Integer> list)
	{
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<list.size();i++)
		{
			if(min>list.get(i))
			{
				min = list.get(i);
			}
		}
		return min;
	}
	
	public static void reverse(ArrayList<Integer> list)
	{
		System.out.println(list);
		for(int i=0;i<=list.size()-1-i;i++)
		{
			int temp = list.get(i);
			list.set(i, list.get(list.size()-1-i));
			list.set(list.size()-1-i,temp);
		}
		
		System.out.println(list);
	}
	
}
