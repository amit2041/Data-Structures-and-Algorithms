package recursion3;
import java.util.Scanner;
public class PrintSubsequences {
	
	public static void printSubsequencesHelper(String s, String strSoFar) {
		if(s.length()== 0) {
			System.out.println(strSoFar);
			return;
		}
		
		printSubsequencesHelper(s.substring(1), strSoFar + s.charAt(0));
		printSubsequencesHelper(s.substring(1), strSoFar);
	}
	
	public static void printSubsequences(String s) {
		printSubsequencesHelper(s, "");
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter word");
		String input = s.next();
		printSubsequences(input);
	//	printSubsequences("abc");
	}

}
