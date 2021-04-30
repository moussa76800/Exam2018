package icc.be.poo;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestMeeting {

	@Test
	void test() {
		
		Meeting championnat=new Meeting("Champions league","23 Juin 2020","Normandie");
		 ArrayList<Participant> joueur = new ArrayList<>();
		 
		 //----PREPARATION----
		 Person p = new Participant("Souchon","Alain","vip");	
		 Person p1 = new Participant("Chennou","youssef","normal");		
		 Person p2 = new Participant("Dupont","lili","normal");
		 Person p3 = new Participant("Delanoe","liliane","vip");
		 
		 
		 //----UTILISATION----
		 joueur.add((Participant) p);
		 joueur.add((Participant) p1);
		 joueur.add((Participant) p2);
		 joueur.add((Participant) p3);
		 
		 championnat.getParticipants().add((Participant) p);
		 championnat.getParticipants().add((Participant) p1);
		 championnat.getParticipants().add((Participant) p2);
		 championnat.getParticipants().add((Participant) p3);  
		   
		 //----Verifiaction----
		 assertEquals("Europa League", championnat.getTexte());
	     assertEquals(LocalDate.parse("23 Juin 2020"), championnat.getDateEvent());
	     assertEquals("Lemonnier", championnat.getLieu());
	     assertEquals(4,championnat.getParticipants());
	     assertEquals(4,championnat.getParticipants().size());
	     assertEquals("Alain",p.getNom());
	     assertEquals("vip",p3.getStatut());
	     
	     assertNotNull(championnat.getParticipants());
	     assertNotEquals("Souchon",p.getPrenom()); 

		
		
	}

}
