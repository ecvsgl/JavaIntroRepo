package edu.efe.cavusoglu.q1;

import java.util.ArrayList;

public class Continent {
	private String name;
	private String countryNames ="";
	private ArrayList<Country> countries = new ArrayList<>();
	
	public Continent() {
		
	}
	public Continent(String name) {
		this.name = name;
	}

	public void addCountry(Country country) {
		this.countries.add(country);
	}
	
	public void printInfo() {
		if(this.countries.size()==0){
			System.out.println("There are no countries in "+this.name);
		}
		else {
			
			for (int i=0; i<countries.size();i++) {
				String x = countries.get(i).getName();
				countryNames += x ;
				if (i!=countries.size()-1) {
					countryNames += ",";
				}
			}
			
			System.out.println("There are "+this.countries.size()+" countries in "+this.name+" : ["+countryNames+"]");
			for (Country x : countries) {
				System.out.print("\t");
				x.printInfo();			
			}
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Country> getCountries() {
		return countries;
	}
	public void setCountries(ArrayList<Country> countries) {
		this.countries = countries;
	}
	public String getCountryNames() {
		return countryNames;
	}
	public void setCountryNames(String countryNames) {
		this.countryNames = countryNames;
	}
	
	

}
