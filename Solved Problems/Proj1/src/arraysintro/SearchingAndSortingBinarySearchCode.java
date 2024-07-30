package arraysintro;
import java.util.Scanner;
public class SearchingAndSortingBinarySearchCode {
	public static int search(int[]nums, int target) {
	int start = 0;
	int end = nums.length-1;
	while(start<=end) {
		int mid = (start+end)/2;
		if(target==nums[mid]) {
			return mid;
		}
		else if(target>nums[mid]) {
			start = mid+1;
		}
		else {
			end = mid-1;
		}
	}
	return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n; i++) {
		arr[i] = s.nextInt();
		}
		
		int x = s.nextInt();
		int result = SearchingAndSortingBinarySearchCode.search(arr, x);
		System.out.println(result);
	}

}
