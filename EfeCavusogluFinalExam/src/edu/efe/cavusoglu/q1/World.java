package edu.efe.cavusoglu.q1;

import java.util.ArrayList;

public class World {

	private String continentNames = "";
	private ArrayList<Continent> continents = new ArrayList<>();

	public World() {
		
	}
	
	public void addContinent(Continent continent) {
		this.continents.add(continent);
	}

	public void printInfo() {
		
		for (int i=0; i<continents.size();i++) {
			String x = continents.get(i).getName();
			continentNames += x ;
			if (i!=continents.size()-1) {
				continentNames += ",";
			}
		}
		
		System.out.println("There are "+continents.size()+" continents in the world : ["+continentNames+"]");
		
		for (Continent x: continents) {
			x.printInfo();
		}
		
	}

	public String getContinentNames() {
		return continentNames;
	}

	public void setContinentNames(String continentNames) {
		this.continentNames = continentNames;
	}

	public ArrayList<Continent> getContinents() {
		return continents;
	}

	public void setContinents(ArrayList<Continent> continents) {
		this.continents = continents;
	}
	

	
}
