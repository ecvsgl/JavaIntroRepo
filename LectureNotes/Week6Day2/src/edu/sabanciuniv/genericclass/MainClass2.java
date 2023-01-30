package edu.sabanciuniv.genericclass;

public class MainClass2 {

	public static void main(String[] args) {
	
		//Box class ı bir "Generic Class" tır
		Box<Student>  stuBox = new Box<>();
	
		Student s = new Student("Albert","aaa");
		stuBox.kutuyaEkle(s);
		
		Student s2 = stuBox.kutudaNevar();
		
		
		Box<Integer> intBox = new Box<>();
		
		intBox.kutuyaEkle(123);
	
		int x = intBox.kutudaNevar();

	}

}
