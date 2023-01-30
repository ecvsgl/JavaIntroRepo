package edu.sabanciuniv.fileio;

import java.io.FileWriter;

public class MainClassFileWrite {

	public static void main(String[] args) {
		
		try {
			
			FileWriter wr = new FileWriter("abc.txt",true);
			wr.write("I set fire to the rain\n");	
			wr.close();
			System.out.println("bitti");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		//aynı işi yapan ama otomatik close metodu çağıran try kullanılabilir
		//try with resources
		
		try (FileWriter wr = new FileWriter("abcd.txt"))
		{
			wr.write("merhaba");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
	}

}
