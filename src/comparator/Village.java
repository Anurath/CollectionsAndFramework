package comparator;

public class Village {
	int pop;
	String name;
	String sarpanch;
	int candidate;

	public Village(String name,int pop,String sarpanch,int can)
	{
		this.name = name;
		this.pop = pop;
		this.sarpanch = sarpanch;
		this.candidate = can;
	}

	@Override
	public String toString() {
		return "Village [pop=" + pop + ", name=" + name + ", sarpanch=" + sarpanch + ", candidate=" + candidate + "]";
	}
	
	
}
