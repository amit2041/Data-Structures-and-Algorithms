package TwoD_Array;

public class PrintSpiral2 {
	public static void spiralPrint(int matrix[][]) {
		int rows = matrix.length;
		if(rows==0) {
			return;
		}
		int cols = matrix[0].length;
		int count = 0;
		int tot = rows*cols;  // tot = total cell.
		int rs = 0;
		int re = rows-1;
		int cs = 0;
		int ce = cols-1;
		while(count<tot) {
			for(int i = cs; count<tot && i<=ce; i++) {
				System.out.print(matrix[rs][i]+" ");
				count++;
			}
			rs = rs+1;
			for(int i = rs; count<tot && i<=re; i++) {
				System.out.print(matrix[i][ce]+" ");
				count++;
			}
			ce = ce-1;
			for(int i = ce; count<tot && i>= cs; i--) {
				System.out.print(matrix[re][i]+" ");
				count++;
			}
			re = re-1;
			for(int i = re; count<tot && i>= rs; i--) {
				System.out.print(matrix[i][cs]+" ");
				count++;
			}
			cs = cs+1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [][] = {{1,2,3,4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}};
		spiralPrint(a);
	}

}
