package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String>list = new ArrayList<String>();
 		
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
		System.out.println("--------------------------------------------");
		while(itr.hasPrevious()) 
		{
			String name= itr.previous();
			System.out.println(name);
		}
		
		
//		Iterator<String> itr =	list.iterator();
//		while(itr.hasNext()) 
//		{
//			String name= itr.next();
//			System.out.println(name);
//		}
		
//		list.remove(2);
//		list.set(2, "Ankur Patel");
		
		System.out.println("----------------------");
//		itr =	list.iterator();
		
//		while(itr.hasNext()) 
//		{
//			String name= itr.next();
//			System.out.println(name);
//		}
	}
}
