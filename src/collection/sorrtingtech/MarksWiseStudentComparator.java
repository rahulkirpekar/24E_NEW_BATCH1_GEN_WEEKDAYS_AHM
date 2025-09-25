package collection.sorrtingtech;

import java.util.Comparator;

// Marks wise student Comparator---Ascensding Orderwise
//Marks wise student Comparator---Descensding Orderwise
public class MarksWiseStudentComparator implements Comparator<Student>
{
	@Override
	public int compare(Student s1, Student s2) 
	{
		if (s1.getMarks()  > s2.getMarks()) 
		{
			return -1;
			
		} else if(s1.getMarks()  <  s2.getMarks())
		{
			return 1;
		}else 
		{
			return 0;
		}
	}
}
