package oops.constructor;

public class Student 
{
	private int rno,std,marks;
	private String name;
	
	// 1. Default Constructor
	public Student() 
	{
		System.out.println("START :  Default Constructor ");
		System.out.println("Before Initialise : " + rno+" " + name+" " + std+" " + marks);

		rno=1;
		name="rahul";
		std=12;
		marks=100;
		
		System.out.println("After Initialise : " + rno+" " + name+" " + std+" " + marks);
		System.out.println("EXITT :  Default Constructor ");
	}
	// 2. Parameterised Constructor
	public Student(int rno,String name,int std,int marks) 
	{
		System.out.println("START :  Para Constructor ");
		System.out.println("Before Initialise : " + rno+" " + name+" " + std+" " + marks);

		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
		
		System.out.println("After Initialise : " + rno+" " + name+" " + std+" " + marks);
		System.out.println("EXITT :  Para Constructor ");
	}
	// 3. Copy Constructor
	public Student(Student s) 
	{
		System.out.println("START :  Copy Constructor ");
		System.out.println("Before Initialise : " + rno+" " + name+" " + std+" " + marks);

		this.rno = s.rno;
		this.name = s.name;
		this.std = s.std;
		this.marks = s.marks;
		
		System.out.println("After Initialise : " + rno+" " + name+" " + std+" " + marks);
		System.out.println("EXITT :  Copy Constructor ");
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks);
	}
	public static void main(String[] args) 
	{
		Student  s1= new Student(2,"Kunal",12,100);
		s1.dispData();
		
		Student  s2= new Student(s1);
		s2.dispData();
	}
}
