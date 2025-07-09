package oops.statictopic;

import java.util.Scanner;

public class Student 
{
	int rno,std;
	String name;
	static String schoolName; // 5000---DPS
	
	public static void setSchholName(String schoolName) 
	{
		Student.schoolName = schoolName;
	}

	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std +" " + schoolName);
	}
	public static void main(String[] args) 
	{
		Student.setSchholName("DPS");
		
		Student s1= new Student();// [rno name std]--------|
		Student s2= new Student();// [rno name std]-------schoolName
		Student s3= new Student();// [rno name std]]--------|
		
		s1.scanData();
		s2.scanData();
		s3.scanData();
		
		s2.setSchholName("ABC");
		
		s1.dispData();
		s2.dispData();
		s3.dispData();
	}
}