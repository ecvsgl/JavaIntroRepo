package edu.sabanciuniv.it524.domain;

public class Referree {
	//Datafields
	private String name;
	private String surname;
	private int yearsOfExp;
	private boolean isFifaCertified;
	//Constructors
	public Referree() {
	}
	public Referree(String name, String surname, int yearsOfExp, boolean isFifaCertified) {
		this.name = name;
		this.surname = surname;
		this.yearsOfExp = yearsOfExp;
		this.isFifaCertified = isFifaCertified;
	}
	//Methods
	public void startMatch() {
		System.out.println(this.name+" "+this.surname+": "+"May Messi... ehm.. the Best Team Win !\n");
	}
	public void declareTimeout() {
		System.out.println(this.name+" "+this.surname+": "+"Beep.. beep... BEEEEEEEP!!");
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
	public boolean isFifaCertified() {
		return isFifaCertified;
	}
	public void setFifaCertified(boolean isFifaCertified) {
		this.isFifaCertified = isFifaCertified;
	}
}
