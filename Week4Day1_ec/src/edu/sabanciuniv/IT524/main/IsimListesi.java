package edu.sabanciuniv.IT524.main;

public class IsimListesi {
		
	private int index = 0;
	
	private String [] isimler  = new String[4];

		public void isimEkle(String isim) 
		{
			if(index<isimler.length) 
			{
				System.out.println(isim + " " + index+ " nolu Index'e eklenecektir.");
				isimler[index]=isim;
				index++;
			}
			else 
			{
				String [] newArray = new String[isimler.length+4];
				for (int x=0; x<this.isimler.length;x++) 
				{
					newArray[x] = this.isimler[x];
				}
				this.isimler = newArray;
				System.out.println(isim + " " + index+ " nolu Index'e eklenecektir.");
				isimler[index]=isim;
				index++;
			}
		}
		
		public void listeyiGoster() {
			for (int i=0; i<this.isimler.length;i++){
				System.out.println(i+" ----> "+isimler[i]);
			}
		}
	}
