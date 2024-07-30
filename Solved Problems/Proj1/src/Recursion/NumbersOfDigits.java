package Recursion;
import java.util.Scanner;
public class NumbersOfDigits {
	public static int count(int n) {
		if(n==0) {
			return 0;
		}
		int smalloutput = count(n/10);
		int output = smalloutput + 1;
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		System.out.println(count(n));

	}

}
