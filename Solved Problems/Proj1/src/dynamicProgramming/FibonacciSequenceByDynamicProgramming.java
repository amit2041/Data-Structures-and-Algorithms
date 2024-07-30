package dynamicProgramming;
import java.util.Scanner;
public class FibonacciSequenceByDynamicProgramming {
	
	public static int FibMemoized(int n, int[]qb) { // qb = question bank
		if(n==0 || n==1) {
			return n;
		}
		
		if(qb[n] != 0) { // if qb[n] value already stored in array then this is not 0
			return qb[n]; // then return qb[n] value
		}
		System.out.println("Hello" + n);
		
		// Formula of Fibonacci Sequence -> f(n) = f(n-1)+f(n-2)
		int fibnm1 = FibMemoized(n-1, qb);
		int fibnm2 = FibMemoized(n-2, qb);
		int result = fibnm1 + fibnm2;
		qb[n] = result;
		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int fibn = FibMemoized(n, new int [n+1]);
		System.out.println(fibn);

	}

}
