package TwoD_Array;
import java.util.Scanner;
public class PrintSpiral {
	
public static void spiralPrint(int matrix[][]){
		
		int nRows = matrix.length;
		if (nRows == 0) {
			return;
		}
		
		int mCols = matrix[0].length;

		int i, rowStart = 0, colStart = 0;

		int numElements = nRows * mCols, count = 0;
		
		while(count < numElements){
			for(i = colStart; count < numElements && i < mCols; ++i) {
				System.out.print(matrix[rowStart][i]+ " ");
				count++;
			}           
			rowStart++;

			for(i = rowStart; count < numElements && i < nRows; ++i) {
				System.out.print(matrix[i][mCols - 1] + " ");
				count++;
			}
			mCols--;

			for(i = mCols - 1; count < numElements && i >= colStart; --i) {
				System.out.print(matrix[nRows - 1][i] + " ");
				count++;
			}
			nRows--;

			for(i = nRows - 1; count < numElements && i >= rowStart; --i) {
				System.out.print(matrix[i][colStart] + " ");
				count++;
			}
			colStart++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
