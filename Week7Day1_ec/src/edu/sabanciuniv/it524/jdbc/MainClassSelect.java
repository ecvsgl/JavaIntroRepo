package edu.sabanciuniv.it524.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClassSelect {

	public static void main(String[] args) {
			try {
				
				String url = "jdbc:mysql://localhost/it524"; 
					//3306 default port, localhost:3306 yazmak gerek, yazmasan da aynı.
				String username = "root";
				String password = "12561256aA";
				
				Connection conn = 
						DriverManager.getConnection(url,username,password);
				
				PreparedStatement ps = conn.prepareStatement("select * from students where id>?");
				ps.setInt(1,2); // 1  burada hangi soru işaretinin replace edileceği, 2 de yerine konan değer.
				ResultSet resultSet = ps.executeQuery();
				
				while(resultSet.next())
					{
						int id = resultSet.getInt("id");
						String n = resultSet.getString("name");
						String l = resultSet.getString("lastname");
						System.out.println(id+") "+ n+"------"+l);
					}
				
				
				}
			catch (Exception e) 
				{
					e.printStackTrace();
				}

	}

}
