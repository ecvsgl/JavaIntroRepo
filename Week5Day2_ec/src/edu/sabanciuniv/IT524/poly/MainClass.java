package edu.sabanciuniv.IT524.poly;

public class MainClass {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		animal1.sound();
		
		Cat cat1 = new Cat(); //Polymorphism yok.
		cat1.catMethod();
		cat1.sound();
	
		Animal cat2 = new Cat(); //Burda subclasstan yaratılmış bir obje, superclass tarafından ref edilebilir.
		//Amaaa bu durumda sadece ANIMAL'ın methodlarını kullanabilirsin.
		cat2.animalMethod();
		cat2.sound(); //Polymorhphism var!!!
		//cat2.catMethod(); //Çalışmaz, ulaşamazsın çünkü referansın uygun değil.
		
		Cat newRef = ((Cat)cat2); //Typecasting
		
		newRef.catMethod();
		
	
	}
	
	

}
