package edu.sabanciuniv.IT524.srs;

public class MainClass {

	public static void main(String[] args) 
	{	
		Student student1 = new Student (1, "Güney", "Kuba");
		Adress adress1 = new Adress("Atatürk Cad.","34A", "Albany", "Australia");
		Adress adress2 = new Adress("BigBen Cad.","34A", "London", "UK");
		
		student1.addAdress(adress1);
		student1.addAdress(adress2);
		
		Student student2 = new Student (2, "Buse", "Onay");
		student2.addAdress(new Adress("AbcStreet", "18B", "Istanbul", "Turkey"));
		
		GradStudent gs1 = new GradStudent(3,"Efe","Cavusoglu","QuantumComps");
		gs1.addAdress(adress2);
		
		student1.printInfo();
		student2.printInfo();
		gs1.printInfo();
		
	}

}
