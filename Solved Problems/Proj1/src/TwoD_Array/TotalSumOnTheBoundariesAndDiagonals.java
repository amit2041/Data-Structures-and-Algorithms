package TwoD_Array;
import java.util.Scanner;
public class TotalSumOnTheBoundariesAndDiagonals {
	
	public static void totalSum(int[][] mat) {
		//Your code goes here
		int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==0||i==mat.length-1){
                sum+=mat[i][j];
                }
                else {
                    if(i==j||i+j==mat.length-1)
                        sum+=mat[i][j];
                     }
            }
        }     
        for(int i=1;i<mat.length-1;i++){
            for(int j=0;j<mat[i].length;j++){
                if(j==0||j==mat[i].length-1){
                    sum+=mat[i][j];
                }
            }
        }
	System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t, N, M;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) {
            N = sr.nextInt();
            int ar[][] = new int[N][N]; // Swap n and m in array dimensions
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    ar[i][j] = sr.nextInt();
                }
            }
            totalSum(ar);
        }

	}

}
