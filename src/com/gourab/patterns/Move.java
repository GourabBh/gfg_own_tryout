package com.gourab.patterns;
/**
 * 
 * @author Gourab Bhattacharjee
 * <p>
 * Enum for moves
 * <p>
 */
public enum Move {
	
	RIGHT('R'),
	LEFT('L'),
	UP('U'),
	DOWN('D');
	
	private char code;
	
	private Move(char code) {
		this.code = code;
	}

	public char getCode() {
		return code;
	}

	public void setCode(char code) {
		this.code = code;
	}
	
}
