package TwoD_Array;
import java.util.Scanner;
public class Print2dArray {
	public static void print2DArray(int input[][]) {
		// Write your code here
	int n = input.length;
	int m = input[0].length;
	for (int i = 1; i<=n; i++){
		for(int j = n-i+1; j>=1; j--){
			for(int a = 0; a<m; a++){
				System.out.print(input[i-1][a]+" ");
			}
			System.out.println();
		}
	}
	}

		static Scanner s = new Scanner(System.in);
		
		public static int[][] takeInput(){
			int numRows = s.nextInt();
			int numCols = s.nextInt();
			int[][] input = new int[numRows][numCols];
			for(int i = 0; i < numRows; i++){
				for(int j = 0; j < numCols; j++){
					input[i][j] = s.nextInt();
				}
			}
			return input;
		}

		public static void main(String[] args) {
			int[][] input = takeInput();
			print2DArray(input);
		}

	}
