package com.gourab.patterns;

public class ReversePyramidStarPattern {
	
	public static void reversePyramid(int n) {
		int a, b, space;
		for(a = 1; a <= n; a++) {
			for(space = 1; space < a; space++) {
				System.out.print(" ");
			}
			for(b = a; b <= n; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
		
	public static void main(String[] args) {
		reversePyramid(5);
	}

}
