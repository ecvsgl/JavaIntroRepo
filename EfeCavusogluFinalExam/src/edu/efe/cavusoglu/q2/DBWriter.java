package edu.efe.cavusoglu.q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.LinkedHashMap;
import java.util.Map;

public class DBWriter {

	final String url = "jdbc:mysql://localhost/it524"; 
	final String username = "root";
	final String password = "12345678";
	
	public DBWriter() {
		
	}
	public void writeTextToDatabase(String filePath) {
		try {
			String contentString = readText(filePath);
			String[] contentsArray = contentString.split("\n");
			Map<String,Integer> productMap = new LinkedHashMap<String,Integer>();
			for (String x:contentsArray) {
				String name = "";
				int count = 0;
				String stringCount ="";
				String [] lineContent = x.split(",");
				name = lineContent[0].substring(lineContent[0].indexOf(":")).replace(":","");
				stringCount = lineContent[1].substring(lineContent[1].indexOf(":")).replace(":","");
				count = Integer.parseInt(stringCount);
				if (productMap.keySet().contains(name)) {
					int oldValue = productMap.get(name);
					int newValue = oldValue + count;
					productMap.put(name,newValue);
				} else {
					productMap.put(name,count);
				}
			}
			Connection conn = DriverManager.getConnection(url,username,password);
			for (String key: productMap.keySet()) {
				String insertName = key;
				int insertCount = productMap.get(key);
				
				PreparedStatement ps = conn.prepareStatement("insert into products (name,count) values (?,?)");
				ps.setString(1, insertName);
				ps.setInt(2, insertCount);
				ps.execute();
			}
			System.out.println("---Database Updated Successfully---");
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	private String readText(String filePath) throws Exception {
		String line="";
		String allText ="";
		FileReader reader = new FileReader(filePath);
		BufferedReader mainReader = new BufferedReader(reader);
		
		while(true) {
			line = mainReader.readLine();
			if(line==null) {
				break;
			}
			allText += line + "\n";
		}
		mainReader.close();
		String parsedText = allText.replace("{", "");
		parsedText = parsedText.replace("}", "");
		return parsedText;
	}

}
