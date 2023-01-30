package edu.sabanciuniv.it524;

public class MainClass {

	public static void main(String[] args) {
		
		
		TrafikIsigi  trafikIsigi = new TrafikIsigi("kırmızı");
		
		Araba araba1 = new Araba("Ahmet");
		Araba araba2 = new Araba("Ali");
		Araba araba3 = new Araba("Veli");
		
		araba1.isigaBak(trafikIsigi);
		araba2.isigaBak(trafikIsigi);
		araba3.isigaBak(trafikIsigi);
		
		trafikIsigi.yesilOl();
		
		
		trafikIsigi.kirmiziOl();
		
		
		

	}

}
