package edu.sabanciuniv.fileio;

import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainClassFastestFileRead {

	public static void main(String[] args) {
		
		try {
			Path path = Paths.get("syllabus.txt");
			
			int fileSize = (int)Files.size(path);
			char[] allText = new char[fileSize];
			FileReader rd = new FileReader("syllabus.txt");
			rd.read(allText);
			
			System.out.println(allText);

			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
