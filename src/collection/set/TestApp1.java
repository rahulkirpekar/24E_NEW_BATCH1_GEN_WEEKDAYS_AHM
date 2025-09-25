package collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		HashSet<String> setObj  = new HashSet<String>();
//		LinkedHashSet<String> setObj  = new LinkedHashSet<String>();

		TreeSet<String> setObj = new TreeSet<String>();
		
		setObj.add("sagar");//1
		setObj.add("ankur");//2
		setObj.add("brijesh");//3
		setObj.add("pradeep");//4
		setObj.add("rahul");//0
		setObj.add("sagar");//1
		setObj.add("ankur");//2
		setObj.add("brijesh");//3
		setObj.add("pradeep");//4

		Iterator<String> itr =	setObj.iterator();
			
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			
			System.out.println(name);
		}
	}
}
