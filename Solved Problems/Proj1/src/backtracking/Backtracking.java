package backtracking;
import java.util.Scanner;
public class Backtracking {
	
	public static void printPermutation(String str, String prem, int idx) {
		if(str.length() == 0) {
			System.out.println(prem); //prem = permutation
			return;
		}
		for(int i = 0; i<str.length(); i++) {
		char currChar = str.charAt(i);  // currChar = current character, which is at first position
		String newStr = str.substring(0, i) + str.substring(i+1);
		printPermutation(newStr, prem + currChar, idx+1);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		// str = "ABC";
		printPermutation(str, "", 0);

	}

}
