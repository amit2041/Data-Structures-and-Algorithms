package dynamicProgramming;
import java.util.Arrays;
public class FrogJumpWithMemoization {
	static int[] dp;
	
	private static int helper(int[]heights, int n) {
		// Base Case
		if(n==1)
			return 0;
		if(dp[n]!= -1)
			return dp[n];
		// Choice
		int op1 = 0, op2 = Integer.MAX_VALUE;
		op1 = Math.abs(heights[n-1] - heights[n-2]) + helper(heights, n-1);
		if(n-2>0) {
			op2 = Math.abs(heights[n-1] - heights[n-3]) + helper(heights, n-2);
		}
		// Optimal
		return dp[n] = Math.min(op1, op2);
	}

	public static void main(String[] args) {
		int[] heights = {10, 20, 30, 10};
		dp = new int[5];
		Arrays.fill(dp, -1);
		int ans = helper(heights, 4);
		System.out.println("Min Energy: "+ ans);

	}

}
