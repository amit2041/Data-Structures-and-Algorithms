package arraysintro;
import java.util.Scanner;
public class PairSum {
	public static int pairSum(int arr[], int x) {
        int sum = 0;
        
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == x){
                    sum+=1;
                }
            }
        }
        return sum;
    }
	
	public static void main(String[] args) 
    {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while(t > 0) 
        {
            int n=sr.nextInt();
            int[] arr=new int[n];
            for (int i =0 ; i<n;i++)
            {
                arr[i]=sr.nextInt();
            }
            int x =sr.nextInt();
            System.out.println((PairSum. pairSum(arr,x)));
            
            t -= 1;
        }
    }
}