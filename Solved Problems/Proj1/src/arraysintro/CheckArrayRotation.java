package arraysintro;
import java.util.Scanner;
public class CheckArrayRotation {
	 public static int arrayRotateCheck(int[] arr){
	    	//Your code goes here
	        for(int i=0;i<arr.length-1;i++)
	        {
	            if(arr[i]>arr[i+1])
	                return i+1;
	        }
	        return 0;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
	    int t= sr.nextInt();
	    while(t > 0)
	    {
    	    int n=sr.nextInt();
    	    int ar[] = new int[n];
    	    for(int i = 0 ; i<n ;i++)
    	    {
    	        ar[i] = sr.nextInt();
    	    }
    	    int ans = CheckArrayRotation.arrayRotateCheck(ar);
    	    System.out.println(ans);
    	    t = t-1;
	    }
	}
}

