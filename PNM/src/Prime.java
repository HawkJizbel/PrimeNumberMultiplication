/*
 * Code created by Jizbel Abel Johnson
 * The code calculates the prime numbers and then outputs prime multiplication table
 */

import java.util.Scanner;

public class Prime {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//Prime Number User Input
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the number:");
		int pnum = inp.nextInt();
		inp.close();

		//Initialise Array
		int[][] iniprime = new int[pnum][pnum];
		int[][] invprime = new int[pnum][pnum];
		int[][] finalprime = new int[pnum][pnum];

		int n = pnum * 10;
		int a = 0;

		int[][] tempprime = new int[n][n];

		//Prime Number Calculation
		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i < n; i++)
			prime[i] = true;
		for (int p = 2; p * p <= n; p++) {

			if (prime[p] == true) {

				for (int i = p * 2; i <= n; i += p)
					prime[i] = false;
			}
		}
		//Copy Prime Number to Array
		for (int i = 2; i <= n; i++) {

			if (prime[i] == true) {
				tempprime[0][a] = i;
				a++;

			}

		}

		//Resize and Copy Prime Numbers to Initial Array
		for (int i1 = 0; i1 < pnum; i1++) {
			for (int j1 = 0; j1 < pnum; j1++) {
				iniprime[i1][j1] = tempprime[i1][j1];
			}
		}

		//Clear Temporary Array
		tempprime = new int[0][0];

		System.out.print("The Prime Numbers are: ");
		
		//Transpose Prime Number Array
		for (int i = 0; i < iniprime.length; i++) {
			for (int j = 0; j < iniprime[i].length; j++) {
				invprime[j][i] = iniprime[i][j];
				System.out.print(iniprime[0][j] + " ");
			}
			System.out.print("\n");
			System.out.print("\n");
			break;
		}


		if (iniprime.length > 0) {
			for (int i = 0; i < finalprime.length; i++) {
				for (int j = 0; j < finalprime[i].length; j++) {
					for (int k = 0; k < finalprime.length; k++) {
						for (int l = 0; l < finalprime.length; l++) {
							finalprime[k][l] = iniprime[k][l] * invprime[j][i];
							System.out.print(finalprime[k][l] + " | ");
						}
						break;
					}
					System.out.print("\n");
				}
				break;
			}
		}
	}
}
