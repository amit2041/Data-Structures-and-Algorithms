package dynamicProgramming;
import java.util.Scanner;
import java.util.ArrayList;

public class FibonacciByMemoizationWithScanner {
		static ArrayList<Integer> dp;

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			dp = new ArrayList<>();
			for(int i = 0; i<=n; i++)
				dp.add(-1);
			int answer = fib(n);
			System.out.println("Fib: " + answer);
		}
		
		private static int fib(int n) {
			if(n<=1)
				return n;
			
			if(dp.get(n)!= -1)
				return dp.get(n);
			
			int temp = fib(n-1) + fib (n-2);
			dp.set(n, temp);
			return temp;

	}

}
