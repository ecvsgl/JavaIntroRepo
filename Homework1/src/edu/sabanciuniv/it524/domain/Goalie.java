package edu.sabanciuniv.it524.domain;

import java.util.Random;

public class Goalie extends Player {
	//Datafields
	private int savedGoals;
	private boolean withGloves;
	private boolean withKneepads;
	private boolean goalKeepingSuccess;
	//Constructors
	public Goalie() {
		super();
	}
	public Goalie(String name, String surname, int number, int age) {
		super(name, surname, number, age);
	}
	public Goalie(String name, String surname, int number, int age,int savedGoals, boolean withGloves, boolean withKneepads, boolean goalKeepingSuccess) {
		super(name, surname, number, age);
		this.savedGoals = savedGoals;
		this.withGloves = withGloves;
		this.withKneepads = withKneepads;
		this.goalKeepingSuccess = goalKeepingSuccess;
	}
	//Methods
	public boolean goalDefend() {
		Random rd = new Random();
		return rd.nextBoolean();
	}
	//Getters&Setters
	public int getSavedGoals() {
		return savedGoals;
	}
	public void setSavedGoals(int savedGoals) {
		this.savedGoals = savedGoals;
	}
	public boolean isWithGloves() {
		return withGloves;
	}
	public void setWithGloves(boolean withGloves) {
		this.withGloves = withGloves;
	}
	public boolean isWithKneepads() {
		return withKneepads;
	}
	public void setWithKneepads(boolean withKneepads) {
		this.withKneepads = withKneepads;
	}
	public boolean isGoalKeepingSuccess() {
		return goalKeepingSuccess;
	}
	public void setGoalKeepingSuccess(boolean goalKeepingSuccess) {
		this.goalKeepingSuccess = goalKeepingSuccess;
	}
}
