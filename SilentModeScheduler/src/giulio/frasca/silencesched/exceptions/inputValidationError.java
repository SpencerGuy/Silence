package giulio.frasca.silencesched.exceptions;

public class inputValidationError extends Exception{

	private String message;
	
	/**
	 * Standard Constructor
	 * @param m - the message this exception contains
	 */
	public inputValidationError(String m) {
		this.message=m;
	}
	
	/**
	 * Gets the message this exception contains
	 * 
	 * @return this exception's message
	 */
	public String getMessage(){
		return message;
	}

	
	private static final long serialVersionUID = 1L;

}
