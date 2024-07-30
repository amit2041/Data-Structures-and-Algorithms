package arraysintro;
import java.util.Scanner;
public class ArrayRotation {
	
	 public static void reverse(int[] a, int start, int end) {
		 end--;
	        while (start < end) {
	            int temp = a[start];
	            a[start] = a[end];
	            a[end] = temp;
	            start++;
	            end--;
	        }
	    }

	    public static int[] rotateArray(int[] a, int x, String dir) {
	        // Write your code here.
	        int n = a.length;
	        
	        // Handle the case where x is greater than the array size

	        if (dir.equals("LEFT")) {
	            reverse(a, 0, n);
	            reverse(a, 0, n-x);
	            reverse(a, n-x, n);
	        } else if (dir.equals("RIGHT")) {
	            reverse(a, 0, n);
	            reverse(a, 0, x);
	            reverse(a, x, n);
	        }
	        return a;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sr = new Scanner(System.in);
		    int t= sr.nextInt();
		    while(t > 0)
		    {
	    	    int n=sr.nextInt();
	    	    int x = sr.nextInt();
	    	    String dir = sr.next();
	    	    int ar[] = new int[n];
	    	    for(int i = 0 ; i<n ;i++)
	    	    {
	    	        ar[i] = sr.nextInt();
	    	    }
	    	    ar = ArrayRotation.rotateArray(ar,x,dir);
	    	    int index=0;
	    	    for(int i=0;i<n;i++)
	    	    {
	    	        System.out.print(ar[i]+ " ");
	    	    }
	    	    System.out.println();
	    	
	    	    t = t-1;
		    }
		}
	}
