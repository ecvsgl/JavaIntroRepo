package edu.efe.cavusoglu.q1;

public class MainClass {

	public static void main(String[] args) {
		World world = new World();
		
		Continent asia = new Continent("Asia");
		Continent europe = new Continent("Europe");
		Continent africa = new Continent("Africa");
		Continent namerica = new Continent("North America");
		Continent samerica = new Continent("South America");
		Continent oceana = new Continent("Oceana");
		Continent cold = new Continent("Antarctica");
		
		world.addContinent(asia);
		world.addContinent(europe);
		world.addContinent(africa);
		world.addContinent(namerica);
		world.addContinent(samerica);
		world.addContinent(oceana);
		world.addContinent(cold);
		
		europe.addCountry(new Country("Türkiye","Ankara",5663000));
		europe.addCountry(new Country("UK","London",8980000));
		europe.addCountry(new Country("France","Paris",2161000));
		
		asia.addCountry(new Country("China","Beijing",21540000));
		asia.addCountry(new Country("Japan","Tokyo",13960000));
		
		world.printInfo();
	}
}
