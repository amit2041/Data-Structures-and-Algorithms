package dynamicProgramming;
import java.util.ArrayList;
public class Triangle {
	
	static ArrayList<ArrayList<Integer>> dp;
	public static void main(String[] args) {
		int[][] arr = {{2}, {3, 4}, {6, 5, 7},{4, 1, 8, 3}};
		int n = 4;
		dp = new ArrayList<>();
		for(int i = 0; i<n; i++) {
			ArrayList<Integer> row = new ArrayList<>();
			for(int j = 0; j<n; j++) {
				row.add(-1);
			}
			dp.add(row);
		}
		int ans = helper(arr, n, 0, 0);
		System.out.println("Minimum path sum: "+ ans);

	}
	
	private static int helper(int[][]arr, int n, int row, int col) {
		//Base Case
		if(row == n-1)
			return arr[n-1][col];
			if(dp.get(row).get(col)!= -1) 
				return dp.get(row).get(col);
		//Choice
		int op1, op2;
		op1 = arr[row][col] + helper(arr, n, row+1, col);
		op2 = arr[row][col] + helper(arr, n, row+1, col+1);
		//Optimal
		int ans = Math.min(op1, op2);
		dp.get(row).set(col, ans);
		return ans;
	}

}
