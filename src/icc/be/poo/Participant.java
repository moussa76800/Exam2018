/**
 * 
 */
package icc.be.poo;

import java.util.ArrayList;

/**
 * @author Moussa
 *
 */
public class Participant extends Person implements Manageable {
       

	/**
	 * 
	 */
	public Participant() {
		super();
	
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param statut
	 */
	public Participant(String nom, String prenom, String statut) {
		super(nom, prenom, statut);
		
	}

	public String getInitials() {
		
		
		char s1 =  getNom().charAt(0) ;  
		char s2 =  getPrenom().charAt(0) ;  
		StringBuilder sb =  new StringBuilder() ;  
		sb.append(s1).append(" ").append(s2) ;  
		String s3 = sb.toString() ;
		return s3;
		
	}

	@Override
       public boolean dropGuest(Participant p) {
        	
		ArrayList<Participant> list = new ArrayList<Participant>();
 	   
	        for(int i=0;i<=list.size();i++) {
        	if(list.contains(p)) {
        		list.remove(i);
        return true;}
            	
       }
	
	    return false;
}

     @Override
       public boolean hasGuest(Participant p) {
    	   ArrayList<Participant> list = new ArrayList<>();
    	   
       	        for(int i=0;i<=list.size();i++) {
                	if(list.contains(p)) {
	            return true;}
                    	
               }
				return false;	 	
       }
        
    
	
	
	
	
	@Override
	public String toString() {
		return "Participant [getInitials()=" + getInitials() + "]";
	
	
	
	}	


	

	
	
		
}

	

	
	
