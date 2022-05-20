package com.gourab.patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Gourab Bhattacharjee
 * <p>
 * This program will print a spiral matrix of size and starting value decided by user.
 */

public class SpiralMatrixPattern {
	/**
	 * 
	 * @param n
	 * @param startVariable
	 * @throws InvalidMoveException : Added since if any change occurs in Move.java like move codes are updated. 
	 */
	public static void spiralMatrix(int n, int startVariable) throws InvalidMoveException {
		int row = 0, col = 0;
		int noOfDoubleRotationsOccured = 0;

		int boundary = n - 1;
		int sizeLeft = n - 1;

		int flag = 1;

		char move = Move.RIGHT.getCode();

		int[][] matrix = new int[n][n];

		for (int i = startVariable; i < n * n + 1; i++) {
			matrix[row][col] = i;

			switch (move) {

			case 'R':
				col += 1;
				break;

			case 'L':
				col -= 1;
				break;

			case 'D':
				row += 1;
				break;

			case 'U':
				row -= 1;
				break;
				
			default:
				throw new InvalidMoveException("Invalid Move! ", new Throwable());
			}

			if (i == boundary) {
				boundary += sizeLeft;

				if (flag != 2) {
					flag = 2;
				} else {
					noOfDoubleRotationsOccured++;
					flag = 1;
					sizeLeft -= 1;
				}

				switch (move) {
				case 'R':
					move = Move.DOWN.getCode();
					break;
				case 'D':
					move = Move.LEFT.getCode();
					break;
				case 'L':
					move = Move.UP.getCode();
					break;
				case 'U':
					move = Move.RIGHT.getCode();
					break;
				default:
					throw new InvalidMoveException("Invalid Move! ", new Throwable());
				}
			}
		}

		for (row = 0; row < n; row++) {
			for (col = 0; col < n; col++) {
				int element = matrix[row][col];

				System.out.print((element < 10) ? element + "  " : element+" ");
			}
			System.out.println();
		}
		System.out.println("No of double rotations occured for matrix size = "+n+": "+noOfDoubleRotationsOccured);
	}
	
	public static void main(String[] args) {
		int i, n;
		try {
			System.out.print("Enter size of spiral matrix: ");
			n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
			System.out.println();
			System.out.print("Enter the starting value: ");
			i = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
			spiralMatrix(n, i);
		} catch (NumberFormatException e) {
			System.out.println("Entered input is NaN: "+e.getMessage());
		} catch (IOException e) {
			System.out.println("Entered input is not valid: "+e.getMessage());
		} catch(InvalidMoveException e) {
			System.out.println("Invalid Move found: "+e.getMessage());
		} catch(Exception e) {
			System.out.println("General exception: "+e.getMessage());
		}
	}
}
