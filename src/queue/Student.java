package queue;

public class Student implements Comparable<Student> {

	String name;
	int age;
	String college;
	int stid;
	public Student(String name, int age, String college, int stid) {
		super();
		this.name = name;
		this.age = age;
		this.college = college;
		this.stid = stid;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", college=" + college + ", stid=" + stid + "]";
	}
	@Override
	public int compareTo(Student o) {
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
