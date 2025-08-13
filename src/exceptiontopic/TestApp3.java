package exceptiontopic;

import java.io.IOException;
import java.util.Scanner;

public class TestApp3 
{
	public static void isValidForVote(int age)  throws NullPointerException
	{
		if (age < 18) 
		{
			// raise exception---user--[wrong input]
			// check exception
			throw new NullPointerException("Invalid Age,\n\tPlease enter Valid Age.");
			
		} else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		
		try 
		{
			isValidForVote(age);
		} catch (NullPointerException e) 
		{
			System.out.println("Catch Block Handled Exception");
			e.printStackTrace();
		}
		System.out.println("General Statement");
	}
}
