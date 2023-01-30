package edu.sabanciuniv.genericclass;

public class Box<T> {
	
	private T deger;
	
	
	public void kutuyaEkle(T yeniDeger)
	{
		this.deger = yeniDeger;
	}
	
	public void kutudanSil() {
		
		this.deger = null;
		
	}
	
	public T kutudaNevar()
	{
		return this.deger;
	}

}
