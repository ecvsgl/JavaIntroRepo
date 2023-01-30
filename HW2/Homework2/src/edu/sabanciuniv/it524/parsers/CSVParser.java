package edu.sabanciuniv.it524.parsers;

import java.io.FileReader;
import java.io.BufferedReader;

public class CSVParser extends TextFileParser{

	@Override
	public String readFile(String filePath) throws Exception {
		//TODO : Implement the -- readFile(String filePath) -- method
		String line = "";
		String allText = "";
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
		String correctText = allText.replace(",", " ");
		return correctText;
	}
}
