package Recursion;
import java.util.Scanner;

public class RecursionPrintReverseNumber {
	public static void printNumb(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printNumb(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printNumb(n);

	}

}
