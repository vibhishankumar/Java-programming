package learnigstart;

public class Student {
	int roll;
	String name,address;
	public Student(int rollno,String name,String address)
	{
		this.roll=rollno;
		this.name=name;
		this.address=address;
	}
	public String toString()
	{
		return this.roll + " " + this.name +" "+ this.address;
	}

}
