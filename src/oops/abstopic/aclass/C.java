package oops.abstopic.aclass;

public class C extends B
{
	public C()
	{
		System.out.println("C--Default Constructor");
	}
	@Override
	public void test3() 
	{
	}
	public static void main(String[] args) 
	{
		C obj = new C(); 
	}
}
