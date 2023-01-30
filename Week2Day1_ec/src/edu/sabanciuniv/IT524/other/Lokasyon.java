package edu.sabanciuniv.IT524.other;

public class Lokasyon {
	public double enlem;
	public double boylam;	
	
	//Empty veya Default constructor --- hiç constructor yoksa java bir boş constructor atayacak.
	// ama bir tane bile constructor yaratırsan ve non-default olursa obj oluştururken
	//boş parantez bırakamazsın, parametre ataman gerekir.
	//consturctor a void yazamazsın. O zaman o constructor olmaz.
	public Lokasyon () {
		enlem =0;
		boylam =0;
	}
	
	
	public Lokasyon (double d1) { //Class ismiyle aynı olmalı. Bu bir constructor method
		enlem = d1;
		boylam = 0;
	}
	
	//Copy veya full constructor (class içindeki tüm fieldları atıyor.)
	public Lokasyon (double d1, double d2) { //Class ismiyle aynı olmalı. Bu bir constructor method
		enlem = d1;
		boylam = d2;
	}
	
	public void bilgiGoster() { // Constructor olmayan fonksiyonlara her türlü void yazcan.
		System.out.println("");
	}
}
