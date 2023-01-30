package edu.sabanciuniv.it524;

public abstract class TrafikIsigiBekleyicisi {

	public abstract void git();
	public abstract void dur();
	
	public void isigaBak(TrafikIsigi trafikIsigi) {
			
			trafikIsigi.isigaBakanlaraEkle(this);
			
			
		}
}
