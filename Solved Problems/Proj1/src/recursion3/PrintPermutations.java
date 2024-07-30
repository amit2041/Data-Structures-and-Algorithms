package recursion3;
import java.util.Scanner;
public class PrintPermutations {
	
	public static void printPermutationsHelper(String s, String stringSoFar) {
		if(s.length() == 0) {
			System.out.println(stringSoFar);
			return;
		}
		for(int i = 0; i<s.length(); i++) {
		String smallerString = s.substring(0, i) + s.substring(i+1);
		
		printPermutationsHelper(smallerString, stringSoFar + s.charAt(i));
		}
		
	}
	
	public static void printPermutations(String s) {
		printPermutationsHelper(s, "");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		printPermutations(str);
	}

}
