package edu.sabanciuniv.IT524.poly;

public class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("meow");
	}
	public void catMethod() {
		System.out.println("Only Cat has this method...");
	}
}
