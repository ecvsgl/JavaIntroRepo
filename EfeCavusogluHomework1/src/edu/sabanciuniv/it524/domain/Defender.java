package edu.sabanciuniv.it524.domain;

import java.util.Random;

public class Defender extends Player {
	//Datafields
	private String defPosition;
	//Constructors
	public Defender() {
		super();
	}
	public Defender(String name, String surname, int number, int age) {
		super(name, surname, number, age);
	}
	public Defender(String name, String surname, int number, int age, String defPosition) {
		super(name, surname, number, age);
		this.defPosition = defPosition;
	}
	//Methods
	public boolean defend() {
		Random rd = new Random();
		return rd.nextBoolean();
	}
	//Getters&Setters
	public String getDefPosition() {
		return defPosition;
	}
	public void setDefPosition(String defPosition) {
		this.defPosition = defPosition;
	}
}
