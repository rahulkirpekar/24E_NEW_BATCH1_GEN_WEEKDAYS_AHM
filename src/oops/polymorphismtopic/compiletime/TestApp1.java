package oops.polymorphismtopic.compiletime;

//Compiletime Polymorphism====>[Method Overloadding]
public class TestApp1 
{
	public void addFun(byte no1,byte no2) 
	{
		System.out.println("Two args(byte) : "+(no1+no2));
	}
	public void addFun(short no1,short no2) 
	{
		System.out.println("Two args(short) : "+(no1+no2));
	}
//	public void addFun(int no1,long no2) 
//	{
//		System.out.println("addFun(int no1,long no2)---Two args : "+(no1+no2));
//	}
//	public void addFun(long no1,int no2) 
//	{
//		System.out.println("addFun(long no1,int no2)---Two args : "+(no1+no2));
//	}

	public void addFun(int no1,int no2,int no3) 
	{
		System.out.println("Three args : "+(no1+no2));
	}
	public void addFun(int no1,int no2,int no3,int no4) 
	{
		System.out.println("Four args : "+(no1+no2));
	}
	
	public static void main(String[] args) 
	{
		TestApp1 app1 = new TestApp1();
		
//		app1.addFun(20, 10);
		app1.addFun(10, 20);
		
	}
}
/*
	1. argument count
	2. argument type
	3. type pramotion rule
	
	
		boolean--X
		
					byte
					  |
					short
					  |	
char---------------->int
					  |	
					long  
					  |	
					float  
					  |	
					double
*/