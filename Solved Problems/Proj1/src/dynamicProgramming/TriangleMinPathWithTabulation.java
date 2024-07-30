package dynamicProgramming;
import java.util.ArrayList;
public class TriangleMinPathWithTabulation {
	
	static ArrayList<ArrayList<Integer>>dp;
	
	private static int helperTab(int[][]triangle, int n) {
		//base case
		dp.get(0).set(0, triangle[0][0]); // initialization set 0-0 at 0th index of first row
		for(int i = 1; i<n; i++) { // i=1 because of i = 0; already initialized
			for(int j =0; j<=i; j++) { // for triangular column creation
				// choice
				int op1 = Integer.MAX_VALUE, op2 = Integer.MAX_VALUE; // for removing garbage value
				if(j!=i)
					op1 = triangle[i][j] + dp.get(i-1).get(j);
				if(j!=0)
					op2 = triangle[i][j] + dp.get(i-1).get(j-1);
					dp.get(i).set(j, Math.min(op1, op2));
			}
		}
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i<n; i++) {
			ans = Math.min(ans, dp.get(n-1).get(i));
		}
		return ans;
		
	}
	public static void main(String[] args) {
		int[][]triangle = {{2}, {3, 4}, {6, 5, 7},{4, 1, 8, 3}};
		int n = 4;
		dp = new ArrayList<>();
		for(int i = 0; i<n; i++) {
			ArrayList<Integer> row = new ArrayList<>();
			for(int j = 0; j<n; j++) {
				row.add(-1);
			}
			dp.add(row);
		}
		int ans = helperTab(triangle, n);
		System.out.println("Minimum path sum: "+ ans);
		}

}
