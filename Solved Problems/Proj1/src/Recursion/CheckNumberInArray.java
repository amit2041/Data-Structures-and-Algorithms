package Recursion;
import java.util.Scanner;
public class CheckNumberInArray {
	public static boolean checkNumberHelper(int input[], int x, int startIndex) {
		if(startIndex == input.length) {
			return false;
		}
		if(input[startIndex]== x) {
			return true;
		}
		return checkNumberHelper(input, x, startIndex + 1);
	}
public static boolean checkNumber(int input[], int x) {
		return checkNumberHelper(input, x, 0);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int [n];
		for(int i = 0; i<n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(checkNumber(input, x));

	}

}
