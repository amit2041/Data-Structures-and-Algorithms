package dynamicProgramming;

import java.util.Arrays;

public class FrogJumpAssignment {
	
	 public static int frogJump(int n, int heights[]) {
	
	// Creating an array dp and initializing it with 0
    int[] dp = new int[n];

    // Base case
    dp[0] = 0;

    // For loop starting from 1 as the base case is
    // already computed earlier
    for (int i = 1; i < n; i++) {
        // Calculation for left case i.e., 1 bounce
        int left
            = dp[i - 1]
              + Math.abs(heights[i] - heights[i - 1]);
        int right = Integer.MAX_VALUE;

        // Calculation for right case i.e., 2 bounces
        if (i > 1) {
            right = dp[i - 2]
                    + Math.abs(heights[i]
                               - heights[i - 2]);
        }

        // Compute min
        dp[i] = Math.min(left, right);
    }

    return dp[n - 1];
	 }

	public static void main(String[] args) {
		 int n = 4;
	        int[] heights = { 20, 30, 40, 20 };
	        int result = frogJump(n, heights);
	        System.out.println("Minimum energy exhausted: "
	                           + result);

	}

}
