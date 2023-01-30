package edu.sabanciuniv.fileio;

import java.io.BufferedReader;
import java.io.FileReader;

public class MainClassFileReader {

	public static void main(String[] args) {
		
		try {
			
			FileReader reader = new FileReader("syllabus.txt");
			BufferedReader bufferedReader = 
					new BufferedReader(reader);
			String allText = "";
			while(true)
			{
				String line = bufferedReader.readLine();
				if(line==null)
					break;
				allText += line + "\n";
			}
			
			System.out.println(allText);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
