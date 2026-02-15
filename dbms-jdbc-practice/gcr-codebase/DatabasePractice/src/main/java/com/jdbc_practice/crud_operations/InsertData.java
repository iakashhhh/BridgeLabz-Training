package com.jdbc_practice.crud_operations;
import java.sql.*;

import com.jdbc_practice.connection.BasicConnection;
public class InsertData {
	public static void insertData(String name, String email, int age, String grade) {
		String sql = "INSERT INTO students (name, email, age, grade, enrollment_date) VALUES(?,?,?,?,?)" ;
		try {
			Connection connection = BasicConnection.getConnection();
			PreparedStatement pst = connection.prepareStatement(sql);
			
				pst.setString(1, name);
				pst.setString(2, email);
				pst.setInt(3, age);
				pst.setString(4, grade);
				pst.setDate(5, new java.sql.Date(System.currentTimeMillis()));
				int rowsAffected = pst.executeUpdate();
				System.out.println(rowsAffected + " rows inserted successfully!");
				
				} catch(SQLException e) {
					System.out.println("Insert failed - " + e.getMessage());
									}
		}
	
	public static void main(String[] arge) {
		insertData("Akash", "akashh@gmail.com", 21, "A");
		insertData("Vikash", "vikash@gmail.com", 22, "B");
	}
}
