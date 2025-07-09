package oops.abstopic.aclass;

import java.util.Scanner;

public class TestApp1 
{
	public void getEventBasedPlace(Person person) 
	{
		person.getBehave();

		if (person instanceof School) 
		{
			School student= (School)person;
			student.getResult();
		} 
		else if (person instanceof Org) 
		{
			Org employee = (Org)person;
			employee.getSalary();
		} 
		else if (person instanceof Home) 
		{
			Home child = (Home)person;
			child.getMovieOnTime();
		}
	}
	public static void main(String[] args) 
	{
		TestApp1 app1 = new  TestApp1();
		Person person = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter below choice : ");
		System.out.println("1) For School");
		System.out.println("2) For Org");
		System.out.println("3) For Home");
		int choice = sc.nextInt();
		
		switch (choice) 
		{
			case 1: person =  new School(); 
					app1.getEventBasedPlace(person);
					break;
					
			case 2: person =  new Org(); 
					app1.getEventBasedPlace(person);
					break;
					
			case 3: person =  new Home(); 
					app1.getEventBasedPlace(person);
					break;
		}
	}
}