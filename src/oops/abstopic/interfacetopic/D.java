package oops.abstopic.interfacetopic;

public class D extends C
{
	@Override
	public void test2() 
	{
	}
	@Override
	public void test3() 
	{
	}
	@Override
	public void test4() 
	{
	}
	@Override
	public void test5() 
	{
	}
	public static void main(String[] args) 
	{
		A.testStatic();
		
		A obj = new D();
		
		obj.testDefault();
		
	}
}
