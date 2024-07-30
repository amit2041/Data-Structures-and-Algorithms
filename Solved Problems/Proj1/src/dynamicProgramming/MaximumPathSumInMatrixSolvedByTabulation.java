package dynamicProgramming;

import java.util.ArrayList;

public class MaximumPathSumInMatrixSolvedByTabulation {
	static ArrayList<ArrayList<Integer>>dp; 
	
	private static int helper2(int[][]grid, int n, int m) {
				//Base
				for(int i = 0; i<m; i++) {	// initialization for the fisrt row and first column
					dp.get(0).set(i, grid[0][i]);
				}
					for(int i = 1; i<n; i++) {
						for(int j = 0; j<m; j++) {
							int ch1, ch2 = Integer.MIN_VALUE, ch3 = Integer.MIN_VALUE;
							ch1 = grid[i][j] + dp.get(i-1).get(j);
							if(j!=0)
								ch2 = grid[i][j] + dp.get(i-1).get(j-1);
							if(j!= n-1)
								ch3 = grid[i][j] + dp.get(i-1).get(j+1);
							
							int temp = Math.max(ch1, Math.max(ch2, ch3));
							dp.get(i).set(j, temp);
							
						}
					}
					int ans = Integer.MIN_VALUE;
					for(int i = 0; i<n; i++) {
						ans = Math.max(ans, dp.get(n-1).get(i));
					}
					return ans;
				}

	public static void main(String[] args) {
		int[][]grid = {{1, 2, 10, 4}, {100, 3, 2, 1}, {1, 1, 20, 2}, {1, 2, 2, 1}};
		int n = 4, m = 4;
		dp = new ArrayList<>();
		for(int i = 0; i<n; i++) {
			ArrayList<Integer> row = new ArrayList<>();
			for(int j = 0; j<m; j++) {
				row.add(-1);
			}
			dp.add(row);
		}
		int ans = Integer.MIN_VALUE;
		// function call
		ans = helper2(grid, n, m);
		System.out.println("Max path sum: "+ans);

	}

}
