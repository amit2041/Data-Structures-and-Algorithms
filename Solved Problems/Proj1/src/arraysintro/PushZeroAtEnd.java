package arraysintro;
import java.util.Scanner;
public class PushZeroAtEnd {
	public static void printArray(int[]arr) {
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void pushZeroToEnd(int[]arr, int n) {
		int nonZero = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i] = arr[nonZero];
				arr[nonZero] = temp;
				nonZero++;
			}
		}
	}

	public static void main(String[] args) {
		pushZeroToEnd(arr, n);
		printArray(arr);
	}
}