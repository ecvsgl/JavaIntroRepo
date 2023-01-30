package edu.sabanciuniv.IT524.poly;

public class MainClass2 {

	public static void main(String[] args) {
		Animal a1 = new Lion();
		a1.sound();
		
		Animal animal = new Lion();
		animal.animalMethod();
		
		Cat c = (Cat)animal;//TypeCasting
		c.catMethod();
		
		Lion l = (Lion)animal;//TypeCasting
		
	}

}
