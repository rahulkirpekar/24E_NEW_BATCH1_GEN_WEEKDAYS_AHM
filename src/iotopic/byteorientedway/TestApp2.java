package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\24E_NEW_BATCH1_GEN_WEEKDAYS_AHM\\royal1.txt");

			int temp;
			
			while( (temp = fin.read())  != -1) 
			{
				char value  = (char)temp;
				
				sb.append(value);
			}
			fin.close();
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.print("Final Value : " + sb);
	}
}
