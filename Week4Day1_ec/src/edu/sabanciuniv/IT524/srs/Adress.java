package edu.sabanciuniv.IT524.srs;

public class Adress {
	private String street;
	private String doorNumber;
	private String city;
	private String country;
	
	public Adress() {
		
	}
	public Adress(String street, String doorNumber, String city, String country) {
		this.street = street;
		this.doorNumber = doorNumber;
		this.city = city;
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
