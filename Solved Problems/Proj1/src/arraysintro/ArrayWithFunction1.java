package arraysintro;

public class ArrayWithFunction1 {
	public static void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void incrementArray(int input[]) {
	//	System.out.println(input);
		input = new int [7];
		for (int i = 0; i<input.length; i++) {
			input[i] = input[i]+1;
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
	//	System.out.println(arr);
		incrementArray(arr);
		printArray(arr);

	}

}
