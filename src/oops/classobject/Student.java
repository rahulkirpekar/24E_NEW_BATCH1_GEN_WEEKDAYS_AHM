package oops.classobject;

import java.util.Scanner;

// Pure Encapsulation--[Data Security]
//------------------------------------
// 1. Dm's--Private
// 2. Mf's--public
public class Student 
{
	// 1. Data Members
	private int rno,std,marks;
	private String name;
	
	// 2. Member Function
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
		System.out.println("Enter Marks : ");
		marks = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks);
	}
}
