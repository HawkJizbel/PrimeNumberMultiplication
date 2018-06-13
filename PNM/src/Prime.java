import java.util.Arrays;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] prime = new int[3][3];
		int[][] invprime = new int[3][3];
		int[][] finalprime = new int[3][3];
		prime[0][0] = 2;
		prime[0][1] = 3;
		prime[0][2] = 5;

		for (int i = 0; i < prime.length; i++) {
			for (int j = 0; j < prime[i].length; j++) {
				invprime[j][i] = prime[i][j];
				System.out.print(prime[i][j] + " ");
			}
			System.out.print("\n");
		}

		if (prime.length > 0) {
			for (int i = 0; i < invprime.length; i++) {
				for (int j = 0; j < invprime[i].length; j++) {
					System.out.print(invprime[i][j] + " ");
				}
				System.out.print("\n");
			}
			System.out.print("\n");

		}

		if (prime.length > 0) {
			for (int i = 0; i < finalprime.length; i++) {
				for (int j = 0; j < finalprime[i].length; j++) {
					for (int k = 0; k < finalprime.length; k++) {
						for (int l = 0; l < finalprime.length; l++) {
							finalprime[i][j] = prime[k][l] * invprime[j][i];
							System.out.print(finalprime[i][j] + " ");
						}
					}
					System.out.print("\n");
				}
			}
			//System.out.print(Arrays.deepToString(finalprime));
		}
	}
}
