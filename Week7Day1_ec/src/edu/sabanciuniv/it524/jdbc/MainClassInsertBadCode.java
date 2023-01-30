package edu.sabanciuniv.it524.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainClassInsertBadCode {

	public static void main(String[] args) {
		
		try {
			
			String url = "jdbc:mysql://localhost/it524"; 
				//3306 default port, localhost:3306 yazmak gerek, yazmasan da aynı.
			String username = "root";
			String password = "12561256aA";
			
			Connection conn = 
					DriverManager.getConnection(url,username,password);
			
			System.out.println("***** Connection Established. *****");
			
			String name = "Ali";
			String lastname = "Desidero";
			
			Statement statement = conn.createStatement(); //Bundan sonra kullanılmayacak statement objesi.
			
			statement.execute("insert into students (name, lastname) values  ("+name+","+lastname+")");
			
			System.out.println("***** Insertion Completed. *****");
		}
		catch (Exception e) {
			e.printStackTrace();
		}


	}

}
