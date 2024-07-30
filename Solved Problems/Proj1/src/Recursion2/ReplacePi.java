package Recursion2;
import java.util.Scanner;
public class ReplacePi {
	public static String replacePi(String s) {
		if(s.length()<=1) {
			return s;
		}
		if(s.charAt(0)=='p' && s.charAt(1)=='i') {
		String smalloutput = replacePi(s.substring(2));
		return "3.14" + smalloutput;
	}
		else {
			String smalloutput = replacePi(s.substring(1));
			return s.charAt(0) + smalloutput;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String k = s.nextLine();
		System.out.println(replacePi(k));

	}

}
