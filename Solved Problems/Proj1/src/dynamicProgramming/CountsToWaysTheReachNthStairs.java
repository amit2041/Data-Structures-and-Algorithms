package dynamicProgramming;
import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class CountsToWaysTheReachNthStairs {

	 public static final int MOD = 1000000007;
	 public static long countDistinctWayToClimbStair(long nStairs) {
		    

	        if (nStairs == 0 || nStairs == 1)
	            return 1;
	        long dp[] = new long[(int) (nStairs + 1)];

	        // For single stair only
	        dp[0] = 1;

	        // For two stairs
	        dp[1] = 1;

	        // Go all stairs
	        for (int i = 2; i <= nStairs; i++) {
	            // Get the number of way to reach i
	            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
	        }

	        return dp[(int) nStairs];
	    }
	 
	 public static Scanner s = new Scanner(System.in);

	    private static int t;
	    private static long[] n;

	    private static void takeInput() throws IOException {
	        t = s.nextInt();
	        n = new long[t];

	        for(int i = 0; i < t; i++){
	            n[i] = s.nextLong();
	        }
	    }

	    private static void execute() {

	        for (int i = 0; i < t; i++) {
	            long ans = countDistinctWayToClimbStair(n[i]);
	        }
	    }

	    private static void executeAndPrintOutput() {
	        for (int i = 0; i < t; i++) {
	            long ans = countDistinctWayToClimbStair(n[i]);
	            System.out.println(ans);
	        }
	        }
	 
	 public static void main(String[] args) throws IOException {
		 
		 takeInput();
	        executeAndPrintOutput();
		        
		    
	 }

}
