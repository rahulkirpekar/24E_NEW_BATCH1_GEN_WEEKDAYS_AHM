package jdbctopic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBConnection;

public class StudentDaoPrep 
{
	public int insertStudent(StudentBean sbean) 
	{
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES (?,?,?)";
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(insertQuery);
			
				pstmt.setString(1, sbean.getName());
				pstmt.setInt(2, sbean.getStd());
				pstmt.setInt(3, sbean.getMarks());
				
				rowsAffected = pstmt.executeUpdate();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep - Db not conected");
		}
		return rowsAffected;
	}
	
	public int deleteStudent(int rno) 
	{
		String deleteQuery = "DELETE FROM student WHERE rno = ?";
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0 ;
		if (conn != null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(deleteQuery);
			
				pstmt.setInt(1, rno);
				
				rowsAffected = pstmt.executeUpdate();
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("StudentDaoPrep---deleteStudent()---Db not connected"); 
		}
		return rowsAffected;
	}
	public ArrayList<StudentBean> getAllRecords() 
	{
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		
		String selectQuery = "SELECT * FROM student";
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentBean s = null;
		if (conn != null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(selectQuery);
			
				rs = pstmt.executeQuery();
				
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
	
	public int updateStudent(StudentBean sbean , int rno) 
	{
		String updateQuery = "UPDATE student SET name=?,std=?,marks=? WHERE rno=?";
		
		System.out.println("updateQuery : " + updateQuery);
		
		int rowsAffected = 0;
		
		// 1. get DB connection
		Connection conn = DBConnection.getConnection();
		
		PreparedStatement pstmt = null;
		
		// 2 validate conn object
		if (conn != null) 
		{
			try 
			{
				// 3. create statement object
				pstmt = conn.prepareStatement(updateQuery);
				
				pstmt.setString(1, sbean.getName());
				pstmt.setInt(2, sbean.getStd());
				pstmt.setInt(3, sbean.getMarks());
				pstmt.setInt(4, rno);
				
				
				// 4. PreparedStatement--executeUpdate---UPDATE---SQL
				rowsAffected = pstmt.executeUpdate();
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("StudentDaoPrep---updateStudent() ----Db not conncted");
		}
		return rowsAffected;
	}
	public static void main(String[] args) 
	{
		StudentDaoPrep dao = new StudentDaoPrep();
		
		ArrayList<StudentBean> list = dao.getAllRecords();
		
		for (int i = 0; i < list.size(); i++) 
		{
			StudentBean s = list.get(i);
			
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}		
/*			
		Scanner sc = new Scanner(System.in);
		//------------------DELETE Student------------------------		
		System.out.println("Enter Rno which you want to Delete Student : "); 
		int rno = sc.nextInt();
	
		StudentDaoPrep dao = new StudentDaoPrep();
		
		int rowsAffected = dao.deleteStudent(rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record suuccsfully Deleted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Deleted : " + rowsAffected);
		}
		
		
		
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
		
		StudentDaoPrep dao = new StudentDaoPrep();
		
		int rowsAffected = dao.updateStudent(sbean,rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record suuccsfully Updated : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Updated : " + rowsAffected);
		}
		//------------------INSERT Student------------------------		
		System.out.println("Enter Name : "); 
		String name = sc.nextLine();
		System.out.println("Enter Std : "); 
		int std = sc.nextInt();
		System.out.println("Enter Marks : "); 
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDaoPrep dao = new StudentDaoPrep();
		
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
