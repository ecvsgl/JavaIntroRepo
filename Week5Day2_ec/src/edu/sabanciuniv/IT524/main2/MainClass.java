package edu.sabanciuniv.IT524.main2;

import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		int x = new Random().nextInt(100);
		for (int i = 0; i<x ; i++) {
			Student s = new Student ("Student"+i);
		}
		
		Student b = new Student ("a");
		System.out.println(b.count); //ama burda yaratılan obje de countu etkiledi.
		b.count = 555555;
		System.out.println(Student.count); //Statik değişkenlere içinde olduğu class atıfıyla ulaşılabilir.
		Student c = new Student("asdasd");
		System.out.println(c.count);
	}

}
