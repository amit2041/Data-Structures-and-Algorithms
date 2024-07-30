package arraysintro;
import java.util.Scanner;
public class ClosestBinaryIndex3 {
		 public static int binarySearchClosest(int[] nums, int left, int right, int target) {

		        while (left <= right) {

		            int mid = left + (right - left) / 2; // Calculate the middle index



		            if (nums[mid] > target) {

		                right = mid-1;

		            } else if (nums[mid] < target) {

		                left = mid + 1; // Adjust 'left' to search the right half

		            } else {

		                return mid;

		            }

		        }



		        // If 'right' is less than 0, 'left' is the closest index

		        if (right < 0) {

		            return left;

		        }

		        // If 'left' is greater than or equal to 'right', 'right' is the closest index

		        else if (left >= right) {

		            return right;

		        }

		        // If the difference between 'target' and 'nums[right]' is smaller,

		        // 'right' is closer; otherwise, 'left' is closer

		        else if (target - nums[right] < nums[left] - target) {

		            return right;

		        } else {

		            return left; // 'left' is closer (default case)

		        }

		    }


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
	     int n = s.nextInt();
	     int arr[] = new int[n];

	     for (int i = 0; i < n; i++) {
	         arr[i] = s.nextInt();
	     }
	     int left = 0;
	     int right = n-1;
	     int x = s.nextInt();
	     int result = ClosestBinaryIndex3.binarySearchClosest(arr, left, right, x);
	     System.out.print(result);
	 }
	}

