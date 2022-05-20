package com.gourab.patterns;

/**
 * @author Gourab Bhattacharjee
 * <p>
 * This program prints a Pascal's triangle taking an user input
 * <p>
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PascalTrianglePattern {
	
	public static int factorial(int n) {
		if(n < 0) {
			throw new NegativeInputException("Negative integer not allowed! ");
		}
		if(n == 1 || n == 0) {
			return 1;
		}
		else {
			return n * factorial(n - 1);
		}
	}
	
	public static void pascalTriangle(int n) {
		int a, b, space;
		for(a = 0; a <= n; a++) {
			for(space = 0; space < n - a; space++) {
				System.out.print(" ");
			}
			
			for(b = 0; b <= a; b++) {
				System.out.print((factorial(a)/(factorial(b) * factorial(a - b)))+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int n;
		try {
			n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
			pascalTriangle(n);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormat exception occurred: "+e.getMessage());
		} catch (IOException e) {
			System.out.println("I/O exception occured: "+e.getMessage());
		} catch(NegativeInputException e) {
			System.out.println("Negative integer found! : "+e.getMessage());
		}
	}

}
