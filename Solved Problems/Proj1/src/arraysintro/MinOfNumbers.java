package arraysintro;
import java.util.Scanner;
public class MinOfNumbers {

	
	public static int [] takeInput(){
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int arr[] = new int [n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter of element at" + i + "th index");
            arr[i] = s.nextInt();

        }
        return arr;
    }
       

    public static int smallest(int[] arr){
		
      int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

public static void main(String[] args)  {
    Scanner sr = new Scanner(System.in);
    int []arr = takeInput();
	int min = smallest(arr);
	System.out.println(min);
    
    //    int n=sr.nextInt();
    //  int[] arr=new int[n];
    //    for (int i =0 ; i<n;i++)
    //    {
    //        arr[i]=sr.nextInt();
     //   }
    //    System.out.println(MinOfNumbers.smallest(arr));
       
}
}