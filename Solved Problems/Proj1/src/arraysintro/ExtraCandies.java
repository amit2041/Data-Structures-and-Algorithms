package arraysintro;
import java.util.Scanner;
public class ExtraCandies {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
	    int t= sr.nextInt();
	    while(t > 0)
	    {
    	    int n=sr.nextInt();
    	    int x = sr.nextInt();
    	    int ar1[] = new int[n];
    	    int ar2[] = new int[n];
    	    for(int i=0;i<n;i++)
    	    {
    	        ar1[i] = sr.nextInt();
    	    }
    	    
    	    for(int i=0;i<n;i++)
    	    {
    	        ar2[i] = sr.nextInt();
    	    }
    	    int answer[] = new int[n]; //creating the answer array
    	    answer = extraCandies(n, x, ar1, ar2);
    	    for(int i = 0 ;i < n ;i++)
    	    {
    	        System.out.print(answer[i]+" ");
    	    }
    	    System.out.println();
    	    t = t-1;
	    }

	}

}
