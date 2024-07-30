package dsaSkillTest;
import java.util.Scanner;
public class maximumSubArraySum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		// Input size of array 
		int N = scanner.nextInt(); 
		// Input array elements 
		int[] array = new int[N]; 
		for (int i = 0; i < N; i++) { 
			array[i] = scanner.nextInt(); 
			} 
		// Find and print the maximum subarray sum 
		int maxSubarraySum = findMaxSubarraySum(array); 
		System.out.println(maxSubarraySum); 
		} 
	private static int findMaxSubarraySum(int[] array) { 
		int maxEndingHere = array[0]; 
		int maxSoFar = array[0]; 
		for (int i = 1; i < array.length; i++) { 
			maxEndingHere = Math.max(array[i], maxEndingHere + array[i]); 
			maxSoFar = Math.max(maxSoFar, maxEndingHere); 
			} 
		return maxSoFar; 

	}

}
