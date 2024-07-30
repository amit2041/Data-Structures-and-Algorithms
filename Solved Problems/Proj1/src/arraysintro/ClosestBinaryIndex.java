package arraysintro;

public class ClosestBinaryIndex {
	public static int findClosestRecursive(int[] nums,int left,int right,int target){
		if (left == right) {
			return nums[left];
		}

		int mid = (left + right) / 2;

		int leftClosest= findClosestRecursive(nums, left, mid, target);

		int rightClosest = findClosestRecursive(nums, mid + 1, right, target);

		if (Math.abs(leftClosest - target)<= Math.abs(rightClosest - target)) {
			return leftClosest;
		}
		else {
			return rightClosest;
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 4, 5, 6, 6, 8, 8, 9 };
	    int n = arr.length;
	    int target = 11;
	    System.out.println(findClosestRecursive(arr, 0, n - 1, target));
	  }
	}