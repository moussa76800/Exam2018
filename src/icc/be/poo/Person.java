/**
 * 
 */
package icc.be.poo;

/**
 * @author Moussa
 *
 */
public abstract class Person {
	private String nom;
	private String prenom;
	private String statut;
		
	
	/**
	 * 
	 */
	public Person() {}


	/**
	 * @param nom
	 * @param prenom
	 * @param statut
	 */
	public Person(String nom, String prenom, String statut) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.statut = statut;
	}	
	
	/**
	 * @return the nom
	 */
	public String getNom() {return nom;}
		
	
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {this.nom = nom;}
		
	
	/**
	 * @return the prenom
	 */
	public String getPrenom() {return prenom;}
		
	
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {this.prenom = prenom;}
		
	
	/**
	 * @return the statut
	 */
	public String getStatut() {return statut;}
		
	
	/**
	 * @param statut the statut to set
	 */
	public void setStatut(String statut) {this.statut = statut;}
		
	

   /**
    *   methode getInitials : 
 * @return 
    */

   public abstract String getInitials();



@Override
public String toString() {
	return "Person [nom=" + nom + ", prenom=" + prenom + ", statut=" + statut + "]";
}
}