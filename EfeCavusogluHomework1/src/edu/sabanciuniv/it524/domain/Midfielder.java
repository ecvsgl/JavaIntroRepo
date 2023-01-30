package edu.sabanciuniv.it524.domain;

public class Midfielder extends Player {
	//Datafields
	private String midPosition;
	//Constructors
	public Midfielder() {
		super();
	}
	public Midfielder(String name, String surname, int number, int age) {
		super(name, surname, number, age);
	}
	public Midfielder(String name, String surname, int number, int age, String midPosition) {
		super(name, surname, number, age);
		this.midPosition=midPosition;
	}
	//Getters&Setters
	public String getMidPosition() {
		return midPosition;
	}
	public void setMidPosition(String midPosition) {
		this.midPosition = midPosition;
	}
}
