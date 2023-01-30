package edu.sabanciuniv.it524.domain;

public class Insurer {
	private String insurerName;

	public Insurer(String insurerName) {
		this.insurerName = insurerName;
	}
	
	public void insure(Insurable insurable) {
		System.out.println(this.insurerName + " is insuring --- >");
		insurable.getInsured();
	}
}
