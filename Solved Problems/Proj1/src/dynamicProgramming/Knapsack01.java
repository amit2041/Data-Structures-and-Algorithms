package dynamicProgramming;
import java.util.ArrayList;
public class Knapsack01 {
	
	static ArrayList<ArrayList<Integer>>dp;
	
	private static int knapsack(int W, int[]val, int[] wt, int idx) {
		//Base case
		if(idx<0)
			return 0;
		if(dp.get(idx).get(W)!= -1)dp.get(idx).get(W);
		
		//Choice
		int take = Integer.MIN_VALUE, not_take;
		not_take = knapsack(W, val, wt, idx-1);
		if(wt[idx]<=W)
			take = val[idx]+ knapsack(W-wt[idx], val, wt, idx-1);
		
		//Optimal
		int temp = Math.max(take, not_take);
		dp.get(idx).set(W, temp);
		return temp;
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
		int ans = knapsack(W, val, wt, n-1);
		System.out.println("Max. Profit: " + ans);

	}

}
