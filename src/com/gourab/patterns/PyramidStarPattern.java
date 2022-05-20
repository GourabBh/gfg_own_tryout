package com.gourab.patterns;

public class PyramidStarPattern {
	
	public static void pyramid(int n) {
		int a, b, space;
		for(a = 1; a <= n; a++) {
			for(space = a; space < n; space++) {
				System.out.print(" ");
			}
			for(b = 1;b <= a; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int n = 5;
		pyramid(n);
	}
}
