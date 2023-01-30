package edu.sabanciuniv.it524.exceptionHandling;

public class Calculator {

	public int bolme(int x, int y) throws YeniException
	{
		if (x ==1 || y ==1) 
		{
			throw new YeniException("Bölmem!!!!!!!!");
		}
		
		return x/y;
	}
}
