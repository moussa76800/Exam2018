/**
 * 
 */
package icc.be.poo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * @author Moussa
 *
 */
public class Meeting extends Evenement {
	private String lieu;
	private ArrayList<Participant>participants;
	
	
	/**
	 * @param texte
	 * @param string
	 */
	public Meeting(String texte, String dateEvent,String lieu) {
		super(texte, dateEvent);
	     this.lieu=lieu;
	     this.participants=new ArrayList<>();
	}

	
	/**
	 * @return the lieu
	 */
	public String getLieu() {
		return lieu;
	}


	/**
	 * @param lieu the lieu to set
	 */
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}


	/**
	 * @return the participants
	 */
	public ArrayList<Participant> getParticipants() {
		return participants;}
	

	/**
	 * @param participants the participants to set
	 */
	public void setParticipants(ArrayList<Participant> participants) {
		this.participants = participants;}
	

	public ArrayList<Participant> getVip() {
		ArrayList<Participant>list=new ArrayList<>();
	    for(int i=0;i<=list.size();i++) {
        	String statut = "vip";
			if(list.contains(statut)) {
        	return list;}	
        	}
		return list;
}

	 public void toXMLFile(Meeting meet, String  filename) throws IOException {
		 XStream xs = new XStream(new DomDriver());
		 
		xs.alias("date", Meeting.class);
		xs.addImplicitArray(Meeting.class, "participant", "participant");
		xs.useAttributeFor(Meeting.class,"dateEvent");
		try {
			xs.toXML(meet,new FileWriter(filename));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	 }
		public Meeting fromXMLFile(String filename) {
			XStream xs = new XStream();
			
			//Configurer XStream
			xs.alias("date", Meeting.class);
			xs.addImplicitArray(Meeting.class, "participant", "participant");
			xs.useAttributeFor(Meeting.class,"dateEvent");
			
			//Lecture du fichier texte et conversion en Objet
			return (Meeting) xs.fromXML(new File(filename));
		
     }
	
	 
	 
	@Override
	public String toString() {
		return "Meeting [lieu=" + lieu + ", participant=" + participants + "]";}
	

	
	
     
}

