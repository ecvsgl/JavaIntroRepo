package edu.sabanciuniv.it524.domain;

public class Car extends Vehicle {

	public Car(String owner) {
		//super(owner); bu da olur, şu da;
		
		super();
		this.setOwner(owner);//Yukardaki tek satırın alternatifi bu iki satır..
}

	@Override
	public void go() {
		System.out.println(this.getOwner()+" 's Car is going...");
	}

	@Override
	public void getInsured() {
		System.out.println(this.getOwner() + "'s Car is insured.");		
	}
}