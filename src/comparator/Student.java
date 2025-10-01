package comparator;

public class Student {

	String name;
	int age;
	int stid;
	String clg;
	public Student(String name, int age, int stid, String clg) {
		super();
		this.name = name;
		this.age = age;
		this.stid = stid;
		this.clg = clg;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", stid=" + stid + ", clg=" + clg + "]";
	}
}
