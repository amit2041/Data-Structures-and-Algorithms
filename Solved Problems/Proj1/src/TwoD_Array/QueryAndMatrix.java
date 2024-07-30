package TwoD_Array;
import java.util.Scanner;
import java.util.ArrayList;
public class QueryAndMatrix {
	
	public static int[] query(int[][] mat, int m, int n, String[] q) {
		// Write your code here.
		int k = 0;
		for (int i = 0; i<q.length; i++){
			String query = q[i];
			int queryType = query.charAt(0) - '0';
			if(queryType ==2){
				k++;
			}
		}
		int [] result = new int[k];
		int j = 0;
		for(int i = 0; i<q.length; i++){
		String query = q[i];
		int queryType = query.charAt(0) - '0';
		char dimension = query.charAt(1);
		int index = query.charAt(2) - '0';
		if(queryType ==1){
			if(dimension =='R'){
				flipRow(mat, index, n);
			}else if(dimension =='C'){
				flipColumn(mat, index, m);
			}
		}else if(queryType==2){
			int count = 0;
			if(dimension =='R'){
				count = countZerosInRow(mat, index, n);
			}else if(dimension =='C'){
				count = countZerosInColumn(mat, index, m);
			}
			result[j] = count;
			j++;
		}
		}
		return result;

		}
		private static void flipRow(int[][] matrix, int rowIndex, int colIndex){
			for(int j = 0; j<colIndex; j++){
				matrix[rowIndex][j]^= 1;
			}
	}
		private static void flipColumn(int[][]matrix, int colIndex, int rowIndex){
			for(int i = 0; i<rowIndex; i++){
				matrix[i][colIndex]^= 1;
			}
		}
		private static int countZerosInRow(int[][]matrix, int rowIndex, int colIndex){
			int count = 0;
			for(int j = 0; j<colIndex; j++){
				if(matrix[rowIndex][j] ==0){
					count++;
				}
			}
			return count;
		}
		private static int countZerosInColumn(int matrix[][], int colIndex, int rowIndex){
			int count =0;
			for(int i = 0; i<rowIndex; i++){
				if(matrix[i][colIndex]==0){
					count ++;
				}
			}
			return count;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int T = scanner.nextInt();

	        while (T-- > 0) {
	            int M = scanner.nextInt();
	            int N = scanner.nextInt();
	            int[][] matrix = new int[M][N];
	            int Q = scanner.nextInt();
	            scanner.nextLine();

	            String[] queries = new String[Q];
	            for (int i = 0; i < Q; i++) {
	                queries[i] = scanner.nextLine();
	            }

	            int[] result = query(matrix, M, N, queries);

	            for (int count : result) {
	                System.out.print(count+" ");
	            }
	            System.out.println();
	        }

	}

}
