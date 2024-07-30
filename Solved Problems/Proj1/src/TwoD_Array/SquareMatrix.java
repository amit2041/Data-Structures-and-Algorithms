package TwoD_Array;
import java.util.Scanner;
public class SquareMatrix {
	
	public static String sqrMat(int [][]mat, int n, int m,int diag[]) 
	{
	int rows=mat.length;

	if(rows==0){ //if row is 0 nothing to be done return empty String
	System.out.println("YES");
	return "";
	}

	int cols=mat[0].length;
	int t=0; 
		if(rows==cols){
			t=1; //if t=1 then it is a square matrix and I will be calculating the string
			System.out.println("YES");
		}
		else{ //else I will not calculate string if t=0 means not a square matrix
		System.out.println("NO");
		}


		String str="";
		if(t==1) //only if t=1 I am running loop..where t=1 means square matrix
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			if(i==j)  //in left to right diagonal, the i and j is same like ({0,0},{1,1},{2,2}..)
	str=str+mat[i][j]+" ";  //calculating the string with a space
		}
	}

	return str; //returning string
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t, m, n;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) {
            n = sr.nextInt();
            m = sr.nextInt();
            int ar[][] = new int[n][m]; // Swap n and m in array dimensions
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ar[i][j] = sr.nextInt();
                }
            }
            int diag[] = new int[Math.min(n, m)]; // Use Math.min to get the smaller dimension
            String ans = sqrMat(ar, n, m, diag);
            System.out.println(ans);
            if (ans.equals("YES")) {
                for (int i = 0; i < diag.length; i++) {
                    System.out.print(diag[i] + " ");
                }
                System.out.println();
            }
        }

	}

}
