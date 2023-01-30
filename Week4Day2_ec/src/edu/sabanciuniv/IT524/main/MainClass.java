package edu.sabanciuniv.IT524.main;

import edu.sabanciuniv.IT524.domain.Sirket;

public class MainClass {

	public static void main(String[] args) {
		Sirket sirket = new Sirket ("Ortogon A.Ş.", 123456789, "Ahmet");

		System.out.println(sirket);
		
		sirket.normalCalisanIseAl("Efe", "Cavusoglu", "27773832123");
		sirket.normalCalisanIseAl("Caner", "Başdoğan", "1231234");
		sirket.normalCalisanIseAl("Yağmur", "Cavusoglu", "23124124");
		sirket.yariZamanliCalisanIseAl("Ege", "Sozen", "231231232", 50.0d);
		sirket.sozlesmeliCalisanIseAl("Ayla", "Tulga", "123124", 6, 20000);
		//sirket.calisanlariListele();
		sirket.calisin();
		
		sirket.maasOde();
	}

}
