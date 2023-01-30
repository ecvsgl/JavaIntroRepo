package edu.sabanciuniv.it524.domain;

public class Coach {
	//Datafields
	private String name;
	private String surname;
	private int yearsOfExp;
	private int numberOfChampionships;
	private boolean exFootballer;
	//Constructors
	public Coach() {
	}
	public Coach(String name, String surname, int yearsOfExp, int numberOfChampionships, boolean exFootballer) {
		this.name = name;
		this.surname = surname;
		this.yearsOfExp = yearsOfExp;
		this.numberOfChampionships = numberOfChampionships;
		this.exFootballer = exFootballer;
	}
	//Methods
	public void yellAtPlayers() {
		System.out.println(this.name+ " " + this.surname+" : GO ON AND ATTACK WE ARE LOSING THIS GAME! COME ON!\n");
	}
	//Getters&Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getYearsOfExp() {
		return yearsOfExp;
	}
	public void setYearsOfExp(int yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}
	public int getNumberOfChampionships() {
		return numberOfChampionships;
	}
	public void setNumberOfChampionships(int numberOfChampionships) {
		this.numberOfChampionships = numberOfChampionships;
	}
	public boolean isExFootballer() {
		return exFootballer;
	}
	public void setExFootballer(boolean exFootballer) {
		this.exFootballer = exFootballer;
	}	
}
