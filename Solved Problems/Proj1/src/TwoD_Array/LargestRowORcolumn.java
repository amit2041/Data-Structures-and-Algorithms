package TwoD_Array;
import java.util.Scanner;
public class LargestRowORcolumn {
	
	public static void findLargest(int mat[][]){

	        //when rows are 0
	        if(mat.length==0){
				System.out.println("row "+0+" "+Integer.MIN_VALUE);
				return;
			}

	        int largestRow = Integer.MIN_VALUE;
	        int largestCol = Integer.MIN_VALUE;
	        int rn = 0;
	        int cn = 0;


	        for (int i = 0; i < mat.length; i++) {
	            int sum = 0;
	            for (int j = 0; j < mat[i].length; j++) {
	                sum += mat[i][j];
	            }
	            if (sum > largestRow) {
	                largestRow = sum;
	                rn = i;
	            }
	        }
		

	        for (int j = 0; j < mat[0].length; j++) {
	            int sum = 0;
	            for (int i = 0; i < mat.length; i++) {
	                sum += mat[i][j];
	            }
	            if (sum > largestCol) {
	                largestCol = sum;
	                cn = j;
	            }
	        }

	        
	        if(largestRow>=largestCol){
	            System.out.println("row "+rn+" "+largestRow); //using println here
	        }else{
	            System.out.println("column "+cn+" "+largestCol); //also here
	        }

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int t, m, n;
	        Scanner sr = new Scanner(System.in);
	        t = sr.nextInt();
	        for (int k = 0; k < t; ++k) 
			{
	            n = sr.nextInt();
	            m = sr.nextInt();
	            int ar[][] = new int[n][m]; // Swap n and m in array dimensions
	            for (int i = 0; i < n; i++) 
				{
	                for (int j = 0; j < m; j++) 
					{
	                    ar[i][j] = sr.nextInt();
	                }
	            }
	            findLargest(ar);
	        }

	}

}
