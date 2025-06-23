package oops.classobject;

public class TestApp1 
{
	// 2. member Function--Optinal
	public static void main(String[] args) 
	{
		// s- reference  variable---pointer variable---address--object
		// Student - Object[rno name std]
//		Student s1 = new Student();
//		Student s2 = new Student();
//		Student s3 = new Student();
		
//		System.out.println("s1==>" + s1);
//		System.out.println("s2==>" + s2);
//		System.out.println("s3==>" + s3);
		
		Student s[] = new Student[5];
		
		for(int i = 0 ; i < s.length;i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}
		for(int i = 0 ; i < s.length;i++) 
		{
			s[i].dispData();
		}		
	}
}