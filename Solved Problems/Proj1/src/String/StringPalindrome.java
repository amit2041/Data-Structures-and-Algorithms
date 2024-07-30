package String;
import java.util.Scanner;

public class StringPalindrome {
	public static boolean checkPalindrome(String str) {
		boolean isPalindrome = true;
		for(int i = 0, j=str.length()-1; i<(str.length()/2); i++, j--) {
			if(str.charAt(i)!= str.charAt(j)) {
				isPalindrome = false;
			}
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		boolean isPalindrome = checkPalindrome(str);
		System.out.println(isPalindrome);

	}

}
