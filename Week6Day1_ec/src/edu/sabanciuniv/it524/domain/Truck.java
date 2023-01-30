package edu.sabanciuniv.it524.domain;

public class Truck extends Vehicle {

	public Truck(String owner) {
		//super(owner); /Böyle de olur...
		//this.setOwner(owner); //Böyle de olur... amaaa bir boş constructor'ın Vehicle'da olması gerek
		//Sen super() çağırmasan da bunu implicit call olarak çağıracaktır bu Truck constructor'ı.
		super(owner);
	}
	

	@Override
	public void go() {
		System.out.println(this.getOwner()+" 's Truck is going...");
	}


	@Override
	public void getInsured() {
		System.out.println(this.getOwner() + "'s Truck is insured.");		
	}

	
}
