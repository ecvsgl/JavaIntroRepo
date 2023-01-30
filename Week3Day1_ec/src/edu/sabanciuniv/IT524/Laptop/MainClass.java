package edu.sabanciuniv.IT524.Laptop;

public class MainClass {

	public static void main(String[] args) {
		Disc disc1 = new Disc("512GB","Samsung");
		CPU cpu1 = new CPU("3.2GHZ", "8-core");
		RAM ram1 = new RAM("16GB");
		
		Laptop efesLaptop = new Laptop("Lenovo", disc1, cpu1, ram1);
		
		System.out.println("---------------------------");
		System.out.println(efesLaptop.getBrand());
		System.out.println("---------------------------");
		System.out.println(efesLaptop.getMemory().getCapasity());
		System.out.println("---------------------------");
		System.out.println(efesLaptop.getProcessor().getClockrate());
		System.out.println("---------------------------");
		System.out.println(efesLaptop.getProcessor().getCorecount());
		System.out.println("---------------------------");
		System.out.println(efesLaptop.getSsd().getCapasity());
		System.out.println("---------------------------");
		System.out.println(efesLaptop.getSsd().getBrand());
		System.out.println("---------------------------");
		
	}

}
