package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();

		list.add(true);// 0---boolean <==itr
		list.add('r');// 1---char
		list.add(12);// 2---int
		list.add(654L);// 3---long
		list.add("royal");// 4---String
		
		Student s1 = new Student(1, "Rahul", 12);
		
		list.add(s1);
		
		System.out.println("list.size() : " + list.size());

		//1. way to iterate loop
/*		for (int i = 0; i < list.size(); i++) 
		{
			Object obj  = list.get(i);
			
			if (obj instanceof Student) 
			{
				Student s = (Student)obj;
				System.out.println(s.getRno()+" " + s.getName()+" " +s.getStd());
			}else 
			{
				System.out.println(obj);
			}
		}
		//2--for each loop
		for (Object obj : list) 
		{
			if (obj instanceof Student) 
			{
				Student s = (Student)obj;
				System.out.println(s.getRno()+" " + s.getName()+" " +s.getStd());
			}else 
			{
				System.out.println(obj);
			}
		} 
 */		
		Iterator itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			Object obj = itr.next();
			
			if (obj instanceof Student) 
			{
				Student s = (Student)obj;
				System.out.println(s.getRno()+" " + s.getName()+" " +s.getStd());
			}else 
			{
				System.out.println(obj);
			}
		}
	}
}







