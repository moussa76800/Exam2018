/**
 * 
 */
package icc.be.poo;

/**
 * @author Moussa
 *
 */
public class PastDateException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6036931600043320873L;

	/**
	 * 
	 */
	public PastDateException() {
		super("error,la date est dépassée");
		
	}
        
}
