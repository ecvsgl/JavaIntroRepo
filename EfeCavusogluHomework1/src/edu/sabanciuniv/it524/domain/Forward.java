package edu.sabanciuniv.it524.domain;

import java.util.Random;

public class Forward extends Player {
	//Datafields
	private String atkPosition;
	private int goalCount;
	//Constructors
	public Forward() {
		super();
	}
	public Forward(String name, String surname, int number, int age) {
		super(name, surname, number, age);
	}
	public Forward(String name, String surname, int number, int age, String atkPosition, int goalCount) {
		super(name, surname, number, age);
		this.atkPosition=atkPosition;
		this.goalCount=goalCount;	
	}
	//Methods
	public boolean strike() {
		Random rd = new Random();
		return rd.nextBoolean();
	}
	//Getters&Setters
	public String getAtkPosition() {
		return atkPosition;
	}
	public void setAtkPosition(String atkPosition) {
		this.atkPosition = atkPosition;
	}
	public int getGoalCount() {
		return goalCount;
	}
	public void setGoalCount(int goalCount) {
		this.goalCount = goalCount;
	}
}
