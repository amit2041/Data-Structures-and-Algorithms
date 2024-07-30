package dynamicProgramming;
import java.util.Scanner;
public class FibonacciSequences {

	public static int Fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int fibnm1 = Fib(n-1);
		int fibnm2 = Fib(n-2);
		int fibn = fibnm1+fibnm2;
		return fibn;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int fibn1 = Fib(n);
		System.out.println(fibn1);

	}

}
