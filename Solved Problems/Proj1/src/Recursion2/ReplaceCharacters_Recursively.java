package Recursion2;
import java.util.Scanner;
public class ReplaceCharacters_Recursively {
	public static String replaceChar(String s, char a, char b) {
		if(s.length()==0) {
			return s;
		}
		String smalloutput = replaceChar(s.substring(1), a, b);
		if(s.charAt(0)==a) {
			return b+ smalloutput;
		}
		else {
			return s.charAt(0)+ smalloutput;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String input = s.next();
		char c1 = s.next().charAt(0);
		char c2 = s.next().charAt(0);
		System.out.println(replaceChar(input, c1, c2));

	}

}
