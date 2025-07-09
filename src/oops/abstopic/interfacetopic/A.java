package oops.abstopic.interfacetopic;

public interface A 
{
	int NO = 10; // public static final 
	
	void test1();// public abstract
	public void test2(); // abstract

	// static method
	static void testStatic() 
	{
		System.out.println("Static Method ---testStatic() ");
	}	
	// default method
	default void testDefault() 
	{
		System.out.println("Defualt Method ---testDefault() ");
		testPrivate();
		testPrivate();
	}
	// private method
	private void testPrivate()
	{
		System.out.println("Private Method ---testPrivate() ");
	}
}
