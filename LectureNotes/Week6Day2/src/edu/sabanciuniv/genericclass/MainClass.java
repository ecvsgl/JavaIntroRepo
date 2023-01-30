package edu.sabanciuniv.genericclass;

public class MainClass {

	public static void main(String[] args) {
		
		Kutu kutu1 = new Kutu();
		kutu1.kutuyaEkle(333);
		System.out.println(kutu1.kutudaNevar());
		kutu1.kutudanSil();
		System.out.println(kutu1.kutudaNevar());
		
		
		
		Kutu kutu2 = new Kutu();
		kutu2.kutuyaEkle("ahmet");
		System.out.println(kutu2.kutudaNevar());
		kutu2.kutudanSil();
		System.out.println(kutu2.kutudaNevar());
		
		
		Student student = new Student("Ali", "Desidero");
				
				
		Kutu kutu3 = new Kutu();
		kutu3.kutuyaEkle(student);
		
		System.out.println(kutu3.kutudaNevar());
		kutu3.kutudanSil();
		System.out.println(kutu3.kutudaNevar());
		
		
		kutu3.kutuyaEkle(new Student("Albert", "Einstein"));
		
		Student s = (Student)kutu3.kutudaNevar();
		
		System.out.println(s.getLastname());
		

	}

}
