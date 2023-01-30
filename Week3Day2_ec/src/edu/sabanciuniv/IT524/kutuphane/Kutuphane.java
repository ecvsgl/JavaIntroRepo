package edu.sabanciuniv.IT524.kutuphane;

public class Kutuphane {
	
	private String kutuphaneAd;
	private Kitap[] raf = new Kitap[5];
	private int kitapSayisi=0;
	
	public Kutuphane(String kutuphaneAd) 
	{
		this.kutuphaneAd = kutuphaneAd;
	}

	public void kitapEkle(Kitap yeniKitap) 
	{
		if(this.raf.length==kitapSayisi) 
		{
			//System.out.println("Kitap Eklenemez");
			//return;
			dahaBuyukBirRafAl();
		}
		this.raf[kitapSayisi]=yeniKitap;
		this.kitapSayisi ++;
		System.out.println("Kitap Eklendi");
	}
	private void dahaBuyukBirRafAl() {
		Kitap[] dahaBuyukRaf = new Kitap[kitapSayisi+5];
		System.out.println("Yeni raf alındı.");
		for (int i = 0 ; i<this.raf.length;i++) 
		{
			dahaBuyukRaf[i] = this.raf[i];
		}
		System.out.println("Kitaplar yeni rafa aktarıldı.");
		this.raf=dahaBuyukRaf;
		System.out.println("Yeni raf kullanılmaya başlandı.");
	}

	public void kacKitapVar() 
	{
		this.raf[0].getAd();
		System.out.println("Kitap Sayısı: "+this.kitapSayisi);
	}
	public void hangiKitaplarVar() {
		for (Kitap k: this.raf) 
		{
			if (k!=null) {
				System.out.println(k.getAd());				
			}
		}
	}
}
