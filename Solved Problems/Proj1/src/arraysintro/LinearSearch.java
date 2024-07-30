package arraysintro;
import java.util.Scanner;

public class LinearSearch {
	public static int linearSearch(int[] arr, int val){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == val){    
                return i;    
            }    
        }    
        return -1;    
    }

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
	    int t = sr.nextInt();
	    while(t > 0) 
	    {
	        int size = sr.nextInt();
	        int[] input = new int[size];
	        for (int i = 0; i < size; ++i) 
	        {
	            input[i] = sr.nextInt();
	        }
	        int val = sr.nextInt();
	        System.out.println(linearSearch(input,val));
	        t -= 1;
	    }
	}
	}
