/**
 * 
 */
package icc.be.poo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Moussa
 *
 */
public class Evenement {
	 
	private String texte;
	private LocalDate dateEvent;
	
	
	
	/**
	 * @param texte
	 * @param string
	 */
	public Evenement(String texte, String dateEvent) {
		super();
		this.texte = texte;
		setDateEvent( dateEvent);
	}
	
	/**
	 * @return the texte
	 */
	public String getTexte() {return texte;}
		
	

	/**
	 * @param texte the texte to set
	 */
	public void setTexte(String texte) {this.texte = texte;}
		
	

	/**
	 * @return the dateEvent
	 */
	public LocalDate getDateEvent() {return dateEvent;}
		
	

	/**
	 * @param dateEvent the dateEvent to set
	 */
	public void setDateEvent(String dateEvent)throws PastDateException {
		LocalDate dateEvmnt=LocalDate.parse(dateEvent);
		long date =LocalDate.now().until(dateEvmnt, ChronoUnit.DAYS);
		if(date<0) {
			throw new PastDateException();
		}else {
			this.dateEvent = dateEvmnt;
		}
	}

	

	@Override
	public String toString() {
		return "Evenement [texte=" + texte + ", dateEvent=" + dateEvent + "]";
	}

}
