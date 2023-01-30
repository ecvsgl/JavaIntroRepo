package edu.sabanciuniv.it524;

public class Araba extends TrafikIsigiBekleyicisi{
	
	private String sahibi;

	public Araba(String sahibi) {
		super();
		this.sahibi = sahibi;
	}

	public void git()
	{
		System.out.println(this.sahibi + "nin Arabası gidiyor");
	}

	public void dur()
	{
		System.out.println(this.sahibi + "nin Arabası durdu");
	}
	
	
	
	

}
