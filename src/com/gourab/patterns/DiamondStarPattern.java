package com.gourab.patterns;

/**
 * 
 * @author Gourab Bhattacharjee
 * <p>
 * This program prints a diamond pattern without printing the longest length twice.
 * <p>
 */

public class DiamondStarPattern {

	public static void diamond(int n) {
		int a, b, space;
		for (a = 1; a <= n; a++) {
			for (space = a; space < n; space++) {
				System.out.print(" ");
			}
			for (b = 1; b <= a; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		if (a-1 == n) {
			for (a = 1; a <= n - 1; a++) {
				for (space = 1; space < a; space++) {
					System.out.print(" ");
				}
				for (b = a; b <= n - 1; b++) {
					System.out.print(" *");
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		diamond(5);
	}
}
