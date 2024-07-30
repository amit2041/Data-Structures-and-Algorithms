package arraysintro;
import java.util.Scanner;
public class InsertionSort {
	
	public static void printArray(int[]arr) {
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void insertionSort(int []arr) {
		int n = arr.length;
		for(int i = 1; i<n; i++) {
			int current = arr[i];
			int j = i-1;
			while(j>=0 && current <arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++);
		// TODO Auto-generated method stub
		insertionSort(arr);
		printArray(arr);

	}
}
