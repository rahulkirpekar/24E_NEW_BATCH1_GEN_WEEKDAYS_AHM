package stringtopics.immutable;

public class TestApp3 
{
	public static void main(String[] args) 
	{
				//		0123456789012345678901234567890
//		String value = "This is Java which is developed by james Gosling taught by madam";
		
//		String s1 = value.substring(8, 12);
//		System.out.println("s1 : "+s1);
		
//		s1 = value.toLowerCase();
//		System.out.println("s1 : " + s1);
		
//		s1 = value.toUpperCase();
//		System.out.println("s1 : " + s1);
		
		// equals---check value--same--true/false
		

		String name1 = "rahul";
		String name2 = "rAhUl";
		
		if (name1.equalsIgnoreCase(name2)) 
		{
			System.out.println("Both strings are same ");
			
		} else 
		{
			System.out.println("Both strings are not same ");
		}
	}
}
