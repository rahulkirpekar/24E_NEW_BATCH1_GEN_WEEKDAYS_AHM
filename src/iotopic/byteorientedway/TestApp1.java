package iotopic.byteorientedway;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		
		// String -- write --- byte
		byte b[] =	name.getBytes();
		
		try 
		{
			FileOutputStream fout = new  FileOutputStream("royal1.txt");
		
			fout.write(b);
			
			fout.close();
			
			System.out.println("Success");
		
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
