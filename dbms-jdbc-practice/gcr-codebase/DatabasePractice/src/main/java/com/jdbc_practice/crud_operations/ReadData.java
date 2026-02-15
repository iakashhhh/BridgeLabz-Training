package com.jdbc_practice.crud_operations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.jdbc_practice.connection.BasicConnection;
public class ReadData {
	public static void getAllStudents(){
		String sql = "SELECT * FROM students";
		try {
			Connection conn = BasicConnection.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			//System.out.println("----Printing result----");
			System.out.println("ID\tName\tEmail\t\t\tAge\tGrade");
			System.out.println("---------------------------------------------------------");
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				int age = rs.getInt("age");
				String grade = rs.getString("grade");
				
				System.out.printf("%d\t%s\t%s\t%d\t%s%n",
						id, name, email, age, grade);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void getStudentById() {
		String sql = "SELECT * FROM students WHERE id = 1";
		try {
			Connection conn = BasicConnection.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
		} catch(SQLException e) {
			System.out.println("SQL exception" + e.getStackTrace());
		}
	}
	public static void main(String[] args) {
		
		getAllStudents();
		getStudentById();
		
		
	}
}
