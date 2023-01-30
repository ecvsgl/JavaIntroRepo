package edu.sabanciuniv.it524.main;

import edu.sabanciuniv.it524.domain.*;
import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
	Referree referree = new Referree ("Syzmon", "Marciniak", 41, true);
	Narrator narrator = new Narrator ("Hunkar", "Mutlu", "Trt");
	
	//Team France Generation
	Goalie frGoalie = new Goalie ("Hugo", "Lloris", 1, 35, 0, true, true,false);
	
	Defender frDef1 = new Defender("Jules", "Kounde", 5, 24, "left defender");
	Defender frDef2 = new Defender("Raphael", "Varane", 4, 29, "left-center defender");
	Defender frDef3 = new Defender("Dayot", "Upamecano", 18, 24, "right-center defender");
	Defender frDef4 = new Defender("Theo", "Hernandez", 22, 25, "right defender");
	
	Midfielder frMid1 = new Midfielder("Aurelien", "Tchouameni", 8, 22, "left midfielder");
	Midfielder frMid2 = new Midfielder("Adrien", "Rabiot", 14, 27,"right midfielder");
	
	Forward frFor1 = new Forward("Ousmane", "Dembele", 11, 25, "left forward", 0);
	Forward frFor2 = new Forward("Antoine", "Griezmann", 7, 31, "mid forward", 0);
	Forward frFor3 = new Forward("Kylian", "Mbappe", 10, 23, "right forward", 0);
	Forward frFor4 = new Forward("Olivier", "Giroud", 9, 36, "advance forward", 0);

	Player[] frRoster = new Player[] {frGoalie, frDef1, frDef2, frDef3, frDef4, frMid1, frMid2, frFor1, frFor2, frFor3, frFor4};
	
	Coach frCoach = new Coach("Didier", "Deschamps", 46, 17, true);
	
	Team teamFrance = new Team("France", 1904, "Paris, France", 8, frCoach, frRoster, false, false);
	
	//Team Argentina Generation
	Goalie arGoalie = new Goalie("Emiliano", "Martinez", 23, 36, 0, true, true,false);
	
	Defender arDef1 = new Defender("Nahuel", "Molina", 26, 24, "left defender");
	Defender arDef2 = new Defender("Cristian", "Romero", 13, 24, "left-center defender");
	Defender arDef3 = new Defender("Nicolas", "Otamendi", 19, 34, "right-center defender");
	Defender arDef4 = new Defender("Nicolas", "Tagliafico", 3, 30, "right defender");
	
	Midfielder arMid1 = new Midfielder("Rodrigo", "De Paul", 7, 28, "left midfielder");
	Midfielder arMid2 = new Midfielder("Enzo", "Fernandez", 24, 21, "centermidfielder");
	Midfielder arMid3 = new Midfielder("Alexis", "Mac Allister", 20, 23, "right midfielder");
	
	Forward arFor1 = new Forward("Lionel", "Messi", 10, 35, "left forward", 0);
	Forward arFor2 = new Forward("Julian", "Alvarez", 9, 22, "center forward", 0);
	Forward arFor3 = new Forward("Angel", "di Maria", 11, 34, "right forward", 0);
	
	Player[] arRoster = new Player[] {arGoalie, arDef1, arDef2, arDef3, arDef4, arMid1, arMid2, arMid3, arFor1, arFor2, arFor3};
	
	Coach arCoach = new Coach("Lionel", "Scaloni", 27, 4, true);
	
	Team teamArgentina = new Team("Argentina", 1867, "Buenos Aires, Argentina", 19, arCoach, arRoster, false, false);
	
	//Match creation
	Match finalMatch = new Match("18 December 2022", teamFrance, teamArgentina, 0, 0, referree, "Lusail Stadium", narrator);
	
	//Match time!
	narrator.preGameAnnoucement();
	referree.startMatch();
	narrator.startAnnoucement();
	
	Random isArgentinaAttacking = new Random(); //Randomization of attacks
	Random isFranceAttacking = new Random(); 	
	boolean arAttacking;
	boolean frAttacking;
	
	for (int half=1; half<3; half++) 
	{ //2 Loops for each half of the Match.
		for (int i=0; i<45; i++) 
		{
			arAttacking = isArgentinaAttacking.nextBoolean();
			frAttacking = isFranceAttacking.nextBoolean();
			if(arAttacking) 
			{
				teamArgentina.setAttackSuccess(arFor1.strike());
				teamFrance.setDefenceSuccess(frDef1.defend());
				
				if (teamArgentina.isAttackSuccess() == true && teamFrance.isDefenceSuccess() == false) 
				{
					teamFrance.setDefenceSuccess(frGoalie.goalDefend());
					if (teamFrance.isDefenceSuccess()) 
					{
						System.out.println(narrator.goalSavingAnnoucement()+frGoalie.getName()+" "+frGoalie.getSurname()+"\n");
					}
					else
					{
						narrator.goalAnnouncement();
						finalMatch.setHomeScore(finalMatch.getHomeScore()+1); 
						System.out.println(teamArgentina.getTeamName()+" scores a GOAL!\n");
						System.out.println("Match Score is ---> "+teamArgentina.getTeamName()+" :"+finalMatch.getHomeScore()+" --- "+teamFrance.getTeamName()+" :"+finalMatch.getVisitorScore()+"\n");
					}
				} 
				else 
				{
					System.out.println(narrator.failedAttemptAnnouncement()+teamArgentina.getTeamName()+"\n");
				}
			}
			if(frAttacking) 
			{
				teamFrance.setAttackSuccess(frFor1.strike());
				teamArgentina.setDefenceSuccess(arDef1.defend());
				
				if (teamFrance.isAttackSuccess() == true && teamArgentina.isDefenceSuccess() == false) 
				{
					teamArgentina.setDefenceSuccess(arGoalie.goalDefend());
					if (teamArgentina.isDefenceSuccess()) 
					{
						System.out.println(narrator.goalSavingAnnoucement()+arGoalie.getName()+" "+arGoalie.getSurname()+"\n");
					}
					else
					{
						narrator.goalAnnouncement();
						finalMatch.setVisitorScore(finalMatch.getVisitorScore()+1); 
						System.out.println(teamFrance.getTeamName()+" scores a GOAL!\n");
						System.out.println("Match Score is ---> "+teamArgentina.getTeamName()+" :"+finalMatch.getHomeScore()+" --- "+teamFrance.getTeamName()+" :"+finalMatch.getVisitorScore()+"\n");
					}
				}
				else 
				{
					System.out.println(narrator.failedAttemptAnnouncement()+teamFrance.getTeamName()+"\n");
				}
			}
			if (arAttacking == false && frAttacking == false)
			{
				narrator.boringAnnouncement();
				if (finalMatch.getHomeScore()>finalMatch.getVisitorScore()) {
					teamFrance.getActingCoach().yellAtPlayers();
				} 
				else if(finalMatch.getVisitorScore()>finalMatch.getHomeScore()) {
					teamArgentina.getActingCoach().yellAtPlayers();
				}
			}	
		}
		if (half == 1) 
		{
			referree.declareTimeout();
			System.out.println(narrator.firstHalfOverAnnouncement()+teamArgentina.getTeamName()+" :"+finalMatch.getHomeScore()+" --- "+teamFrance.getTeamName()+" :"+finalMatch.getVisitorScore()+"\n");				
		}
		else if (half == 2) 
		{
			referree.declareTimeout();
			System.out.println(narrator.matchFinishAnnouncement()+teamArgentina.getTeamName()+" :"+finalMatch.getHomeScore()+" --- "+teamFrance.getTeamName()+" :"+finalMatch.getVisitorScore()+"\n");
		}
	}
	
	if (finalMatch.getHomeScore()>finalMatch.getVisitorScore()) 
	{
		System.out.println(teamArgentina.getTeamName()+narrator.winnerAnnoucement());	
	}
	else if (finalMatch.getVisitorScore()>finalMatch.getHomeScore()) 
	{
		System.out.println(teamFrance.getTeamName()+narrator.winnerAnnoucement());	
	} 
	else if (finalMatch.getHomeScore()==finalMatch.getVisitorScore()) 
	{
		narrator.drawAnnouncement();
	}
	}
}
