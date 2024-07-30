package arraysintro;

public class Snippet {
	public static int[] extraCandies(int n, int x, int []p1, int []p2) {
	        // Write your code here.
	        int carry = 0;
	        int ans[] = new int[n];
	        for(int i = 0; i<n; i++){
	            int total = p1[i] + p2[i] + carry;
	            carry = 0;
	            if(total <= x){
	                ans[i] = total;
	                carry=0;
	            }else{
	                carry = total-x;
	                ans[i] = x;
	            }
	        }
	        return (ans);
	    }
}

