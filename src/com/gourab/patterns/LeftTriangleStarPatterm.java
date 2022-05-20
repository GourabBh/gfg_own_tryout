package com.gourab.patterns;

public class LeftTriangleStarPatterm {
	
	private static void leftTriangle(int n) {
		int a, b, space;
		for(a = n; a >= 1; a--) {
			for(space = 1; space < a; space++) {
				System.out.print("  ");
			}
			for(b = a; b <= n; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		leftTriangle(5);
	}

}
