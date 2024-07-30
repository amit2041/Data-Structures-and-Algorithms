package OOPS_1;
import java.util.*;
import java.util.Scanner;
public class MaximumProfitOnApp {
	public static int maximumProfit(int budget[]) {
	 Arrays.sort(budget);
     for (int i=0;i<budget.length;i++)
     {
         System.out.print(budget[i]+" ");
     }
     System.out.println();
     
     int ans=Integer.MIN_VALUE;
     int n=budget.length;
     // sort(budget,budget+n);
 	for(int i=0;i<n;i++)
 	{
     	ans=Math.max(ans,budget[i]*(n-i));
 	}
 	return ans;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++)
			input[i] = s.nextInt();
		
		System.out.println(maximumProfit(input));

	}

}
