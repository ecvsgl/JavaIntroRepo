package edu.sabanciuniv.it524.domain;

public class House implements Insurable{
	
	private String owner; //Şu haliyle kötü design. Her yerde owner tanımlamak tekrar tekrar saçma yani.
	
	public House(String name) {
		
		//Bunu daha önce başka bir classta yaptık.
		//Bu yüzden, tüm Owner bilgisi olan classları ASSET adlı bir classtan türetebiliriz.
		//Yani, vehicle ve insureable extends asset olsa iyi olur.
		
		this.owner = name;
	}

	@Override
	public void getInsured() {
		System.out.println(this.getOwner() + "'s House is insured.");		
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}
