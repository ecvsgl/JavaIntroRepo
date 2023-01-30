package edu.sabanciuniv.IT524.domain;

import java.util.ArrayList;

public class Sirket {
	//Fields
	private String sirketAd;
	private long vergiNo;
	private String sahibi;
	private ArrayList<Calisan> calisanlar = new ArrayList<>();
	//Constructors
	public Sirket() {
		super();
	}
	public Sirket(String sirketAd, long vergiNo, String sahibi) {
		super();
		this.sirketAd = sirketAd;
		this.vergiNo = vergiNo;
		this.sahibi = sahibi;
	}
	//Functions
	//Şirket Çalışanları işe alır.
	public void normalCalisanIseAl(String ad, String soyad, String tcKimlikNo) 
	{
		Calisan calisan = new Calisan(ad,soyad,tcKimlikNo);
		this.calisanlar.add(calisan);	
	}
	public void yariZamanliCalisanIseAl(String ad, String soyad, String tcKimlikNo, double haftalikSaat) 
	{
		YariZamanliCalisan calisan = new YariZamanliCalisan(ad,soyad,tcKimlikNo, haftalikSaat);
		this.calisanlar.add(calisan);	
	}
	public void sozlesmeliCalisanIseAl(String ad, String soyad, String tcKimlikNo, int sure, double aylikUcret) 
	{
		SozlesmeliCalisan calisan = new SozlesmeliCalisan(ad,soyad,tcKimlikNo, sure, aylikUcret);
		this.calisanlar.add(calisan);	
	}
	public void calisanlariListele() {
		for (Calisan calisan : this.calisanlar) {
			System.out.println("---> " + calisan);
		}
	}
	//Şirket Çalışanları çalıştırır.
	
	public void calisin() {
		for (Calisan calisan: this.calisanlar) {
			calisan.calis();
		}
	}
	
	
	//Şirket çalışanlara maaş verir.
	
	
	
	//Getters&Setters
	public String getSirketAd() {
		return sirketAd;
	}
	public void setSirketAd(String sirketAd) {
		this.sirketAd = sirketAd;
	}
	public long getVergiNo() {
		return vergiNo;
	}
	public void setVergiNo(long vergiNo) {
		this.vergiNo = vergiNo;
	}
	public String getSahibi() {
		return sahibi;
	}
	public void setSahibi(String sahibi) {
		this.sahibi = sahibi;
	}
	//Overridden Functions
	@Override
	public String toString() {
		return "Sirket [sirketAd=" + sirketAd
				+ ", vergiNo=" + vergiNo +
				", sahibi=" + sahibi + "]";
	}
	public void maasOde() {
		for (Calisan calisan : this.calisanlar) {
			double odenecek = calisan.maasHesapla(); //POLYMORPHISM
			System.out.println(calisan.getAd() + " kişisine maaş gönderildi. Tutar: " +odenecek);
		}
		
		
	}
}
