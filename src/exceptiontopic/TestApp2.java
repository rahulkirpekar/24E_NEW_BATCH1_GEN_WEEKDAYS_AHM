package exceptiontopic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		try 
		{
			String name = null;
			System.out.println("name.length() : " + name.length());
			
		}finally 
		{
			System.out.println("Finally Block");
		}
		
		
//		try 
//		{
//			String name = null;
//			System.out.println("name.length() : " + name.length());
//			
//		} catch (ArithmeticException e) 
//		{
//			System.out.println("Catch Block Handled Exception");
//		}finally 
//		{
//			System.out.println("Finally Block");
//		}
		System.out.println("General Statement");
	}
}
