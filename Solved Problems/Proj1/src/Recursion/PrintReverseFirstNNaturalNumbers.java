package Recursion;

import java.util.Scanner;

public class PrintReverseFirstNNaturalNumbers {
	public static void printReverse(int n) {
		if(n==0) {
			return;
		}
		System.out.print(n + " ");
		printReverse(n-1);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		printReverse(n);

	}

}
