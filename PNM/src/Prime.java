
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] prime = new int[3][3];
		int[][] invprime = new int[3][3];
		int[][] finalprime = new int[3][3];
		prime[0][0] = 2;
		prime[0][1] = 3;
		prime[0][2] = 5;
		prime[1][0] = 0;
		prime[1][1] = 0;
		prime[1][2] = 0;
		prime[2][0] = 0;
		prime[2][1] = 0;
		prime[2][2] = 0;
		
		for (int i = 0; i < prime.length; i++) 
        {
            for (int j = 0; j < prime[i].length; j++) 
            {
            	invprime[j][i] = prime[i][j];
                 System.out.print(prime[i][j] + " ");
            }
            System.out.print("\n");
        }
		
		if (prime.length > 0) {
		for (int i = 0; i < invprime.length; i++) 
        {
            for (int j = 0; j < invprime[i].length; j++) 
            { 
            	System.out.print(invprime[i][j] + " ");
            }
            System.out.print("\n");
        }
		
		}

	}

}
