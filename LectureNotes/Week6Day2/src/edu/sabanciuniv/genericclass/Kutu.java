package edu.sabanciuniv.genericclass;

public class Kutu {
	
	private Object deger;
	
	
	public void kutuyaEkle(Object yeniDeger)
	{
		this.deger = yeniDeger;
	}
	
	public void kutudanSil() {
		
		this.deger = null;
		
	}
	
	public Object kutudaNevar()
	{
		return this.deger;
	}

}
