package arraysintro;
import java.util.Scanner;
public class MergeTwoSortedArray {
	 public static int[] merge(int arr1[], int arr2[]) {
	    	//Your code goes here
	        int mergearray[]=new int[arr1.length+arr2.length];
	        int i=0;
	        int j=0;
	        int k=0;
	        while(i<arr1.length && j<arr2.length){
	          if(arr1[i]<arr2[j])
	          {
	              mergearray[k]=arr1[i];
	              k++;
	              i++;
	          }
	            else{
	              mergearray[k]=arr2[j];
	              k++;
	              j++;
	            }
	        }
	        while(i<arr1.length)
	        {
	            mergearray[k]=arr1[i];
	            k++;
	            i++;        
	        
	        }
	        while(j<arr2.length)
	        {
	         mergearray[k]=arr2[j];
	            k++;
	            j++;    
	        }
	        return mergearray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
		    int n = sc.nextInt();
		    int[] arr1 = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr1[i] = sc.nextInt();
		    }
		    int m = sc.nextInt();
		    int[] arr2 = new int[m];
		    for(int i=0;i<m;i++)
		    {
		        arr2[i] = sc.nextInt();
		    }
		    int[] ans = new int[m+n];
		    ans = MergeTwoSortedArray.merge(arr1, arr2);
            for(int i=0;i<m+n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
            t-=1;
		}

	}

}
