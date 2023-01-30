package edu.sabanciuniv.IT524.srs;

import java.util.ArrayList;

public class Student {
	
	private int id;
	private String name;
	private String lastname;
	
	private ArrayList<Adress> adresses = new ArrayList<Adress>();
	
	public void addAdress(Adress adres) 
	{
		this.adresses.add(adres);
	}
	
	public void printInfo() {
		System.out.println("-----------");
		System.out.println("Student name: "+ this.getName());
		System.out.println("Student lastname: "+ this.getLastname());
		System.out.println("Student id: "+ this.getId());
		System.out.println("-----------\n");
	}
	
	public Student () {
		
	}
	
	public Student(int id, String name, String lastname) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public ArrayList<Adress> getAdresses() {
		return adresses;
	}

	public void setAdresses(ArrayList<Adress> adresses) {
		this.adresses = adresses;
	}

}
