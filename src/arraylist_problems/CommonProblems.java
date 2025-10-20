package arraylist_problems;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonProblems {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(50);
		list.add(34);
		list.add(35);
		list.add(65);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(30);
		list1.add(39);
		list1.add(35);
		list1.add(34);
		list1.add(50);
		list1.add(65);

//		addStringName();
		
//		sum();
		
//		System.out.println(max(list));
		
//		System.out.println(min(list));
		
//		reverse(list);
		
//		sortByAsceding(list);
		
//		removeDuplicates(list);
		
//		findCommon(list, list1);
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(10);
		list3.add(50);
		
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(30);
		list4.add(40);
		list4.add(60);
		
//		merge(list3, list4);
		
//		arrayListToArray(list4);
		
		findInext(list4, 60);
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
	
	public static void sortByAsceding(ArrayList<Integer> list)
	{
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=0;j<list.size()-1-i;j++)
			{
				if(list.get(j)>list.get(j+1))
				{
					int temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}
		System.out.println(list);
	}
	
	public static void removeDuplicates(ArrayList<Integer>list)
	{
		for(int i=0;i<list.size()-1;i++)
		{
			if(list.get(i)==list.get(i+1))
			{
				list.remove(i+1);
			}
		}
		System.out.println(list);
	}
	
	public static void findCommon(ArrayList<Integer>list1, ArrayList<Integer>list2)
	{
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		for(int i=0;i<list1.size();i++)
		{
			for(int j=0;j<list2.size();j++)
			{
				if(list1.get(i)==list2.get(j))
				{
					ans.add(list1.get(i));
					list2.remove(j);
				}
			}
		}
		System.out.println(ans);
	}
	
	public static void merge(ArrayList<Integer>list1 , ArrayList<Integer> list2)
	{
		System.out.println(list1);
		System.out.println(list2);
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int j=0,i=0;
		while(i<list1.size()&&j<list2.size())
		{
			if(list1.get(i)<list2.get(j))
			{
				ans.add(list1.get(i));
				i++;
			}
			else if(list1.get(i)>=list2.get(j))
			{
				ans.add(list2.get(j));
				j++;
			}
		}
		
		while(i<list1.size())
		{
			ans.add(list1.get(i));
			i++;
		}
		
		while(j<list2.size())
		{
			ans.add(list2.get(j));
			j++;
		}
		
		System.out.println(ans);
	}
	
	public static void arrayListToArray(ArrayList<Integer>list)
	{
		int[] arr = new int[list.size()];
		
		for(int i=0;i<list.size();i++)
		{
			arr[i]=list.get(i);
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void findInext(ArrayList<Integer> list, int num)
	{
			System.out.println(list.indexOf(num));
	}
	
}
