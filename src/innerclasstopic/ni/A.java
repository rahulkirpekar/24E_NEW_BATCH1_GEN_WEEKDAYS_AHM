package innerclasstopic.ni;

public class A 
{
	private static int no = 2000;

	// Nested Innerclass class
	static class B
	{
		void disp() 
		{
			System.out.println("No : " + no);
		}
	}
	public static void main(String[] args) 
	{
		A.B obj = new A.B();
		
		obj.disp();
	}
}
