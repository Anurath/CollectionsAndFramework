package comparable;

public class Country implements Comparable<Country> {

	String name;
	String cap;
	int code;
	String hs;
	
	public Country(String name, String cap,int code,String hs)
	{
		this.name = name;
		this.cap = cap;
		this.code = code;
		this.hs = hs;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", cap=" + cap + ", code=" + code + ", hs=" + hs + "]";
	}
	
	public int compareTo(Country o)
	{
	   if(this.name.compareTo(o.name)>0)
	   {
		   return 1;
	   }
	   else if(this.name.compareTo(o.name)==0)
	   {
		   return 0;
	   }
	   return -1;
	}
}
