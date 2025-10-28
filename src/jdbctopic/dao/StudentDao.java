package jdbctopic.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBConnection;

// StudentDao---Student Table
public class StudentDao 
{
	public int insertStudent(StudentBean sbean) 
	{
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES ('"+sbean.getName()+"',"+sbean.getStd()+","+sbean.getMarks()+")";
		
		System.out.println("insertQuery : " + insertQuery);
		
		int rowsAffected = 0;
		
		// 1. get DB connection
		Connection conn = DBConnection.getConnection();
		
		Statement stmt = null;
		
		// 2 validate conn object
		if (conn != null) 
		{
			try 
			{
				// 3. create statement object
				stmt = conn.createStatement();
				
				// 4. executeUpdate---INSERT---SQL
				rowsAffected = stmt.executeUpdate(insertQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("StudentDao---insertStudent() ----Db not conncted");
		}
		return rowsAffected;
	}
	public int updateStudent(StudentBean sbean , int rno) 
	{
		String updateQuery = "UPDATE student SET name='"+sbean.getName()+"',std="+sbean.getStd()+",marks="+sbean.getMarks()+" WHERE rno="+rno;
		
		System.out.println("updateQuery : " + updateQuery);
		
		int rowsAffected = 0;
		
		// 1. get DB connection
		Connection conn = DBConnection.getConnection();
		
		Statement stmt = null;
		
		// 2 validate conn object
		if (conn != null) 
		{
			try 
			{
				// 3. create statement object
				stmt = conn.createStatement();
				
				// 4. executeUpdate---UPDATE---SQL
				rowsAffected = stmt.executeUpdate(updateQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("StudentDao---updateStudent() ----Db not conncted");
		}
		return rowsAffected;
	}
	public int deleteStudent(int rno) 
	{
		String deleteQuery = "DELETE FROM student WHERE rno = " + rno;
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		int rowsAffected = 0 ;
		if (conn != null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rowsAffected = stmt.executeUpdate(deleteQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("StudentDao---deleteStudent()---Db not connected"); 
		}
		return rowsAffected;
	}
	public ArrayList<StudentBean> getAllRecords() 
	{
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		
		String selectQuery = "SELECT * FROM student";
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		StudentBean s = null;
		if (conn != null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rs = stmt.executeQuery(selectQuery);
				
				while(rs.next()) 
				{
					int rno = rs.getInt(1);
					String name = rs.getString(2);
					int std = rs.getInt(3);
					int marks = rs.getInt(4);
					
//					System.out.println("====> " + rno+" " + name+" " + std+" " + marks);
					
					s = new StudentBean(rno, name, std, marks);
					
					list.add(s);
					
				}
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao---selectStudent()---Db not connected"); 
		}
		return list;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		StudentDao dao = new StudentDao();
		
		ArrayList<StudentBean> list = dao.getAllRecords();
		
		for (int i = 0; i < list.size(); i++) 
		{
			StudentBean s = list.get(i);
			
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
/*		
//------------------UPDATE Student------------------------		
		
		System.out.println("Enter Rno which you want to Update Student : "); 
		int rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : "); 
		String name = sc.nextLine();
		System.out.println("Enter Std : "); 
		int std = sc.nextInt();
		System.out.println("Enter Marks : "); 
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.updateStudent(sbean,rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record suuccsfully Updated : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Updated : " + rowsAffected);
		}

		
	//------------------DELETE Student------------------------		
		System.out.println("Enter Rno which you want to Delete Student : "); 
		int rno = sc.nextInt();
	
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.deleteStudent(rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record suuccsfully Deleted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Deleted : " + rowsAffected);
		}
		
//------------------INSERT Student------------------------		
		System.out.println("Enter Name : "); 
		String name = sc.nextLine();
		System.out.println("Enter Std : "); 
		int std = sc.nextInt();
		System.out.println("Enter Marks : "); 
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.insertStudent(sbean);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record suuccsfully Inserted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Inserted : " + rowsAffected);
		}
*/		
	}
}
