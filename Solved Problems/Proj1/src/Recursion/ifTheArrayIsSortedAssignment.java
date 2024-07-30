package Recursion;
import java.util.Scanner;
public class ifTheArrayIsSortedAssignment {
	 public static boolean arraySortedOrNot(int []A, int N) {
	        // Write your code here.
	        // if(N==1||N==0){
	        //     return true;
	        // }
	        // if(A[N-1]<A[N-2]){
	        //     return false;
	        // }
	        
	        // return arraySortedOrNot(A,N-1);

	        for(int i=0;i<A.length-1;i++)
	        {
	            if(A[i]>A[i+1])
	            return false;
	        }

	        return true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int A = s.nextInt();
		int N = s.nextInt();
		}

}
