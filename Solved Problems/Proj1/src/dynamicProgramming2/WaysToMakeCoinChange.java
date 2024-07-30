package dynamicProgramming2;
import java.util.Scanner;

public class WaysToMakeCoinChange {
	
	private static long countWaysToMakeChangeHelper(int denominations[], int value, int n) 
    {
		// If total is 0, return 1 (solution found)
		if (value == 0) 
        {
			return 1;
		}

		// Return 0 (solution do not exist) if total become negative or
		// No elements are left
		if (n < 0 || value < 0) 
        {
			return 0;
		}

		// Case 1. include current coin S[n] in solution and recur
		// With remaining change (N - S[n]) with same number of coins
		long incl = countWaysToMakeChangeHelper(denominations,  value - denominations[n], n);

		// Case 2. exclude current coin S[n] from solution and recur
		// For remaining coins (n - 1)
		long excl = countWaysToMakeChangeHelper(denominations, value , n-1);

		// Return total ways by including or excluding current coin
		return incl + excl;
	}

	public static long countWaysToMakeChange(int denominations[], int value){
        int n = denominations.length;
		return countWaysToMakeChangeHelper(denominations, value, n-1);			

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numDenominations = s.nextInt();
		int denominations[] = new int[numDenominations];
		for(int i = 0; i < numDenominations; i++){
			denominations[i] = s.nextInt();
		}
		
		int value = s.nextInt();
		
		System.out.println(countWaysToMakeChange(denominations, value));

	}

}
