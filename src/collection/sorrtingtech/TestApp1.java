package collection.sorrtingtech;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1= new Student(1, "Rahul", 10, 100);
		Student s2= new Student(2, "Ankur", 11, 70);
		Student s3= new Student(3, "sagar", 8, 80);
		Student s4= new Student(4, "Brijesh", 12, 34);
		Student s5= new Student(5, "Ravi", 11, 90);

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		for (int i = 0; i < list.size(); i++) 
		{
			Student s= list.get(i);
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		
		Collections.sort(list, new MarksWiseStudentComparator());
		
		System.out.println("After Marks Sorting : ");
		for (int i = 0; i < list.size(); i++) 
		{
			Student s= list.get(i);
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		
		Collections.sort(list, new StdWiseStudentComparator());
		
		System.out.println("After Std Sorting : ");
		for (int i = 0; i < list.size(); i++) 
		{
			Student s= list.get(i);
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		
		Collections.sort(list, new NameWiseStudentComparator());
		
		System.out.println("After Name Sorting : ");
		for (int i = 0; i < list.size(); i++) 
		{
			Student s= list.get(i);
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
	}
}