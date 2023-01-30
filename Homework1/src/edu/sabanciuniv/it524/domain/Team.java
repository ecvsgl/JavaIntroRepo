package edu.sabanciuniv.it524.domain;

public class Team {
	//Datafields
	private String teamName;
	private int teamEstb;
	private String hometown;
	private int champNo;
	private Coach actingCoach;
	private Player[] roster;
	private boolean defenceSuccess;
	private boolean attackSuccess;
	//Constructors
	public Team() {
	}
	public Team(String teamName, int teamEstb, String hometown, int champNo, Coach actingCoach, Player[] roster, boolean defenceSuccess, boolean attackSuccess) {
		this.teamName = teamName;
		this.teamEstb = teamEstb;
		this.hometown = hometown;
		this.champNo = champNo;
		this.actingCoach = actingCoach;
		this.roster = roster;
		this.defenceSuccess = defenceSuccess;
		this.attackSuccess = attackSuccess;
	}
	//Methods
	
	//Getters&Setters
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getTeamEstb() {
		return teamEstb;
	}
	public void setTeamEstb(int teamEstb) {
		this.teamEstb = teamEstb;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public int getChampNo() {
		return champNo;
	}
	public void setChampNo(int champNo) {
		this.champNo = champNo;
	}
	public Coach getActingCoach() {
		return actingCoach;
	}
	public void setActingCoach(Coach actingCoach) {
		this.actingCoach = actingCoach;
	}
	public Player[] getRoster() {
		return roster;
	}
	public void setRoster(Player[] roster) {
		this.roster = roster;
	}
	public boolean isDefenceSuccess() {
		return defenceSuccess;
	}
	public void setDefenceSuccess(boolean defenceSuccess) {
		this.defenceSuccess = defenceSuccess;
	}
	public boolean isAttackSuccess() {
		return attackSuccess;
	}
	public void setAttackSuccess(boolean attackSuccess) {
		this.attackSuccess = attackSuccess;
	}	
}
