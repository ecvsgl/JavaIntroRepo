package edu.sabanciuniv.IT524.poly;

public class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("Woooof");
	}
	
	public void dogMethod() {
		System.out.println("Only Dog has this method...");
	}
}
