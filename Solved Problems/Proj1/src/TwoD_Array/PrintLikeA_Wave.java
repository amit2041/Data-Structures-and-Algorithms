package TwoD_Array;
import java.util.Scanner;
public class PrintLikeA_Wave {
	
	public static void wavePrint(int mat[][]){
		//Your code goes here
		 int k=0,c=mat.length-1;
        if(mat.length!=0){
            k=mat[0].length;
        }
	 for(int j=0;j<k;j++){
         for(int i=0;i<mat.length;i++){
             
             if(j%2!=0){
                 System.out.print(mat[c][j]+" ");
                 c--;
             }
             else {
                 c=mat.length-1;
                 System.out.print(mat[i][j]+" ");
             }
             
         }
     }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int t, N, M;
	        Scanner sr = new Scanner(System.in);
	        t = sr.nextInt();
	        for (int k = 0; k < t; ++k) {
	            N = sr.nextInt();
	            M = sr.nextInt();
	            int ar[][] = new int[N][M]; // Swap n and m in array dimensions
	            for (int i = 0; i < N; i++) {
	                for (int j = 0; j < M; j++) {
	                    ar[i][j] = sr.nextInt();
	                }
	            }
	            wavePrint(ar);
		    System.out.println();
	        }

	}

}
