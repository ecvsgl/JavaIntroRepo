package edu.sabanciuniv.it524.fileio;

import java.awt.BufferCapabilities;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass2 {

	public static void main(String[] args) {

		try {
			BufferedReader rdr = new FileReader("abc.txt");
			int birinciHarf = rdr.read();
			int ikinciHarf = rdr.read();
			int ucuncuHarf = rdr.read();
			System.out.println((char)birinciHarf+"-"+(char)ikinciHarf+"-"+(char)ucuncuHarf);
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı.");		
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya bulundu okunamadı. İzin yok.");
			e.printStackTrace();
		}	}

}
