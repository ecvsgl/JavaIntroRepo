package edu.sabanciuniv.IT524.domain;

public class SozlesmeliCalisan extends Calisan {
	private int sozlesmeSuresi;
	private double aylikOdeme;
	
	public SozlesmeliCalisan() {
		super();
	}

	public SozlesmeliCalisan(String ad, String soyad, String tcKimlikNo, int sure, double aylikUcret) {
		super(ad, soyad, tcKimlikNo);
		this.sozlesmeSuresi=sure;
		this.aylikOdeme=aylikUcret;
	}

	public int getSozlesmeSuresi() {
		return sozlesmeSuresi;
	}

	public void setSozlesmeSuresi(int sozlesmeSuresi) {
		this.sozlesmeSuresi = sozlesmeSuresi;
	}

	public double getAylikOdeme() {
		return aylikOdeme;
	}

	public void setAylikOdeme(double aylikOdeme) {
		this.aylikOdeme = aylikOdeme;
	}

	@Override
	public String toString() {
		return "SozlesmeliCalisan [" + this.genelBilgi() + ", SozlesmeSuresi=" + this.sozlesmeSuresi + ", AylikUcret=" + this.aylikOdeme  +"]";

	}

	@Override
	public double maasHesapla() {
		double maas = aylikOdeme ;
		return maas;
	}


	
	
}
