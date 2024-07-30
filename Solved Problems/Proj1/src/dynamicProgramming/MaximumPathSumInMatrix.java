package dynamicProgramming;
import java.util.ArrayList;
 
public class MaximumPathSumInMatrix {
	

	static ArrayList<ArrayList<Integer>>dp; 
	
	private static int helper(int[][]grid, int n, int m, int x, int y) {
		//Base
		if(x == n)
			return 0;
		if(x<0 || x>=n || y<0 ||y>=m) // boundry condition
			return Integer.MIN_VALUE; // only min return
		
		// memoization
		if(dp.get(x).get(y)!= -1)
			return dp.get(x).get(y);
		//Choice
		int ch1, ch2, ch3; // ch = choice
		ch1 = grid[x][y] + helper(grid, n, m, x+1, y);//down
		ch2 = grid[x][y] + helper(grid, n, m, x+1, y-1);// down+left
		ch3 = grid[x][y] + helper(grid, n, m, x+1, y+1);// down+right
		
		//Optimal
		int temp = Math.max(ch1, Math.max(ch2, ch3));// Math.max compare only two elements so we are provide two times Math.max
		dp.get(x).set(y, temp);
		return temp;
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
		for(int i = 0; i<m; i++) { // i call whole first row
			ans = Math.max(ans, helper(grid, n, m, 0, i));
		}
		System.out.println("Max path sum: "+ans);
	}

}
