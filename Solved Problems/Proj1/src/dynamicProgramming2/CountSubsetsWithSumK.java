package dynamicProgramming2;
import java.util.Arrays;
public class CountSubsetsWithSumK {
	 // solved by Iterative Dynamic Programming

	 public static int findWays(int num[], int tar) {
	        
	        // Let 'n' be the size of the array.
	        int n = num.length;
	        
	        // Initialize a 2d matrix 'dp' of size ('n' + 1) * ('tar' + 1) with value 0.
	        int dp[][] = new int[n + 1][tar + 1];

	        // Here dp[i][j] is the number of ways we can get sum 'j' using
	        // first 'i' numbers in 'num' (from num[0] to num[i - 1]).


	        // Base case: When we have not chosen any number:
	        // Number of ways to get sum equal to 0 = 1
	        // Number of ways to get sum greater than 0 = 0

	        dp[0][0] = 1;
	        // dp[0][i] for i > 0 is already initialized to 0.


	        // Run a loop from 'i' = 1...'n':
	        for (int i = 1; i <= n; i++) {

	            // Run a loop from 'j' = 0...'k':
	            for (int j = 0; j <= tar; j++) {

	                // Choice 1: Don't choose i'th number (num[i - 1])
	                // The sum 'j' remains the same.
	                dp[i][j] = dp[i - 1][j];

	                // Choice 2: Choose i'th number (num[i - 1])
	                // This is only possible when the sum before choosing
	                // num[i - 1] is not negative.
	                if (num[i - 1] <= j) {
	                    dp[i][j] += dp[i - 1][j - num[i - 1]];
	                    dp[i][j] %= 1000000007;
	                }
	            }
	        }

	        // Return the value of 'dp[n][tar]'.
	        return dp[n][tar];
	 }

	public static void main(String[] args) {
	        int arr[] = {1, 2, 2, 3};
	        int k = 3;

	        // Calculate and print the number of subsets that sum up to k
	        System.out.println("The number of subsets found are " + findWays(arr, k));

	}

}
