package exceptiontopic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int  ans = 0 ;

		
		// exception Handle --try...catch block
		try 
		{
			try 
			{
				ans = no1/no2;
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			

			try 
			{
				String name = "";
				System.out.println(name.length());
			} catch (Exception e) 
			{
				e.printStackTrace();
			}

			try {
				int a[] = new int[5];
				a[5] = 10;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				String name = "royal";
				System.out.println(name.charAt(6));// StringIndexOutofBoundException
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
//		catch (ArithmeticException e) 
//		{
//			e.printStackTrace();
//		}catch (NullPointerException e) 
//		{
//			e.printStackTrace();
//		}catch (ArrayIndexOutOfBoundsException e) 
//		{
//			e.printStackTrace();
//		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Addition : " + ans);
	}
}
