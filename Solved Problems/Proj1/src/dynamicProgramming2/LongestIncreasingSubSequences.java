package dynamicProgramming2;

public class LongestIncreasingSubSequences {
	 private static int lowerBound(int a[], int low, int high, int element) {
		while(low<high) {
			int middle = low + (high-low)/2;
			if(element> a[middle]) {
				low = middle+1;
			}else {
				high = middle;
			}
		}
		return low;
		}
	 public static int longestIncreasingSubsequence(int arr[]) 
		{

			int n = arr.length;

			int[]dp = new int[n];
			int ans = 0;

			for (int i = 0; i <n; i++) 
			{
				int position = lowerBound(dp, 0, ans, arr[i]);
				dp[position] = arr[i];
				if(position == ans) {
					ans++;
			}
		}
			return ans;

	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
	}

}
