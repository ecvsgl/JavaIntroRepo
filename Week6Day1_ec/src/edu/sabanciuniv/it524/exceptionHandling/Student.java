package edu.sabanciuniv.it524.exceptionHandling;

public class Student {
	private String name;
	private String lastName;
	
	public int tehlikeliMethod() throws Exception{
		return 1;
	}
	
	public void tehlike2() throws YeniException{
		throw new YeniException("Olmadı");
	}
}
