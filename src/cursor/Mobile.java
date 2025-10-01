package cursor;

public class Mobile implements Comparable<Mobile> {

	String name;
	double price;
	int ram;
	int rom;
	String brand;
	public Mobile(String name, double price, int ram, int rom, String brand) {
		super();
		this.name = name;
		this.price = price;
		this.ram = ram;
		this.rom = rom;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", price=" + price + ", ram=" + ram + ", rom=" + rom + ", brand=" + brand + "]";
	}
	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		if(this.name.compareTo(o.name)>1)
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
