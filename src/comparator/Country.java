package comparator;

public class Country {

	String name;
	String cap;
	String hs;
	int phnoCode;
	
	public Country(String name,String cap,String hs,int phnoCode)
	{
		this.name = name;
		this.cap = cap;
		this.hs = hs;
		this.phnoCode = phnoCode;
	}
	
	@Override
	public String toString()
	{
		return "Country[Name: "+name+", Capital: "+cap+", HS: "+hs+", Phone Code:"+phnoCode+"] ";
	}
}
