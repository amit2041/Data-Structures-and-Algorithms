package arraysintro;
import java.util.Scanner;
public class MoveAllNegativeNumbers {
	
	public static int[] separateNegativeAndPositive(int a[]) {

        int nonZero = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i]<0){
                int temp = a[i];
                a[i] = a[nonZero];
                a[nonZero] = temp;
                nonZero++;
            }
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
	    	    int ar[] = new int[n];
	    	    for(int i = 0 ; i<n ;i++)
	    	    {
	    	        ar[i] = sr.nextInt();
	    	    }
	    	    ar = MoveAllNegativeNumbers.separateNegativeAndPositive(ar);
	    	    int index=-1;
	    	    for(int i=0;i<n;i++)
	    	    {
	    	        if(ar[i]>=0)
	    	        {
	    	            index = i;
	    	            break;
	    	        }
	    	    }
	            if(index ==-1)
	            {
	                System.out.print("Yes");
	            }
	            else
	            {
	                int flag=0;
	                for(int i= index+1;i<n;i++)
	                {
	                    if(ar[i]<0)
	                    {
	                        flag=1;
	                        break;
	                    }
	                }
	                if(flag==0)
	                    System.out.println("Yes");
	                else
	                    System.out.println("No");
	            }
	            
	    	    t = t-1;
		    }

	}

}
