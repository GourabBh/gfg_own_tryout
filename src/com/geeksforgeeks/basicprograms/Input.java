package com.geeksforgeeks.basicprograms;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		int n;
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println("Entered number is "+n);
		sc.close();
	}
}
