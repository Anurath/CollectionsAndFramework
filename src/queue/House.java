package queue;

public class House implements Comparable<House> {
	int bedroom;
	int age;
	double price;
	String owner;
	
	public House(int bedroom, int age, double price,String owner)
	{
		this.bedroom = bedroom;
		this.age = age;
		this.price = price;
		this.owner = owner;
	}
	
	public String toString()
	{
		return "House"+"[Owner Name: "+owner+", Bedrooms: "+bedroom+", Price:"+price+", Age: "+age+"]";
	}

	@Override
	public int compareTo(House o)
	{
		if(this.price>o.price)
		{
			return 1;
		}
		else if(this.price == o.price)
		{
			return 0;
		}
		return -1;
	}
}
