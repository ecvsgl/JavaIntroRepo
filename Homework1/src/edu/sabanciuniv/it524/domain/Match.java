package edu.sabanciuniv.it524.domain;

public class Match {
	//Datafields
	private String matchDate;
	private Team homeTeam;
	private Team visitorTeam;
	private int homeScore;
	private int visitorScore;
	private Referree referree;
	private String stadium;
	private Narrator narrator;
	//Constructors
	public Match() {
	}	
	public Match(String matchDate, Team homeTeam, Team visitorTeam, int homeScore, int visitorScore, Referree referree,
			String stadium, Narrator narrator) {
		this.matchDate = matchDate;
		this.homeTeam = homeTeam;
		this.visitorTeam = visitorTeam;
		this.homeScore = homeScore;
		this.visitorScore = visitorScore;
		this.referree = referree;
		this.stadium = stadium;
		this.narrator = narrator;
	}
	//Methods
	
	//Getters&Setters
	public String getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}
	public Team getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}
	public Team getVisitorTeam() {
		return visitorTeam;
	}
	public void setVisitorTeam(Team visitorTeam) {
		this.visitorTeam = visitorTeam;
	}
	public int getHomeScore() {
		return homeScore;
	}
	public void setHomeScore(int homeScore) {
		this.homeScore = homeScore;
	}
	public int getVisitorScore() {
		return visitorScore;
	}
	public void setVisitorScore(int visitorScore) {
		this.visitorScore = visitorScore;
	}
	public Referree getReferree() {
		return referree;
	}
	public void setReferree(Referree referree) {
		this.referree = referree;
	}
	public String getStadium() {
		return stadium;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	public Narrator getNarrator() {
		return narrator;
	}
	public void setSpectators(Narrator narrator) {
		this.narrator = narrator;
	}
}
