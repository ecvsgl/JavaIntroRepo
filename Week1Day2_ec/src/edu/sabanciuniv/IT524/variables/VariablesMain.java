package edu.sabanciuniv.IT524.variables;

import java.util.Arrays;

public class VariablesMain {
	public static void main(String[] args) {
		//Primitive Types
		int a = 22; // 32 bit
		long b = 222; // 64 bit
		
		float c =100.5f; //32 bit
		double d = 123.78d; //64 bit
		
		short e = 111; // 16 bit
		byte f = 121; // 8 bit, -127 ile +127 ile çalışman gerekli.
		
		char g = 'a'; // 16 bit
		boolean h = true; // 1 bit
		//String primitive değildir.
		//Stringin kapladığı yer belli değil çünkü.
		
		int[] variables = new int [5];
		
		variables[0] = 1;
		variables[1] = 2;
		variables[2] = 3;
		variables[3] = 4;
		variables[4] = 5;
		
		int[] numbers = {10,20,30,40,50};
		
		System.out.println(Arrays.toString(variables) + "\n" + Arrays.toString(numbers));

		//Normal for loop
		System.out.println("Normal for Loop");
		for (int i = 0; i <variables.length; i++) 
		{
			System.out.println(variables[i]);
		}
		//Enhanced for loop
		System.out.println("Enhanced for Loop");
		for (int number : variables) 
		{
			System.out.println(number);
		}
		
	}
}
