package oops.inhtopic.si;

public class Student extends Person
{
	int rno,std;
	public Student() 
	{
	}
	public Student(int rno,String name,  int std) 
	{
		super(name);
		this.rno = rno;
		this.std = std;
	}
}
