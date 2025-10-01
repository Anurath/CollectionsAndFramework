package collectoinsclass;

public class Employee implements Comparable<Employee> {
	
	String name;
	int age;
	int empid;
	double sal;
	String address;
	public Employee(String name, int age, int empid, double sal, String address) {
		super();
		this.name = name;
		this.age = age;
		this.empid = empid;
		this.sal = sal;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", empid=" + empid + ", sal=" + sal + ", address=" + address
				+ "]";	
	}

	@Override
	public int compareTo(Employee o) {
		
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
