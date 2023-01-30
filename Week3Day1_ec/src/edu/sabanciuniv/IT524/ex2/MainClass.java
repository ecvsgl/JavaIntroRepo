package edu.sabanciuniv.IT524.ex2;

public class MainClass {
	public static void main(String[] args) {
		Traktor traktor = new Traktor("John Deere");
		
		traktor.gazaBas(); //burada traktör calismiyor yazisini ekrana basmali
		
		traktor.calistir();
		traktor.gazaBas();
		traktor.gazaBas();
		traktor.gazaBas();
		traktor.gazaBas();
		traktor.gazaBas();
		traktor.gazaBas();
		
		traktor.freneBas();
		
		Romorkor romorkor = new Romorkor(10);
		traktor.romorkorTak(romorkor);
		
		traktor.gazaBas();
		traktor.gazaBas();
		traktor.gazaBas();
		
	}
	
}
