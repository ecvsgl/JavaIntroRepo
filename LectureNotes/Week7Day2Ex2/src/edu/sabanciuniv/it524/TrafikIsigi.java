package edu.sabanciuniv.it524;

import java.util.ArrayList;
import java.util.List;

public class TrafikIsigi {
	
	private List<TrafikIsigiBekleyicisi> isigaBakanlar = new ArrayList<>();
	
	private String renk;

	public TrafikIsigi(String renk) {
		super();
		this.renk = renk;
	}

	public void yesilOl() {
		this.renk = "Yeşil";
		for(TrafikIsigiBekleyicisi bekleyen : this.isigaBakanlar)
		{
			bekleyen.git();
		}
		
	}

	public void kirmiziOl() {
		this.renk = "Kırmızı";
		for(TrafikIsigiBekleyicisi bekleyen : this.isigaBakanlar)
		{
			bekleyen.dur();
		}
	}

	public void isigaBakanlaraEkle(TrafikIsigiBekleyicisi bekleyen) {
		this.isigaBakanlar.add(bekleyen);
		
	}
	
	

}
