package edu.sabanciuniv.it524.domain;

public abstract class Vehicle implements Insurable{
	private String owner;

	public Vehicle() {
	}

	public Vehicle (String owner) {
		this.owner=owner;
	}
	
	public abstract void go();

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}
