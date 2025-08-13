package stringtopics.immutable;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		System.out.println("Enter Stmt : ");
//		String name = new Scanner(System.in).nextLine();
		
		//			   01234
		String name = "ganesh";
		//			   i   j
		
		boolean flag = true;
		
		System.out.println("name.length() : " + name.length());

		for (int i = 0,j=(name.length()-1); i < name.length(); i++,j--) 
		{
			if (name.charAt(i)!=name.charAt(j)) 
			{
				flag= false;
				break;
			}
		}
		if (flag) 
		{
			System.out.println(name+" is Palindrome  string.");
		} else 
		{
			System.out.println(name+" is not Palindrome  string.");
		}
	}
}
