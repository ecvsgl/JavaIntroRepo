package edu.sabanciuniv.it524.domain;

public class Narrator {
	//Datafields
	private String name;
	private String surname;
	private String channelName;
	//Constructors
	public Narrator() {
	}
	public Narrator(String name, String surname, String channelName) {
		this.name = name;
		this.surname = surname;
		this.channelName = channelName;
	}
	//Methods
	public void preGameAnnoucement() {
		System.out.println(this.name+" "+this.surname+": "+"Welcome to the 2022 World Cup Final Match at Lusail Stadium of Qatar!\n\n"+this.name+" "+this.surname+": "+"This stream is brought to you by " +this.channelName+".\n");
	}
	public void startAnnoucement() {
		System.out.println(this.name+" "+this.surname+": "+"And the match has begun! Looks like our referee already has a favorite..\n");
	}
	public void goalAnnouncement() {
		System.out.println(this.name+" "+this.surname+": "+"GOOOOOOOOOOOOOOOOOOOOOOOOAL!\n");
	}
	public String failedAttemptAnnouncement() {
		return this.name+" "+this.surname+": "+"Attack Failed!! Better luck next time ";
	}
	public void boringAnnouncement() {
		System.out.println(this.name+" "+this.surname+": "+"Looks like none of the teams want the cup.. NO ATTACK FOR AN ENTIRE MINUTE!?\n");	
	}
	public String goalSavingAnnoucement() {
		return this.name+" "+this.surname+": "+"Brilliant save by ";
	}
	public String firstHalfOverAnnouncement() {
		return "----------\n"+this.name+" "+this.surname+": "+"And the first half of the match is over!"+"\n----------\n"+"First Half Score is: ";
	}
	public String matchFinishAnnouncement() {
		return "----------\n"+this.name+" "+this.surname+": "+"The Match is over!"+"\n----------\n"+"Score is: ";
	}
	public String winnerAnnoucement() {
		return " is the 2022 World Cup Champion!";
	}
	public String drawAnnouncement() {
		return this.name+" "+this.surname+": "+"It looks we have a... DRAW?! I am taking this cup with me.. NONE OF YOU ARE NOT WORTHY.";
	}
	//Getters&Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
}
