package edu.sabanciuniv.javaenum;

import java.awt.Color;

public class MainClass {

	public static void main(String[] args) {
		
		Gun gun = Gun.SALI;
		
		if(gun == Gun.SALI)
		{
			System.out.println("Bugün salı");
		}
		
		for (Gun a : Gun.values())
		{
			System.out.println(a);
		}
		
		
		int bugun = 8;//Days.CARSAMBA;
		

	}

}
