package arraytopic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
// Array Declaration:-

		int a1[] = new int[5];
		
		for (int i = 0; i < a1.length; i++) 
		{
			System.out.println("Enter A["+i+"] : ");
			a1[i] = sc.nextInt();
		}

		for (int i = 0; i < a1.length; i++) 
		{
			System.out.println("A["+i+"] : " + a1[i]);
		}

		
		
//		int []a2 = new int[5];
		
//		int[] a3 = new int[5];
		
//		int [] a4 = new int[5];
		
//		int a5[] = null;
//		a5 = new int[5];
		
// Array Declaration with Initialisation:-
		
//		int a6[] = new int[] {1,2,3,4,5,6};
		
//		int  a7[] = {10,20,30,40,50};
		
	}
}
