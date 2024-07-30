package recursion3;

public class ReturnSubsets {
	public static int [][]subsetsHelper(int[]a, int startIndex){
		if(startIndex == a.length) {
			int[][]output = new int[1][0];
			return output;
		}
		int[][] smallerOutput = subsetsHelper(a, startIndex+1);
		int [][]output = new int[smallerOutput.length*2][];
		int k = 0;
		for(int i = 0; i<smallerOutput.length; i++) {
			output[k] = new int [smallerOutput[i].length];
			for(int j = 0; j<smallerOutput[i].length; j++) {
				output[k][j] = smallerOutput[i][j];
			}
			k++;
		}
		
		for(int i = 0; i<smallerOutput.length; i++) {
			output[k] = new int [smallerOutput[i].length+1];
			output[k][0] = a[startIndex];
			for(int j = 0; j<smallerOutput[i].length; j++) {
				output[k][j+1] = smallerOutput[i][j];
			}
			k++;
		}
		return output;
	}
	
	public static int[][] subsets(int a[]) {
		return subsetsHelper(a, 0);
	}

	public static void main(String[] args) {
		int [] input = {1, 2, 3};
		int [][]output = subsets(input);
		for(int i = 0; i<output.length; i++) {
			for(int j = 0; j<output[i].length; j++) {
				System.out.print(output[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
