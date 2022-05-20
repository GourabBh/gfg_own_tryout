package com.gourab.patterns;
/**
 * 
 * @author Gourab Bhattacharjee
 *
 */

public class NegativeInputException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6469659251141416830L;
	/**
	 * 
	 * @param message
	 */
	public NegativeInputException(String message) {
		super(message);
	}
	
	/**
	 * 
	 * @param message
	 * @param cause
	 */
	public NegativeInputException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * 
	 * @param cause
	 */
	public NegativeInputException(Throwable cause) {
		super(cause);
	}
}
