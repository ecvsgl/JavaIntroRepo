package edu.sabanciuniv.it524.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class MainClassDelete {

	public static void main(String[] args) {
		
		try {
			
			String url = "jdbc:mysql://localhost/it524"; 
				//3306 default port, localhost:3306 yazmak gerek, yazmasan da aynı.
			String username = "root";
			String password = "12561256aA";
			
			Connection conn = 
					DriverManager.getConnection(url,username,password);
			
			System.out.println("***** Connection Established. *****");
			
			PreparedStatement ps = conn.prepareStatement("delete from students where id=?");
			
			ps.setInt(1, 2);
		
			int updatedRowCount = ps.executeUpdate();
			
			System.out.println("Silinen Satır Sayısı : "+updatedRowCount);
		}
		catch (Exception e) {
			e.printStackTrace();
		}


	}

}
