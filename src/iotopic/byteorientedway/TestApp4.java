package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\24E_NEW_BATCH1_GEN_WEEKDAYS_AHM\\listrecords.txt");
		
			ObjectInputStream oin =  new ObjectInputStream(fin);

			Student s = (Student)oin.readObject();
		
			s.dispData();
			
			oin.close();
			fin.close();

		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}