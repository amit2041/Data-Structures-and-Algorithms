package dynamicProgramming;
import java.util.Scanner;
import java.util.ArrayList;
public class FibonacciByTabulation {
	
	static ArrayList<Integer>dp; 

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		dp = new ArrayList<>();
		for(int i = 0; i<=n; i++)
			dp.add(-1);
		int answer = fib1(n);
		System.out.println("Fib: "+ answer);

	}
	
	private static int fib1(int n) {
		dp.set(0, 0);
		dp.set(1, 1);
		for(int i =2; i<=n; i++) {
			dp.set(i, dp.get(i-1)+dp.get(i-2));
	}
	return dp.get(n);
	}
}
