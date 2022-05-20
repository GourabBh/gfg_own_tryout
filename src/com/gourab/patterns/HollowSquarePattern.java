package com.gourab.patterns;

public class HollowSquarePattern {
	
	public static void hollowSquare(int row, int col) {
		int a, b;
		for(a = 1; a <= row; a++) {
			for(b = 1;b <= col; b++) {
				if(a == 1 || a == row || b == 1 || b == col) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		hollowSquare(5, 5);
	}
}
