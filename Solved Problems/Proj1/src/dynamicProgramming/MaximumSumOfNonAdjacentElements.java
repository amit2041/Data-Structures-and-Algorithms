package dynamicProgramming;
import java.util.ArrayList;
import java.util.Scanner;
public class MaximumSumOfNonAdjacentElements {
	
	private static int maxNonAdjacentSumHelper(ArrayList<Integer> nums, int index) {
		// Base Case.
		if (index < 0) {
			return 0;
		}

		// Including the current element of the given array/list for our subsequence.
		int optionA = maxNonAdjacentSumHelper(nums, index - 2) + nums.get(index);

		// Excluding the current element of the given array/list for our subsequence.
		int optionB = maxNonAdjacentSumHelper(nums, index - 1);

		return Math.max(optionA, optionB);
	}

	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		int n = nums.size();
		return maxNonAdjacentSumHelper(nums, n - 1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		while (t > 0) 
		{
			int n = scan.nextInt();

			ArrayList<Integer> nums = new ArrayList<Integer>();

			for (int i = 0; i < n; i++) 
			{
				nums.add(scan.nextInt());
			}

			int ans = maximumNonAdjacentSum(nums);

			System.out.println(ans);

			t = t - 1;
		}

	}

}
