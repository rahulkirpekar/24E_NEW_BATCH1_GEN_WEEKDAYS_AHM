package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementApplication 
{
	public static void main(String[] args) 
	{
		int rno=0;
		boolean	flag = false;
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		int choice = 0 , i =0;
		Student s = null;

		do 
		{
			System.out.println("Enter below Choice : ");
			System.out.println("1. Insert Student record");
			System.out.println("2. Update Student record");
			System.out.println("3. Delete Student record");
			System.out.println("4. Display All Records Student record");
			System.out.println("5. Search Student By Rno");
			System.out.println("6. Exit Student Application");
			choice   = sc.nextInt();
			
			switch(choice) 
			{
				case 1: s = new Student();
						s.scanData();
						list.add(s);
						System.out.println("Student record succssfully Inserted.");
						break;
				
				case 2: System.out.println("Enter Rno which you want to Update : ");
						rno = sc.nextInt();
						flag= false;
						for (i=0; i < list.size(); i++) 
						{
							s = list.get(i); 
							if(rno == s.getRno()) 
							{
								flag = true;
								break;
							}
						}
						if(flag) 
						{
							s = list.get(i);
							s.updateData();
							
							list.set(i, s);
							
							System.out.println(rno+" record updated.");
						}else 
						{
							System.out.println(rno+" record not found");
						}
						break;
				
				case 3:
						System.out.println("Enter Rno which you want to Delete : ");
						rno = sc.nextInt();
						flag = true;
						
						for (i = 0; i < list.size(); i++) 
						{
							s = list.get(i); 
							if(rno == s.getRno()) 
							{
								flag= false;
								list.remove(i);
								System.out.println(rno+" removed from records.");
							}
						}
						if(flag) 
						{
							System.out.println(rno+" not found in records");
						}
						break;
				
				case 4: for (i = 0; i < list.size(); i++) 
						{
							s = list.get(i);
							s.dispData();
						}
						break;
				
				case 5: System.out.println("Enter Rno which you want to search : ");
						rno = sc.nextInt();
						flag = true;
						
						for (i = 0; i < list.size(); i++) 
						{
							s = list.get(i); 
							if(rno == s.getRno()) 
							{
								flag= false;
								s.dispData();
							}
						}
						if(flag) 
						{
							System.out.println(rno+" not found in records");
						}
						break;
				case 6: System.out.println("Student Application will be exit."); 
						try 
						{
							Thread.sleep(500);
						} catch (InterruptedException e) 
						{
							e.printStackTrace();
						}
						System.exit(0);	
						break;
			}
		}while(choice != 6);
	}
}
