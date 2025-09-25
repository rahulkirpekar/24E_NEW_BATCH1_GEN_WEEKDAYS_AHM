package collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		HashMap[Not Maintain Insertion Order]---[Key]
//		LinkedHashMap[Maintain Insertion Order]---[Key]
//		TreeMap[Ascending Order Sorting ]---[Key]
	
		// Not Maintain Insertion order
//		HashMap<Integer,String>mapObj = new HashMap<Integer,String>(); 
		
		// Insertion Order
//		LinkedHashMap<Integer,String>mapObj = new LinkedHashMap<Integer,String>(); 
		
		
		// Sorting
		TreeMap<Integer,String>mapObj = new TreeMap<Integer,String>(); 
		
		mapObj.put(11, "Ankur");// Entry[Key,Value]
		mapObj.put(2, "Sagar");// Entry[Key,Value]
		mapObj.put(35, "Rakesh");// Entry[Key,Value]
		mapObj.put(49, "Brijesh");// Entry[Key,Value]
		mapObj.put(55, "Kunal");// Entry[Key,Value]

		for(Map.Entry<Integer, String> e : mapObj.entrySet()) 
		{
			System.out.println(e.getKey()+" " + e.getValue());
		}
	}
}
