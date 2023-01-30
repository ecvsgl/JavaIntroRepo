package edu.sabanciuniv.it524.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class MainClassUpdate {

	public static void main(String[] args) {
		
		try {
			
			String url = "jdbc:mysql://localhost/it524"; 
				//3306 default port, localhost:3306 yazmak gerek, yazmasan da aynı.
			String username = "root";
			String password = "12561256aA";
			
			Connection conn = 
					DriverManager.getConnection(url,username,password);
			
			System.out.println("***** Connection Established. *****");
			
			PreparedStatement ps = conn.prepareStatement("update students set name=? where id=?");
			
			ps.setString(1, "Ali");
			ps.setInt(2, 8);
		
			int updatedRowCount = ps.executeUpdate();
			
			System.out.println("Değişen Satır Sayısı : "+updatedRowCount);
		}
		catch (Exception e) {
			e.printStackTrace();
		}


	}

}
