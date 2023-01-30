package edu.sabanciuniv.it524.domain;

public class Player {
	//Datafields
	private String name;
	private String surname;
	private int number;
	private int age;
	//Constructors
	public Player() {
	}
	public Player(String name, String surname, int number, int age) {
		this.name = name;
		this.surname = surname;
		this.number = number;
		this.age = age;
	}
	//Methods

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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
