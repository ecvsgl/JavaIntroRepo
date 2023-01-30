package edu.sabanciuniv.it524.exceptionHandling;

public class MainClass2 {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		try {
			s1.tehlikeliMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Student s2 = new Student();
		try {
			s2.tehlike2(); 
		} catch (YeniException e) {
			e.getMessage();
			e.printStackTrace();
		}

	}

}
