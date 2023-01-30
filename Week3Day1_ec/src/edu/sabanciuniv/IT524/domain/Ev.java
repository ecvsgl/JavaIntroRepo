package edu.sabanciuniv.IT524.domain;

public class Ev {
	private String sahibi;
	private Kapi kapi;
	private Pencere sagPencere;
	private Pencere solPencere;
	
	public Ev (String sahibi){
		this.sahibi = sahibi;
	}

	
	public void bilgileriGoster() {
		System.out.println("-----------------");
		System.out.println("Sahibi:"+sahibi);
		System.out.println("-----------------");
	}


	public Kapi getKapi() {
		return kapi;
	}


	public void setKapi(Kapi kapi) {
		this.kapi = kapi;
	}
	
	
	
}
