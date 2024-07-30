package dsaSkillTest;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class helpPradyumana {
	 static final int MOD = 1000000007;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int datasets = scanner.nextInt();
	        
	        while (datasets-- > 0) {
	            int datasetNumber = scanner.nextInt();
	            int n = scanner.nextInt();
	            int k = scanner.nextInt();
	            System.out.println(datasetNumber + " " + countBitStrings(n, k));
	        }
	        
	        scanner.close();
	    }

	    static int countBitStrings(int n, int k) {
	        int[][] dp = new int[n + 1][k + 1];
	        
	        // Base cases
	        dp[1][0] = 1;
	        dp[1][1] = 1;
	        
	        for (int i = 2; i <= n; i++) {
	            for (int j = 0; j <= k; j++) {
	                dp[i][j] = dp[i - 1][j];
	                
	                if (j > 0) {
	                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % MOD;
	                }
	                
	                if (j < k) {
	                    dp[i][j] = (dp[i][j] + dp[i - 1][j + 1]) % MOD;
	                }
	            }
	        }
	        
	        return dp[n][k];
	    }
	}