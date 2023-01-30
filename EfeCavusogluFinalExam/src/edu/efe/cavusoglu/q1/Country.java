package edu.efe.cavusoglu.q1;

public class Country {

	private String name;
	private String capital;
	private long population;
	
	public Country() {
		
	}
	
	public Country(String name, String capital, int population) {
		this.name = name;
		this.capital = capital;
		this.population = population;
	}

	public void printInfo() {
		System.out.println(this.name+" (Capital : "+this.capital+", Population : "+this.population+")");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

}
