package arraysintro;
import java.util.Scanner;
public class ReverseArrayBetween2Index {
	
	public static void swap(int[]arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    public static int[]reverseBetween (int n, int l, int r, int []arr) {
        // Write your code from here.
        
        int len = (r-l)/2;
        for(int i =0; i<=len; i++){
            swap(arr,l,r);
            l++;
            i--;
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
	    int t= sr.nextInt();
	    while(t > 0)
	    {
    	    int n=sr.nextInt();
    	    int ar[] = new int[n];
    	    int l = sr.nextInt();
    	    int r = sr.nextInt();
    	    for(int i = 0 ; i<n ;i++)
    	    {
    	        ar[i] = sr.nextInt();
    	    }
    	    ar = ReverseArrayBetween2Index.reverseBetween(n, l, r, ar);
    	    for(int i = 0 ;i < n ;i++)
    	    {
    	        System.out.print(ar[i]+" ");
    	    }
    	    System.out.println();
    	    t = t-1;
	    }

	}

}
