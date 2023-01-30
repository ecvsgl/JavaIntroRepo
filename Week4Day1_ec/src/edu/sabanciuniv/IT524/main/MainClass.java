package edu.sabanciuniv.IT524.main;

public class MainClass {
	public static void main(String[] args) {
		
		IsimListesi isimler = new IsimListesi();
		
		isimler.isimEkle("Efe");
		isimler.isimEkle("Ali");
		isimler.isimEkle("memet");
		isimler.isimEkle("aslan");
		isimler.isimEkle("kaplan");
		
		isimler.listeyiGoster();
	}
}
