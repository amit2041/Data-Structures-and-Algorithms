package TwoD_Array;
import java.util.Scanner;
public class TransposeOfMatrix {
	
	public static int[][] transpose(int m, int n, int[][] mat) {
		// Write your code here
		 n = mat.length;
		 m = mat[0].length;
        int[][] ans = new int[m][n];
        for (int r = 0; r < n; ++r)
            for (int c = 0; c < m; ++c) {
                ans[c][r] = mat[r][c];
            }
        return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int t, m, n;
	        Scanner sr = new Scanner(System.in);
	        t = sr.nextInt();
	        for (int k = 0; k < t; ++k) 
	        {
	            m = sr.nextInt();
	            n = sr.nextInt();
	            int ar[][] = new int[m][n]; // Swap n and m in array dimensions
	            for (int i = 0; i < m; i++) 
	            {
	                for (int j = 0; j < n; j++) 
	                {
	                    ar[i][j] = sr.nextInt();
	                }
	            }
		        int ans[][]=new int[n][m];
	            ans = transpose(m,n,ar);
	    	    for(int i=0;i<n;i++)
	    	    {	
	        		for(int j=0;j<m;j++)
	        		{
	        			System.out.print(ans[i][j]+" ");
	        		}
			        System.out.println();
		        }
	        }

	}

}
