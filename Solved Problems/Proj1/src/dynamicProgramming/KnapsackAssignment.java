package dynamicProgramming;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.util.*;
public class KnapsackAssignment {
	
	static int knapsack(int[] weight, int[] value, int n, int maxWeight) {

        int[][] dp = new int[2][maxWeight + 1];


	for (int i = 0; i < n; i++) {

		for (int j = 1; j <= maxWeight; ++j){
			if (weight[i] <= j) {
               dp[i % 2][j] = Math.max(value[i] + dp[(1 + i) % 2][j - weight[i]], dp[(i + 1) % 2][j]);
			} 
			else {
               dp[i % 2][j] = dp[(i + 1) % 2][j];
           }
       }
   }
   return dp[(n + 1) % 2][maxWeight];
	}
	
	
	/// Buffer code for main code
	
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput(int size) throws IOException {
        
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
        String[] strNums;
        strNums = br.readLine().split("\\s");
        
        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

	public static void main(String[] args) throws NumberFormatException, IOException {
		 //Scanner sc=new Scanner(System.in);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- >0){
            int size = Integer.parseInt(br.readLine().trim());
            int[] wt = takeInput(size);
            int[] val = takeInput(size);
            int w = Integer.parseInt(br.readLine().trim());
            System.out.println(knapsack(wt, val, size, w));
        }

	}

}
