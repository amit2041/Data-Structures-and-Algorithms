package dynamicProgramming;

import java.util.ArrayList;

public class UniquePathByTabulation {
	private static int helperTab(int[][] grid, int n, int m) {
		for(int i = 0; i<m; i++) {
			if(grid[0][i] == -1)
				break;
			dp.get(0).set(i, 1);
		}
		for(int i = 0; i<n; i++) {
			if(grid[i][0] == -1)
				break;
			dp.get(i).set(0, 1);
		}
		// nested loop
		for(int i = 1; i<n; i++) {
			for(int j = 1; j<m; j++) {
				if(grid[i][j] == -1)
					dp.get(i).set(j, 0);
				else {
					dp.get(i).set(j, dp.get(i-1).get(j)+ dp.get(i).get(j-1));
				}
			}
			
		}
		return dp.get(n-1).get(m-1);
	}
	
	static ArrayList<ArrayList<Integer>> dp;
	public static void main(String[] args) {
		int[][] grid = {{0, 0, 0}, {0, -1, 0},{0, 0, 0}};
		int n =3, m = 3;
		dp = new ArrayList<>();
		for(int i = 0; i<n; i++) {
			ArrayList<Integer> row = new ArrayList<>();
			for(int j = 0; j<m; j++) {
				row.add(0);
			}
			dp.add(row);
		}
		int ans = helperTab(grid, n, m);
		System.out.println("Total Unique Paths: "+ ans);

	}

}
