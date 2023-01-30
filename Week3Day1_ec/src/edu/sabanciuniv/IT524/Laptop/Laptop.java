package edu.sabanciuniv.IT524.Laptop;

public class Laptop {
	private Disc ssd; //Kapasite -- Marka
	private CPU processor; // Hizi - Cekirdek Sayisi
	private RAM memory; // Kapasitesi
	private String brand;
	
	public Laptop(String brand,Disc ssd, CPU processor, RAM memory) {
		this.brand = brand;
		this.ssd = ssd;
		this.processor = processor;
		this.memory = memory;
	}

	public Disc getSsd() {
		return ssd;
	}

	public void setSsd(Disc ssd) {
		this.ssd = ssd;
	}

	public CPU getProcessor() {
		return processor;
	}

	public void setProcessor(CPU processor) {
		this.processor = processor;
	}

	public RAM getMemory() {
		return memory;
	}

	public void setMemory(RAM memory) {
		this.memory = memory;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
