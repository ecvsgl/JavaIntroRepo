package edu.sabanciuniv.IT524;

import edu.sabanciuniv.IT524.domain.Ev;

public class MainClass {

	public static void main(String[] args) {
		//Features of OOP Languages
		/*
		 * 1)Abstraction
		 * 2)Encapsulation
		 * 3)Inheritance
		 * 4)Polymorphism
		 */
		
		
		//Composition 
		Ev ev = new Ev("EfeCavusoglu");
		Kapi kapi = new Kapi("kahverengi","çelik");
		ev.setKapi(kapi);
		ev.bilgileriGoster();
	}

}
