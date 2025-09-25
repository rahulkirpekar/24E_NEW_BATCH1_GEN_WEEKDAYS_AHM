package collection.list;

import java.util.ListIterator;
import java.util.Vector;

public class TestApp3 
{
	public static void main(String[] args) 
	{
//		LinkedList<String> list = new LinkedList<String>();
		
		Vector<String> list  = new Vector();
		
		list.add("rahul");//0
		list.add("sagar");//1
		list.add("ankur");//2
		list.add("brijesh");//3
		list.add("pradeep");//4

		ListIterator<String> itr =list.listIterator();
		
		while(itr.hasNext()) 
		{
			String name= itr.next();
			System.out.println(name);
		}
	}
}
