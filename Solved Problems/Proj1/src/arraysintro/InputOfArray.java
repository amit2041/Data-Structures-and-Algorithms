package arraysintro;
import java.util.Scanner;

public class InputOfArray {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int arr [] = new int [n];
		for(int i = 0; i<n; i++) {
			System.out.println("Enter Element at" + i +"th Index");
			arr[i] = s.nextInt();
		}
		for(int i = 0; i<n; i++) {
		System.out.println(arr[i]);	
		}

	}

}
