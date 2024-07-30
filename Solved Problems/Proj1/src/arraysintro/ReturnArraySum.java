package arraysintro;
import java.util.Scanner;
public class ReturnArraySum {
	
	public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        return arr;
        
    }
public static int sum(int[] arr){
    int sum=0;
		for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
		return sum;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t > 0) 
        {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i) 
            {
                arr[i] = s.nextInt();
            }
            System.out.println(ReturnArraySum.sum(arr));
            t -= 1;
        }
    }

	}
