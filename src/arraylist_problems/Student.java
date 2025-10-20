package arraylist_problems;

public class Student implements Comparable<Student> {

	int id;
	String name;
	int age;
	double score;
	
	public Student() {}
	
	public Student(int id, String name,int age,double score)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public String toString()
	{
		return "Student [Id: "+id+",Name: "+name+",Age: "+age+",Score: "+score+"]";
	}
	
	public int compareTo(Student o)
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
