package oops.inhtopic.si;

public class SciStudent extends Student
{
	String subject;
	
	public SciStudent(int rno, String name, int std, String subject) 
	{
		super(rno, name, std);
		this.subject = subject;
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + subject);
	}
}
