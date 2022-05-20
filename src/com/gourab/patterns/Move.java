package com.gourab.patterns;

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
