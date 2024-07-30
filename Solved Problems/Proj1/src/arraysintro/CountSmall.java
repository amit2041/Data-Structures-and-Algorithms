package arraysintro;
import java.util.Scanner;
public class CountSmall {
	
	public static int[] countS(int n, int m, int []a, int []b) {
        // Write your code here.
        // int i, j;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<b.length;j++)
			{
				if(b[j]<=a[i])
				{
					count++;
				}
			}
			a[i]=count;
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
    	    int a[] = new int[n];
    	    for(int i = 0 ; i<n ;i++)
    	    {
    	        a[i] = sr.nextInt();
    	    }
			int m = sr.nextInt();
			int b[] =new int[m];
    	    //int index=0;
    	    for(int i=0;i<m;i++)
    	    {
    	        b[i]=sr.nextInt();
    	    }
			int ans[] = new int[n];
			ans =CountSmall.countS(n, m, a, b);
			for(int i=0;i<n;i++)
			{
				System.out.print(ans[i]+" ");
			}
    	    System.out.println();
    	
    	    t = t-1;
	    }

	}

}
