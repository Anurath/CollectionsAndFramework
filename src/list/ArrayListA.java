package list;

import java.util.ArrayList;

public class ArrayListA {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		
		a1.add(10);
		a1.add(20);
		a1.add(4);
		a1.add(30);
		a1.add(40);
		a1.add(20);
		a1.add(10);
		
		ArrayList a2 = new ArrayList(a1);
		
		a2.add(40);
		a2.add(60);
		a2.add(100);
		a2.addLast(500);
		a2.addFirst(500);
		System.out.println(a2);
		System.out.println(a2.contains(500));
		System.out.println(a2.lastIndexOf(40));
		System.out.println(a2.indexOf(40));
	}
	
	public static boolean isPal(ArrayList a1)
	{
		for(int i=0,j=a1.size()-1;i<=a1.size()/2;i++,j--)
		{
			if(a1.get(i)!=a1.get(j))
			{
				return false;
			}
		}
		return true;
	}
	
	public static int max(ArrayList a1)
	{
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<a1.size();i++)
		{
			if((Integer)a1.get(i)>max)
			{
				max=(Integer)a1.get(i);
			}
		}
		return max;
	}
}
