package icc.be.poo;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;



public class Test {

	public static void main(String[] args) {
		
		
		 Meeting championnat=new Meeting("Champions league","23/06/2020","Normandie");
		 ArrayList<Participant> joueur = new ArrayList<>();
		 
		 Person p = new Participant("Alain","Souchon","vip");	
		 Person p1 = new Participant("youssef","Chennou","normal");		
		 Person p2 = new Participant("lili","Dupont","normal");
		 Person p3 = new Participant("liliane","Dalanoe","vip");
		 
		 joueur.add((Participant) p);
		 joueur.add((Participant) p1);
		 joueur.add((Participant) p2);
		 joueur.add((Participant) p3);
		 
		 championnat.getParticipants().add((Participant) p);
		 championnat.getParticipants().add((Participant) p1);
		 championnat.getParticipants().add((Participant) p2);
		 championnat.getParticipants().add((Participant) p3);  
		    
		 try {
				championnat.toXMLFile(championnat, "data\\championnat.xml");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println(championnat);
			
			//Suppression du site
			championnat = null;
		
			//Récupération du site
			championnat = championnat.fromXMLFile("data\\championnat.xml");
			
			System.out.println(championnat);  
	}

}
