package Recursion;
import java.util.Scanner;
public class SumOfArray {
	public static int sum(int input[]) {
		return sum(input,0);
		
	}
    private static int sum(int input[],int startIndex){
        if(startIndex==input.length)
            return 0;
        int ans=input[startIndex]+sum(input,startIndex+1);
        return ans;
    }
    
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(sum(input));
	}

}
