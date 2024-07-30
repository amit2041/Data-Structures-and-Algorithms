package dynamicProgramming;
import java.util.ArrayList;

public class Knapsack01WithTabulation {
	
static ArrayList<ArrayList<Integer>>dp;
	
	private static int knapsackTabulation(int W, int[]val, int[] wt, int n) {
		for(int i = 0; i<=W; i++)
			dp.get(0).set(i, 0);
		for(int i = 0; i<=n; i++)
			dp.get(i).set(0, 0);
		for(int i = 1; i<=n; i++) {
			for(int j = 0; j<=W; j++) {
				int take = Integer.MIN_VALUE, not_take;
				not_take = dp.get(i-1).get(j);
				if(wt[i-1]<=j)
					take = val[i-1]+ dp.get(i-1).get(j-wt[i-1]);
				int temp = Math.max(take, not_take);
				dp.get(i).set(j, temp);
				
			}
		}
		return dp.get(n).get(W);
	}

	public static void main(String[] args) {
		int W = 5;
		int[]val = {5, 4, 8, 6};
		int[]wt = {1, 2, 4, 5};
		int n = 4;
		dp = new ArrayList<>();
		for(int i = 0; i<=n; i++) {
			ArrayList<Integer> row = new ArrayList<>(W+1);
			for(int j = 0; j<=W; j++) {
				row.add(-1);
			}
			dp.add(row);
		}
		int ans = knapsackTabulation(W, val, wt, n);
		System.out.println("Max. Profit: " + ans);

	}

}
