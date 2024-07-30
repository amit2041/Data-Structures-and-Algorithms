package dynamicProgramming;

import java.util.ArrayList;

public class UniquePathRecursionWithMemoization {
	static ArrayList<ArrayList<Integer>> dp;

	public static void main(String[] args) {
		int[][] grid = {{0, 0, 0}, {0, -1, 0},{0, 0, 0}};
		int n =3, m = 3;
		dp = new ArrayList<>();
		for(int i = 0; i<n; i++) {
			ArrayList<Integer> row = new ArrayList<>();
			for(int j = 0; j<m; j++) {
				row.add(-1);
			}
			dp.add(row);
		}
		int ans = helper(grid, 2, 2);
		System.out.println("Total Unique Paths: "+ ans);
		
	}
	
	private static int helper(int[][]grid, int i, int j) {
		// Base Case
		//destination
		if(i==0 && j==0)
			return 1;
		// out of bound
		if(i<0 || j<0)
			return 0;
		// dead cell or blockage cell
		if(grid[i][j]== -1)
			return 0; 
		// Memoization code
		if(dp.get(i).get(j)!= -1)
			return dp.get(i).get(j);
		
		// Choice
		int way1, way2;
		way1 = helper(grid, i-1, j);
		way2 = helper(grid, i, j-1);
		
		
		// Optimal
		int ans = way1 + way2;
		//Memoization code
		dp.get(i).set(j, ans);
		return ans;

	}

}
