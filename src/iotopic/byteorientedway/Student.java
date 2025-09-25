package iotopic.byteorientedway;

import java.io.Serializable;

public class Student implements Serializable
{
	private int rno;
	private String name ;
	private int std,marks;

	public Student() 
	{
	}
	
	
	public Student(int rno, String name, int std, int marks) {
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}


	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks);
	}
}
