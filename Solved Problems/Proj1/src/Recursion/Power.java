package Recursion;
import java.util.Scanner;
public class Power {
	public static int power(int x, int n) {
		if(x==0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		int smalloutput = power(x, n-1);
		int output = x * smalloutput;
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		System.out.println(power(x, n));

	}

}
