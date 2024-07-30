package TwoD_Array;

public class MoreAbout2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr = new int[4][];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = new int [i+2];
		//	arr[0][0] = 1;
		}
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
