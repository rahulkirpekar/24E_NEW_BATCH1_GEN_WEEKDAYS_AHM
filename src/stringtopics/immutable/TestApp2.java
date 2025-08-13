package stringtopics.immutable;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		//				  0  1   2    3    4     5   	6  7       8
		String value = "This is Java which is developed by james Gosling taught by madam";
		
		String words[] = value.split("\\s");
		
		System.out.println("words.length : " + words.length);
		
		for (String word : words) 
		{
//			System.out.println(word);
			
			String name = word;
			boolean flag = true;
			
//			System.out.println("name.length() : " + name.length());

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
				System.out.println(name+ " ");
			}
		}
	}
}
