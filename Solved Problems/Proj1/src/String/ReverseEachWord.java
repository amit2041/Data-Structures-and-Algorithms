package String;
import java.util.Scanner;
public class ReverseEachWord {
	
	private static String reverseWord(String str, int start, int end) {
		String reverse = "";

	    while (start < end) {
	        
	    	reverse = str.charAt(start) + reverse;

	        ++start;
	    }

	    return reverse;
	}

	public static String reverseEachWord(String str) {
	    int n = str.length();
	    int previousSpaceIndex = -1;

	    String ans = "";

	    int i = 0;
	    for (; i < n; i++) {
	        if (str.charAt(i) == ' ') {
	            ans += (reverseWord(str, previousSpaceIndex + 1, i) + " ");
	            previousSpaceIndex = i;
	        }
	    }

	    ans += (reverseWord(str, previousSpaceIndex + 1, i) + " ");

	    return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		String ans = reverseEachWord(str);
		System.out.println(ans);
	}

}
