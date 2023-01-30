package edu.sabanciuniv.IT524.Laptop;

public class CPU {
	private String clockrate;
	private String corecount;
	
	public CPU(String clockrate, String corecount) {
		this.clockrate = clockrate;
		this.corecount = corecount;
	}

	public String getClockrate() {
		return clockrate;
	}

	public void setClockrate(String clockrate) {
		this.clockrate = clockrate;
	}

	public String getCorecount() {
		return corecount;
	}

	public void setCorecount(String corecount) {
		this.corecount = corecount;
	}
	
	
}
