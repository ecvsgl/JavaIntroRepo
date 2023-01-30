package edu.sabanciuniv.IT524;

import edu.sabanciuniv.IT524.other.Kalem;
import edu.sabanciuniv.IT524.other.Lokasyon;

public class MainClass {

	public static void main(String[] args) {
		/*
		Otobus mercedes = new Otobus();
		Insan efe = new Insan("Efe Cavusoglu")
		efe.bin(mercedes);
		mercedes.git("Taksim");
		
		ExcelReader reader = new ExcelReader();
		ExcelObject excel = reader.readExcel("abc.xlsx");
		excel.save("c:/abc.xlsx");
		*/

		
		//Nesne tabanlı dünyaya 2 farklı açıdan bakabiliriz;
		
		//1)Class -- Object (Nesne yaratma ve kullanma)
		//Tüm nesnelerin iki özelliği vardır;
		//State - Durum bilgisi ---> Değişkenlerde tutacağız.
		//Behavior -- Yapabildikleri ---> Methodlarda tutacağız.
		
		Kalem faber = new Kalem(); 
		faber.madde = "Plastik";
		faber.renk = "Mavi";
		faber.yaz();
		
		Kalem rotring = new Kalem();
		rotring.madde = "Tahta";
		rotring.renk = "Kahverengi";
		rotring.yaz();
		
		//2) Complex Type
		Lokasyon l1 = new Lokasyon(26.55,33.65);
		l1.bilgiGoster();
		
		Lokasyon l2 = new Lokasyon(22.22);
		l2.bilgiGoster();
		
		Lokasyon l3 = new Lokasyon();
		l3.bilgiGoster();
		
		
	}
}
