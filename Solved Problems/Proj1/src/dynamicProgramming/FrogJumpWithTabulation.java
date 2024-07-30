package dynamicProgramming;

import java.util.Arrays;

public class FrogJumpWithTabulation {
	static int[] dp;
	
	private static int helper(int[]heights, int n) {
		// Base Case
		dp[0] = 0;
		dp[1] = 0;
		for(int i = 2; i<=n; i++) {
			int op1 = 0, op2 = Integer.MAX_VALUE;
			op1 = Math.abs(heights[i-1] - heights[i-2]) + dp[i-1];
			if(i-2>0) {
				op2 = Math.abs(heights[i-1] - heights[i-3]) + dp[i-2];
			}
			dp[i] = Math.min(op1, op2);
		}
		return dp[n];
		
	}

	public static void main(String[] args) {
		int[] heights = {10, 20, 30, 10};
		dp = new int[5]; // because n+1 so n = 4 then 4+1 = 5
		Arrays.fill(dp, -1);
		int ans = helper(heights, 4);
		System.out.println("Min Energy: "+ans);

	}

}
