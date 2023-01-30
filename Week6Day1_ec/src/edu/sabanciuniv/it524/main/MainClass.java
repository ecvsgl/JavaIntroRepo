package edu.sabanciuniv.it524.main;

import edu.sabanciuniv.it524.domain.Car;
import edu.sabanciuniv.it524.domain.Driver;
import edu.sabanciuniv.it524.domain.House;
import edu.sabanciuniv.it524.domain.Insurer;
import edu.sabanciuniv.it524.domain.Truck;

public class MainClass {

	public static void main(String[] args) {
		//Exception handling...
		Car kitt = new Car("Ahmet");
		Truck truck1 = new Truck("Caner");
		
		
		Driver driver = new Driver ("Ali");
		driver.drive(kitt);
		driver.drive(truck1);
		
		House house1 = new House("Efe");
		Insurer sigortaci = new Insurer("Ataberk");
		sigortaci.insure(kitt);
		sigortaci.insure(house1);
		sigortaci.insure(truck1);
				
		//driver.drive(house1); //Bunun yapılamaması gerekli.
		
	}

}
