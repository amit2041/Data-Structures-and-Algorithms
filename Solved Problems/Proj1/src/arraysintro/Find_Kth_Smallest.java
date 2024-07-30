package arraysintro;
import java.util.Scanner;
public class Find_Kth_Smallest {
	
	public static int kthSmallest(int[] arr, int n, int k){
        //Your code goes here
         for(int i = 0; i<arr.length-1; i++) {
			for(int j = 0; j<arr.length-i-1; j++) {
				if(arr[j]> arr[j+1]) {
					//swap
					int temp = arr[j];
					arr[j] =  arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr[k-1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        int result = Find_Kth_Smallest.kthSmallest(arr, n, k);
        System.out.print(result);
    }

}
