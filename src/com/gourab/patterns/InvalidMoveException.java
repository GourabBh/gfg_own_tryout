package com.gourab.patterns;
/**
 * 
 * @author Gourab Bhattacharjee
 *	Simple exception class to determine an invalid 'move' in a spiral matrix
 */


public class InvalidMoveException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8180191286277406004L;

	/**
	 * 
	 * @param message
	 */
	public InvalidMoveException(String message) {
		super(message);
	}
	
	/**
	 * 
	 * @param cause
	 */
	public InvalidMoveException(Throwable cause) {
		super(cause);
	}
	
	/**
	 * 
	 * @param message
	 * @param cause
	 */
	public InvalidMoveException(String message, Throwable cause) {
		super(message, cause);
	}

}
