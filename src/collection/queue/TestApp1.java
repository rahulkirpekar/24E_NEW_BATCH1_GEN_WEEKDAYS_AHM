package collection.queue;

import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Natural Ordering---[A to Z , a to z , 0 to 9]
		PriorityQueue<String> queue = new PriorityQueue<String>();
	
		queue.add("rahul");//0
		queue.add("sagar");//1
		queue.add("ankur");//2
		queue.add("brijesh");//3
		queue.add("pradeep");//4

		while(!queue.isEmpty()) 
		{
			String name = queue.poll();
			System.out.println(name);
		}
	}
}
