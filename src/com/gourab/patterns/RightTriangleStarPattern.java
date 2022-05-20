package com.gourab.patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RightTriangleStarPattern {
	
	public static void rightTriangle(int n) {
		int a, b;
		for(a = 1; a <= n; a++) {
			for(b = 1; b <= a; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		try {
			System.out.print("Enter a number: ");
			int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
			rightTriangle(n);
		} catch (NumberFormatException e) {
			System.out.println("Exception - NumberFormat : "+e.getMessage());
		} catch (IOException e) {
			System.out.println("General Exception : "+ e.getMessage());
		}
	}
}
