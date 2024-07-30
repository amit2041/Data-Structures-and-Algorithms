package backtracking;
import java.util.Scanner;
public class ValidSudoku {
	
	static private boolean isValid(int [][]matrix){
		  int n = matrix.length;
		  int [][] row = new int[n][n+1];
		  int[][] column = new int [n][n+1];
		  int[][][] subMatrix = new int[3][3][n+1];
		  for(int r = 0; r<n; r++){
		    for(int c= 0; c<n; c++){
		      if(matrix[r][c]==0){
		        continue;
		      }
		      row[r][matrix[r][c]] += 1;
		      subMatrix[r/3][c/3][matrix[r][c]] += 1;
		      if(subMatrix[r/3][c/3][matrix[r][c]]>1 || column[c][matrix[r][c]]>1 || row[r][matrix[r][c]]>1){
		        return false;
		      }
		    }
		  } 
		  return true;
		}

		static private boolean solve(int[][] matrix, int i ,int j){
		  int n = matrix.length;
		  if(i == n-1 && j== n){
		    return true;
		  }
		  if(j==n){
		    i++;
		    j = 0;
		  }
		  if(matrix[i][j]!=0){
		    return solve(matrix, i, j+1);
		  }
		  for(int digit = 1; digit<=n; digit++){
		    matrix[i][j] = digit;
		    if(isValid(matrix)){
		      if(solve(matrix, i, j+1)){
		        return true;
		      }
		    }
		    matrix[i][j] = 0;
		  }
		  return false;
		}
			public static boolean isItSudoku(int matrix[][]) {
		    return solve(matrix, 0, 0);
				

			}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {

            int[][] matrix = new int[9][9];

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            boolean ans = isItSudoku(matrix);

            if (ans) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

	}

}
