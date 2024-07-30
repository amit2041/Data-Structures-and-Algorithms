package arraysintro;
import java.util.Scanner;
public class BubbleSort {
	public static void bubbleSort(int[]arr, int n) {
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
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		BubbleSort.bubbleSort(arr, n);
        	for(int i=0;i<n;i++)
        	{
            		System.out.print(arr[i]+" ");
        	}
		
	}
}