package edu.sabanciuniv.fileio;

import java.io.FileReader;

public class MainClassBufferedReader {

	public static void main(String[] args) {
		
		try {
			
			FileReader reader = 
					new FileReader("syllabus.txt");
			String allText = "";
			while(true)
			{
				int ilkHarf = reader.read();
				if(ilkHarf==-1)
					break;
				allText += (char)ilkHarf;
			}
			
			System.out.println(allText);
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
